package ee.katriin.proovikontrolltoo;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Toit {
    @Id
    private String nimetus;
    @OneToMany
    private List<Toidukomponent> toidukomponendid;
}
