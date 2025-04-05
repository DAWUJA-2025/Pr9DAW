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

    // Otros métodos del DAO...
}

