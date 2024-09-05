package ndev.entreprise.GestCantineADA.service.impl;

import lombok.RequiredArgsConstructor;
import ndev.entreprise.GestCantineADA.repository.MenuRepository;
import ndev.entreprise.GestCantineADA.service.MenuService;
import ndev.entreprise.GestCantineADA.service.dto.MenuDTO;
import ndev.entreprise.GestCantineADA.service.mapper.MenuMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    private final MenuMapper menuMapper;

    @Override
    public MenuDTO save(MenuDTO menuDTO) {
        return menuMapper.toDto(menuRepository.save(menuMapper.toEntity(menuDTO)));
    }

    @Override
    public List<MenuDTO> findAll() {
        return menuRepository.findAll().stream().map(menuMapper::toDto).toList();
    }

    @Override
    public Optional<MenuDTO> findById(Long id) {
        return menuRepository.findById(id).map( menuMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        menuRepository.deleteById(id);
    }
}
