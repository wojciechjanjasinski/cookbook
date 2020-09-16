package cb.cookbook.modell;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private FoodCategory foodCategory;
    private boolean iLikeIt;
    private DifficultyLevel difficultyLevel;
    private Integer time;

    @OneToMany(mappedBy = "recipe")
    List<Ingredient> ingredientsList;

    @OneToMany(mappedBy = "recipe")
    List<Step> stepsList;
}
// klucz obcy zostanie umieszczony tutaj