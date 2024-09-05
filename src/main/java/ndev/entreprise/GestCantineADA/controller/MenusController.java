package ndev.entreprise.GestCantineADA.controller;

import lombok.RequiredArgsConstructor;
import ndev.entreprise.GestCantineADA.models.Menu;
import ndev.entreprise.GestCantineADA.service.MenuService;
import ndev.entreprise.GestCantineADA.service.PlatService;
import ndev.entreprise.GestCantineADA.service.dto.MenuDTO;
import ndev.entreprise.GestCantineADA.service.mapper.MenuMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.Format;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

@Controller
@RequestMapping("menu")
@RequiredArgsConstructor
public class MenusController {

    private final PlatService platService;
    private final MenuService menuService;
    private final MenuMapper menuMapper;

    @GetMapping
    public String showMenuPage(Model model) {
        model.addAttribute("menus" , menuService.findAll());
        return "/menu/menus";
    }

    @GetMapping("add")
    public String showAddMenu(Model model) {
        model.addAttribute("plats", platService.findAll());
        model.addAttribute("menu", new Menu());
        return "/menu/formsMenu";
    }

    @GetMapping("update/{id}")
    public String showUpdateMenu(Model model, @PathVariable Long id) {
        Optional<MenuDTO> menu = menuService.findById(id);
        model.addAttribute("menu", menu.orElse(null));
        return "/menu/formsMenu";
    }

    @PostMapping("save")
    public String saveMenu(Menu menu) {
        menu.setCreationDate(Date.from(Instant.now()).toInstant());
       menuService.save(menuMapper.toDto(menu));
       return "redirect:/menu";
    }

    @PostMapping
    public String deleteMenu(Long id) {
        menuService.delete(id);
        return "redirect:/menu";
    }


}
