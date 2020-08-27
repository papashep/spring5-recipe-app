package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Melvyn on 26/Aug/2020
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
