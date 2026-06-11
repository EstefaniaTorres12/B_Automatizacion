package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.RegistroUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeErrorRegistro implements Question<String> {

    public static MensajeErrorRegistro enPantalla() {
        return new MensajeErrorRegistro();
    }

    @Override
    public String answeredBy(Actor actor) {
        return RegistroUsuarioPage.MENSAJE_ERROR
                .resolveFor(actor)
                .getText();
    }
}