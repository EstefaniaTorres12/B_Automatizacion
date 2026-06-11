package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrestamosPorUsuarioPage {

    public static final Target BTN_IR_A_USUARIOS =
            Target.the("boton ir a usuarios")
                    .locatedBy("//button[contains(.,'Ir a Usuarios')]");

    public static final Target BTN_VER_PRESTAMOS =
            Target.the("ver prestamos")
                    .locatedBy("(//button[contains(.,'Ver Préstamos')])[3]");

    public static final Target MODAL_PRESTAMOS_USUARIO =
            Target.the("modal prestamos usuario")
                    .locatedBy("//*[contains(text(),'Préstamos de')]");

}