package ndev.entreprise.GestCantineADA.repository;

import ndev.entreprise.GestCantineADA.models.Plat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatRepository extends JpaRepository<Plat, Long> {
}
