package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalizarCompraUI {

    public static final Target BTN_FINISH =
            Target.the("boton finalizar compra")
                    .located(By.id("finish"));

    public static final Target TXT_MENSAJE_COMPRA_EXITOSA =
            Target.the("mensaje de compra exitosa")
                    .located(By.className("complete-header"));
}