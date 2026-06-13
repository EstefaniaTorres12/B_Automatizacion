package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeRegistroExitoso implements Question<String> {

    public static MensajeRegistroExitoso enPantalla() {
        return new MensajeRegistroExitoso();
    }

    @Override
    public String answeredBy(Actor actor) {
        return RegistroUsuarioPage.MENSAJE_EXITO
                .resolveFor(actor)
                .getText();
    }
}