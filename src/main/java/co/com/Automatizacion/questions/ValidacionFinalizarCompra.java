package co.com.Automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.Automatizacion.userinterfaces.FinalizarCompraUI.TXT_MENSAJE_COMPRA_EXITOSA;

public class ValidacionFinalizarCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_MENSAJE_COMPRA_EXITOSA.resolveFor(actor).getText();
    }

    public static ValidacionFinalizarCompra validar() {
        return new ValidacionFinalizarCompra();
    }
}