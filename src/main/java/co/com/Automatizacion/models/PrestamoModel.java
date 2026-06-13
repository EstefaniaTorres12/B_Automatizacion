package co.com.Automatizacion.models;

import java.util.Map;

public class PrestamoModel {

    private String usuario;
    private String libro;
    private String fechaDevolucion;

    public PrestamoModel(String usuario,
                         String libro,
                         String fechaDevolucion) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaDevolucion = fechaDevolucion;
    }

    public static PrestamoModel desde(Map<String, String> datos) {
        return new PrestamoModel(
                datos.get("usuario"),
                datos.get("libro"),
                datos.get("fechaDevolucion")
        );
    }

    public String getUsuario() {
        return usuario;
    }

    public String getLibro() {
        return libro;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }
}