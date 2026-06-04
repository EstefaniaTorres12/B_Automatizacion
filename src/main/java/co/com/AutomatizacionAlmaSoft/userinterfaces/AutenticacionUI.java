package co.com.AutomatizacionAlmaSoft.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class AutenticacionUI extends PageObject {

    public static final Target BTN_ABRIR_LOGIN = Target.the("Boton abrir formulario login")
            .located(By.xpath("//a[@href='/pages/IniciarSesion']"));

    public static final Target INPUT_USUARIO =
            Target.the("Ingreso del usuario")
                    .located(By.name("usuario_correo"));

    public static final Target INPUT_CREDENCIAL =
            Target.the("Ingreso de la contraseña")
                    .located(By.name("usuario_credencial"));

    public static final Target BTN_INICIOSESION = Target.the("Boton enviar login")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target MENSAJE_LOGIN =
            Target.the("Mensaje de login exitoso")
                    .located(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
}