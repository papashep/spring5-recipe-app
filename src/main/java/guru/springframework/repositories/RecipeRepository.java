package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Melvyn on 26/Aug/2020
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
