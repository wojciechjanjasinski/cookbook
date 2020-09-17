package cb.cookbook.modell;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal amount;
    private String unitName;
    private boolean alreadyGot;

    @ManyToOne
    private Recipe recipe;
}
