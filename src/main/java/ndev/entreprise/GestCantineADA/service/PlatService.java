package ndev.entreprise.GestCantineADA.service;

import ndev.entreprise.GestCantineADA.service.dto.MenuDTO;
import ndev.entreprise.GestCantineADA.service.dto.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    PlatDTO save(PlatDTO platDTO);
    List<PlatDTO> findAll();
    Optional<PlatDTO> findById(Long id);
    void delete(Long id);
}
