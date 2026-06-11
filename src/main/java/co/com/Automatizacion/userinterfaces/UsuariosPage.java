package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class UsuariosPage {

    public static final Target BTN_USUARIOS =
            Target.the("modulo usuarios")
                    .locatedBy("//button[contains(.,'Usuarios')]");
}