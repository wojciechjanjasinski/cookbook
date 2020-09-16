package cb.cookbook.modell;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient {

    @Id
    private Long id;
    private String name;
    private boolean alreadyGot;

    @ManyToOne
    private Recipe recipe;
}
