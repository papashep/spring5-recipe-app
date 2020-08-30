package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Melvyn on 26/Aug/2020
 */

@Data
@EqualsAndHashCode(exclude = {"recipes"})           // Excludes the 'recipes' property from the Equals and Hash code
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
