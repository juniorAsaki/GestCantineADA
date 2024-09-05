package ndev.entreprise.GestCantineADA.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
public class MenuDTO {

    private Long id;

    private Instant creation_date;

    private PlatDTO plat;
}
