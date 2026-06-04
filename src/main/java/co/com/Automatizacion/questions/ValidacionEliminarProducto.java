package co.com.Automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.Automatizacion.userinterfaces.EliminarProductoUI.TXT_CARRITO_VACIO;

public class ValidacionEliminarProducto implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_CARRITO_VACIO.resolveAllFor(actor).isEmpty();
    }

    public static ValidacionEliminarProducto carritoVacio() {
        return new ValidacionEliminarProducto();
    }
}