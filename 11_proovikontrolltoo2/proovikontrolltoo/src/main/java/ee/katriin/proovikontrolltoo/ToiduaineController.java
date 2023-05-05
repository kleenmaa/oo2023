package ee.katriin.proovikontrolltoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToiduaineController {

    @Autowired
    ToiduaineRepository toiduaineRepository;

    @Autowired
    ToidukomponentRepository toidukomponentRepository;

    // localhost:8080/lisa-toidukomponent?id=1&toiduaineId=1&kogus=100
    @GetMapping("lisa-toidukomponent")
    public List<Toidukomponent> lisaToidukomponent(
            @RequestParam Long id,
            @RequestParam Long toiduaineId,
            @RequestParam int kogus
    ) {
        Toiduaine toiduaine = toiduaineRepository.findById(toiduaineId).get();
        toidukomponentRepository.save(new Toidukomponent(id,toiduaine, kogus));
        return toidukomponentRepository.findAll();
    }

    //localhost:8080/lisa-toiduained?id=1&nimetus=kartul&valk=5&rasv=2&sysivesik=93

    @GetMapping("lisa-toiduaine")
    public List<Toiduaine> lisaToiduaine(
            @RequestParam Long id,
            @RequestParam String nimetus,
            @RequestParam int valk,
            @RequestParam int rasv,
            @RequestParam int sysivesik

    ) throws Exception {
        if (valk + rasv + sysivesik > 100) {
            throw new Exception("Protsent ei saa olla üle saja!");
        }
        toiduaineRepository.save(new Toiduaine(id, nimetus, valk, rasv, sysivesik));
        return toiduaineRepository.findAll();
    }
}
