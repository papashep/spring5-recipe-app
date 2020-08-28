package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Melvyn on 28/Aug/2020
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
