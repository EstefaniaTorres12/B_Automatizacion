package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioPage {

    public static final Target BTN_REGISTRAR_USUARIO =
            Target.the("boton registrar usuario")
                    .locatedBy("//button[contains(.,'Registrar Usuario')]");

    public static final Target CAMPO_NOMBRE =
            Target.the("campo nombre")
                    .locatedBy("//input[@type='text'][1]");

    public static final Target CAMPO_EMAIL =
            Target.the("campo email")
                    .locatedBy("//input[@type='email']");

    public static final Target CAMPO_PASSWORD =
            Target.the("campo password")
                    .locatedBy("//input[@type='password']");

    public static final Target CAMPO_TELEFONO =
            Target.the("campo telefono")
                    .locatedBy("//label[contains(.,'Teléfono')]/following::input[1]");

    public static final Target BTN_GUARDAR =
            Target.the("boton guardar")
                    .locatedBy("//button[contains(.,'Guardar')]");

    public static final Target MENSAJE_EXITO =
            Target.the("mensaje de exito")
                    .locatedBy("//*[contains(text(),'Usuario registrado correctamente')]");

    public static final Target MENSAJE_ERROR =
            Target.the("mensaje de error")
                    .locatedBy("//*[contains(text(),'Ya existe un usuario con ese correo')]");
}