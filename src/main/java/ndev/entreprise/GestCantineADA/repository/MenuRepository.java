package ndev.entreprise.GestCantineADA.repository;

import ndev.entreprise.GestCantineADA.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
