package co.com.Automatizacion.models;

import java.util.Map;

public class RegistroUsuarioModel {

    private String nombre;
    private String email;
    private String password;
    private String telefono;

    public RegistroUsuarioModel(String nombre, String email,
                                String password, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
    }

    public static RegistroUsuarioModel desde(Map<String, String> datos) {
        return new RegistroUsuarioModel(
                datos.get("nombre"),
                datos.get("email"),
                datos.get("password"),
                datos.get("telefono")
        );
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelefono() {
        return telefono;
    }
}