package co.com.Automatizacion.models;

import java.util.Map;

public class LibroModel {

    private String titulo;
    private String autor;
    private String isbn;
    private String cantidad;

    public LibroModel(String titulo, String autor,
                      String isbn, String cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.cantidad = cantidad;
    }

    public static LibroModel desde(Map<String, String> datos) {
        return new LibroModel(
                datos.get("titulo"),
                datos.get("autor"),
                datos.get("isbn"),
                datos.get("cantidad")
        );
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCantidad() {
        return cantidad;
    }
}