package ndev.entreprise.GestCantineADA.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "menu")
public class Menu {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "creation_date" , nullable = false)
    private Instant creationDate;

    @OneToOne(fetch = FetchType.EAGER)
    private Plat plat;
}
