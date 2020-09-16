package cb.cookbook.modell;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FoodCategory foodCategory;

    private boolean iLikeIt;

    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficultyLevel;

    private Integer time;

    @OneToMany(mappedBy = "recipe")
    List<Ingredient> ingredientsList;

    @OneToMany(mappedBy = "recipe")
    List<Step> stepsList;
}
// klucz obcy zostanie umieszczony tutaj