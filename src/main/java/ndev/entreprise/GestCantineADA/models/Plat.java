package ndev.entreprise.GestCantineADA.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "plat")
public class Plat {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(length = 255)
    private String summary;
}
