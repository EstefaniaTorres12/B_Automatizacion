package co.com.Automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.Automatizacion.userinterfaces.AgregarProductoCarritoUI.TXT_PRODUCTO_CARRITO;

public class ValidacionCarrito implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_PRODUCTO_CARRITO.resolveFor(actor).getText();
    }

    public static ValidacionCarrito validarProducto() {
        return new ValidacionCarrito();
    }
}