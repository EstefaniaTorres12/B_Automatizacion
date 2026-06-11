package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target CAMPO_EMAIL =
            Target.the("campo email")
                    .locatedBy("//input[@type='email']");

    public static final Target CAMPO_PASSWORD =
            Target.the("campo contraseña")
                    .locatedBy("//input[@type='password']");

    public static final Target BOTON_INGRESAR =
            Target.the("boton ingresar")
                    .locatedBy("//button[contains(.,'Ingresar')]");

}