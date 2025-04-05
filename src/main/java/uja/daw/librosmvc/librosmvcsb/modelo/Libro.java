package uja.daw.librosmvc.librosmvcsb.modelo;

public class Libro {

    private String isbn;
    private String titulo;

    // Constructor vacío (requerido para el binding del formulario)
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }

    // Getters y Setters
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
