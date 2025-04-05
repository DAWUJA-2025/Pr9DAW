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
        return new ArrayList<>(libros); // Para evitar modificar la lista original
    }
}
