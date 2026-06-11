package co.com.Automatizacion.models;

import java.util.Map;

public class CredencialesIniciarSesion {
    private String email;
    private String password;

    public CredencialesIniciarSesion(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static CredencialesIniciarSesion desde(Map<String, String> datos) {
        return new CredencialesIniciarSesion(
                datos.get("email"),
                datos.get("password")
        );
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
