package ndev.entreprise.GestCantineADA.service.mapper;

import ndev.entreprise.GestCantineADA.models.Menu;
import ndev.entreprise.GestCantineADA.service.dto.MenuDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface MenuMapper extends EntityMapper<MenuDTO , Menu>{
}
