package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.LibrosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeRegistroLibroExitoso implements Question<String> {

    public static MensajeRegistroLibroExitoso enPantalla() {
        return new MensajeRegistroLibroExitoso();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LibrosPage.MENSAJE_EXITO
                .resolveFor(actor)
                .getText();
    }
}