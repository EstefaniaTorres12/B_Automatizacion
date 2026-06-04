package co.com.AutomatizacionAlmaSoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarProductoCarritoUI {

    public  static final Target BTN_AGREGAR_CHAQUETA=
            Target.the("boton add to cart")
                    .located(By.name("add-to-cart-sauce-labs-fleece-jacket"));

    public static final Target BTN_REMOVE_CHAQUETA =
            Target.the("botón remove chaqueta")
                    .located(By.id("remove-sauce-labs-fleece-jacket"));

    public static final Target BTN_CARRITO =
            Target.the("boton carrito")
                    .located(By.className("shopping_cart_link"));

    public static final Target TXT_PRODUCTO_CARRITO =
            Target.the("Producto agregado al carrito")
                    .located(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
}
