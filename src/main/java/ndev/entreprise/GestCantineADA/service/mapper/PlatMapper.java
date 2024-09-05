package ndev.entreprise.GestCantineADA.service.mapper;

import ndev.entreprise.GestCantineADA.models.Plat;
import ndev.entreprise.GestCantineADA.service.dto.PlatDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlatMapper extends EntityMapper<PlatDTO , Plat>{
}
