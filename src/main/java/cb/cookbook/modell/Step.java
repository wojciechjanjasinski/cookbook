package cb.cookbook.modell;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Step {

    @Id
    private Long id;
    private String description;

    @ManyToOne
    private Recipe recipe;
}
