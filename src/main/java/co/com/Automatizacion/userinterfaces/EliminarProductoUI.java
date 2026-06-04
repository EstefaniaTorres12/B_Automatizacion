package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarProductoUI {

    public static final Target BTN_ELIMINAR_PRODUCTO =
            Target.the("boton eliminar producto")
                    .located(By.id("remove-sauce-labs-fleece-jacket"));

    public static final Target TXT_CARRITO_VACIO =
            Target.the("carrito vacio")
                    .located(By.xpath("//div[@class='cart_item']"));
}