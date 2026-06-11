package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrestamosActivosPage {

    public static final Target BTN_IR_A_PRESTAMOS =
            Target.the("boton ir a prestamos")
                    .locatedBy("//button[contains(.,'Ir a Préstamos')]");

    public static final Target TITULO_PRESTAMOS_ACTIVOS =
            Target.the("titulo prestamos activos")
                    .locatedBy("//*[contains(text(),'Préstamos activos')]");
}