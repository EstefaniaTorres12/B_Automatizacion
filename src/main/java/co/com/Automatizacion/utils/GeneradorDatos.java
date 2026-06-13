package co.com.Automatizacion.utils;

public class GeneradorDatos {

    private static int consecutivo = 1;

    public static String generarNombre() {
        return "Usuario" + System.currentTimeMillis();
    }

    public static String generarEmail() {
        return "usuario" + System.currentTimeMillis() + "@test.com";
    }

    public static String generarTituloLibro() {
        return "Libro_" + System.currentTimeMillis();
    }

    public static String generarISBN() {
        return String.valueOf(System.currentTimeMillis());
    }
}