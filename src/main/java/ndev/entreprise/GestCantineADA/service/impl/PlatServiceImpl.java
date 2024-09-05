package ndev.entreprise.GestCantineADA.service.impl;

import lombok.RequiredArgsConstructor;
import ndev.entreprise.GestCantineADA.repository.PlatRepository;
import ndev.entreprise.GestCantineADA.service.PlatService;
import ndev.entreprise.GestCantineADA.service.dto.PlatDTO;
import ndev.entreprise.GestCantineADA.service.mapper.PlatMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;

    private final PlatMapper platMapper;

    @Override
    public PlatDTO save(PlatDTO platDTO) {
        return platMapper.toDto(platRepository.save(platMapper.toEntity(platDTO)));
    }

    @Override
    public List<PlatDTO> findAll() {
        return platRepository.findAll().stream().map(platMapper::toDto).toList();
    }

    @Override
    public Optional<PlatDTO> findById(Long id) {
        return platRepository.findById(id).map(platMapper::toDto);
    }


    @Override
    public void delete(Long id) {
        platRepository.deleteById(id);
    }
}
