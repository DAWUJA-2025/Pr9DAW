package uja.daw.librosmvc.librosmvcsb.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import uja.daw.librosmvc.librosmvcsb.modelo.Libro;

import java.util.List;

@Repository("librosDAOJpa")
@Transactional
public class LibrosDAOJpa implements LibrosDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void crea(Libro libro) {
        em.persist(libro);
    }

    @Override
    public List<Libro> buscaTodos() {
        return em.createQuery("SELECT l FROM Libro l", Libro.class).getResultList();
    }

    @Override
    public void borra(String isbn) {
        // Se asume que el ISBN es la clave primaria
        Libro libro = em.find(Libro.class, isbn);
        if(libro != null) {
            em.remove(libro);
        }
    }

    @Override
    public Libro buscaPorIsbn(String isbn) {
        return em.find(Libro.class, isbn);
    }

    @Override
    public void actualiza(Libro libro) {
        em.merge(libro);
    }
}