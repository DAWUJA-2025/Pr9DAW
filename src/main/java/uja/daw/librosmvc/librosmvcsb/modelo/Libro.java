package uja.daw.librosmvc.librosmvcsb.modelo;

import jakarta.validation.constraints.NotBlank;

public class Libro {

    @NotBlank(message = "El ISBN no puede estar vacío")
    private String isbn;

    @NotBlank(message = "El título no puede estar vacío")
    private String titulo;

    public Libro() {
    }

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

