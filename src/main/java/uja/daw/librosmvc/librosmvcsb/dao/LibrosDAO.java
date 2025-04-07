package uja.daw.librosmvc.librosmvcsb.dao;

import uja.daw.librosmvc.librosmvcsb.modelo.Libro;
import java.util.List;

public interface LibrosDAO {
    void crea(Libro libro);
    List<Libro> buscaTodos();

    void borra(String isbn);
    Libro buscaPorIsbn(String isbn);
    void actualiza(Libro libro);
}
