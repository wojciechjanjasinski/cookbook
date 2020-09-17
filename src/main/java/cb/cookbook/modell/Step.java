package cb.cookbook.modell;

import javax.persistence.*;

@Entity
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToOne
    private Recipe recipe;
}
