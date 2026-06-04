package co.com.AutomatizacionAlmaSoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutUI {

    public static final Target BTN_CHECKOUT =
            Target.the("boton checkout")
                    .located(By.id("checkout"));

    public static final Target INPUT_NOMBRE =
            Target.the("campo nombre")
                    .located(By.id("first-name"));

    public static final Target INPUT_APELLIDO =
            Target.the("campo apellido")
                    .located(By.id("last-name"));

    public static final Target INPUT_POSTAL =
            Target.the("campo codigo postal")
                    .located(By.id("postal-code"));

    public static final Target BTN_CONTINUE =
            Target.the("boton continuar")
                    .located(By.id("continue"));

    public static final Target TXT_INFORMACION_COMPRA =
            Target.the("titulo checkout")
                    .located(By.className("title"));
}