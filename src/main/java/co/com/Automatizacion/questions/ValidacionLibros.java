package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.LibrosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionLibros implements Question<Boolean> {

    public static ValidacionLibros validar() {
        return new ValidacionLibros();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return LibrosPage.LIBRO_ENCONTRADO
                .resolveFor(actor)
                .isVisible();
    }
}