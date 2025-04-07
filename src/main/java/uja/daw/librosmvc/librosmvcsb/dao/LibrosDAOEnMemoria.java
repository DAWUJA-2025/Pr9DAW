package uja.daw.librosmvc.librosmvcsb.dao;

import org.springframework.stereotype.Repository;
import uja.daw.librosmvc.librosmvcsb.modelo.Libro;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibrosDAOEnMemoria implements LibrosDAO {

    private final List<Libro> libros = new ArrayList<>();

    @Override
    public void crea(Libro libro) {
        libros.add(libro);
    }

    @Override
    public List<Libro> buscaTodos() {
        return new ArrayList<>(libros);
    }

    @Override
    public void borra(String isbn) {
        libros.removeIf(libro -> libro.getIsbn().equals(isbn));
    }

    @Override
    public Libro buscaPorIsbn(String isbn) {
        return libros.stream()
                .filter(libro -> libro.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualiza(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(libro.getIsbn())) {
                libros.set(i, libro);
                return;
            }
        }
    }
}