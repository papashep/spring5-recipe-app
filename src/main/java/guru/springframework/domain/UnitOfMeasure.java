package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Melvyn on 26/Aug/2020
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

}
