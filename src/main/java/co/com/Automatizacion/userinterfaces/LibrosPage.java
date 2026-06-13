package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LibrosPage {

    public static final Target BTN_LIBROS =
            Target.the("modulo libros")
                    .locatedBy("//button[contains(.,'Libros')]");

    public static final Target BTN_REGISTRAR_LIBRO =
            Target.the("registrar libro")
                    .locatedBy("//button[contains(.,'Registrar Libro')]");

    public static final Target CAMPO_TITULO =
            Target.the("campo titulo")
                    .locatedBy("//label[contains(.,'Título')]/following::input[1]");

    public static final Target CAMPO_AUTOR =
            Target.the("campo autor")
                    .locatedBy("//label[contains(.,'Autor')]/following::input[1]");

    public static final Target CAMPO_ISBN =
            Target.the("campo isbn")
                    .locatedBy("//label[contains(.,'ISBN')]/following::input[1]");

    public static final Target CAMPO_CANTIDAD =
            Target.the("campo cantidad")
                    .locatedBy("//input[@type='number']");

    public static final Target BTN_GUARDAR =
            Target.the("boton guardar")
                    .locatedBy("//button[contains(.,'Guardar')]");

    public static final Target MENSAJE_EXITO =
            Target.the("mensaje exito")
                    .locatedBy("//*[contains(text(),'Libro registrado correctamente')]");
}