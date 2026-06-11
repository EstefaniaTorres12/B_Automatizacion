package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.LibrosPageMF;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionLibros implements Question<Boolean> {

    public static ValidacionLibros validar() {
        return new ValidacionLibros();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return LibrosPageMF.LIBRO_ENCONTRADO
                .resolveFor(actor)
                .isVisible();
    }
}