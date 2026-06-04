package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class AutenticacionUI extends PageObject {

    public static final Target INPUT_USUARIO =
            Target.the("Ingreso del usuario")
                    .located(By.name("user-name"));

    public static final Target INPUT_CREDENCIAL =
            Target.the("Ingreso de la contraseña")
                    .located(By.name("password"));

    public static final Target BTN_INICIOSESION = Target.the("Boton enviar login")
            .located(By.name("login-button"));

    public static final Target MENSAJE_LOGIN =
            Target.the("Mensaje de login exitoso")
                    .located(By.className("app_logo"));
}