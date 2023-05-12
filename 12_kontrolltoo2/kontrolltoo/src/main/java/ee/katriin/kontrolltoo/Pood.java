package ee.katriin.kontrolltoo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pood {
    private int id;
    private String nimetus;
    private List<Toode> tooted;

}
