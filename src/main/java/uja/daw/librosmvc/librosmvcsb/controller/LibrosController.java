package uja.daw.librosmvc.librosmvcsb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import uja.daw.librosmvc.librosmvcsb.dao.LibrosDAO;
import uja.daw.librosmvc.librosmvcsb.modelo.Libro;

@Controller
@RequestMapping("/libros")
public class LibrosController {

    @Autowired
    private LibrosDAO librosDAO;

    @GetMapping("")
    public String listado(ModelMap model) {
        model.addAttribute("libros", librosDAO.buscaTodos());
        return "libros/index";
    }

    @PostMapping("")
    public String altaLibro(
            @RequestParam(value = "isbn") String isbn,
            @RequestParam(value = "titulo") String titulo) {

        librosDAO.crea(new Libro(isbn, titulo));
        return "redirect:/libros";
    }
}


