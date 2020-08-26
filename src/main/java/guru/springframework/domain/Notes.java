package guru.springframework.domain;

import javax.persistence.*;

/**
 * Created by Melvyn on 26/Aug/2020
 */
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob        // JPA will store it in a 'clob' field in the database, overcomes the 255 character limit
    private String recipeNotes;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public Recipe getRecipe () {
        return recipe;
    }

    public void setRecipe (Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes () {
        return recipeNotes;
    }

    public void setRecipeNotes (String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
