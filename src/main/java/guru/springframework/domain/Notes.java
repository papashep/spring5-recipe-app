package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by Melvyn on 26/Aug/2020
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})           // Excludes the 'recipes' property from the Equals and Hash code
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob        // JPA will store it in a 'clob' field in the database, overcomes the 255 character limit
    private String recipeNotes;

    public Notes () {
    }

}
