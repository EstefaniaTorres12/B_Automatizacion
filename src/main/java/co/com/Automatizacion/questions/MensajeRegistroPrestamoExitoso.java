package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.PrestamosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeRegistroPrestamoExitoso implements Question<String> {

    public static MensajeRegistroPrestamoExitoso enPantalla() {
        return new MensajeRegistroPrestamoExitoso();
    }

    @Override
    public String answeredBy(Actor actor) {
        return PrestamosPage.MENSAJE_EXITO
                .resolveFor(actor)
                .getText();
    }
}