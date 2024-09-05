package ndev.entreprise.GestCantineADA.controller;


import lombok.RequiredArgsConstructor;
import ndev.entreprise.GestCantineADA.models.Menu;
import ndev.entreprise.GestCantineADA.models.Plat;
import ndev.entreprise.GestCantineADA.service.PlatService;
import ndev.entreprise.GestCantineADA.service.dto.PlatDTO;
import ndev.entreprise.GestCantineADA.service.mapper.PlatMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("plat")
@RequiredArgsConstructor
public class PlatsController {

    private final PlatService platService;
    private final PlatMapper platMapper;

    @GetMapping
    public String showPlatPage(Model model) {
        model.addAttribute("plats", platService.findAll());
        return "/plat/plats";
    }

    @GetMapping("add")
    public String showAddPlat(Model model) {
        model.addAttribute("plat", new PlatDTO());
        return "/plat/formsPlat";
    }

    @GetMapping("update/{id}")
    public String showUpdatePlat(Model model, @PathVariable Long id) {
        Optional<PlatDTO> plat = platService.findById(id);
        plat.ifPresent(platDTO -> model.addAttribute("plat", platDTO));
        return "/plat/formsPlat";
    }

    @PostMapping("save")
    public String savePlat(PlatDTO platDTO) {
        platService.save(platDTO);
        return "redirect:/plat";
    }

    @PostMapping("delete/{id}")
    public String deletePlat(@PathVariable Long id) {
        platService.delete(id);
        return "redirect:/plat";
    }
}
