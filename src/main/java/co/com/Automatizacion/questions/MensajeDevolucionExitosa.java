package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.PrestamosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeDevolucionExitosa implements Question<String> {

    public static MensajeDevolucionExitosa enPantalla() {
        return new MensajeDevolucionExitosa();
    }

    @Override
    public String answeredBy(Actor actor) {
        return PrestamosPage.MENSAJE_DEVOLUCION_EXITOSA
                .resolveFor(actor)
                .getText();
    }
}