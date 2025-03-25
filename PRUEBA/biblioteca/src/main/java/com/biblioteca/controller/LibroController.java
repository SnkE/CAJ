package com.biblioteca.controller;

import com.biblioteca.model.Libro;
import com.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public String listarLibros(@RequestParam(required = false) String titulo,
                              @RequestParam(required = false) String autor,
                              Model model) {
        List<Libro> libros;
        if (titulo != null || autor != null) {
            libros = libroService.findByTituloAndAutor(titulo != null ? titulo : "", autor != null ? autor : "");
        } else {
            libros = libroService.findAll();
        }
        model.addAttribute("libros", libros);
        return "libros";
    }
}