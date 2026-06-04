package co.com.AutomatizacionAlmaSoft.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.CheckoutUI.TXT_INFORMACION_COMPRA;

public class ValidacionCheckout implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_INFORMACION_COMPRA.resolveFor(actor).getText();
    }

    public static ValidacionCheckout validar() {
        return new ValidacionCheckout();
    }
}