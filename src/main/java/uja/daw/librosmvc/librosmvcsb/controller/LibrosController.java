package uja.daw.librosmvc.librosmvcsb.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import uja.daw.librosmvc.librosmvcsb.dao.LibrosDAO;
import uja.daw.librosmvc.librosmvcsb.modelo.Libro;

@Controller
@RequestMapping("/libros")
public class LibrosController {

    @Autowired
    @Qualifier("librosDAOJpa")  // Especifica que se usará la implementación JPA
    private LibrosDAO librosDAO;

    @GetMapping("")
    public String listado(ModelMap model) {
        model.addAttribute("libros", librosDAO.buscaTodos());
        model.addAttribute("libro", new Libro()); // Para el formulario
        return "libros/index";
    }

    @PostMapping("")
    public String altaLibro(
            @Valid @ModelAttribute("libro") Libro libro,
            BindingResult result,
            ModelMap model) {

        if (result.hasErrors()) {
            model.addAttribute("libros", librosDAO.buscaTodos());
            return "libros/index";
        }

        librosDAO.crea(libro);
        return "redirect:/libros";
    }
}
