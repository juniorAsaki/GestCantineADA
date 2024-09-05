package ndev.entreprise.GestCantineADA.service;

import ndev.entreprise.GestCantineADA.service.dto.MenuDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {

    MenuDTO save(MenuDTO menuDTO);
    List<MenuDTO> findAll();
    Optional<MenuDTO> findById(Long id);
    void delete(Long id);

}
