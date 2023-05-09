package ee.katriin.proovikontrolltoo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToitRepository extends JpaRepository<Toit, String> {
}  // siin viimasena on String sest id panime stringiga mitte longiga
