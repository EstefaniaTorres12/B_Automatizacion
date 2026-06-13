package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.PrestamosActivosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionPrestamosActivos implements Question<Boolean> {

    public static ValidacionPrestamosActivos validar() {
        return new ValidacionPrestamosActivos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return PrestamosActivosPage.TITULO_PRESTAMOS_ACTIVOS
                .resolveFor(actor)
                .isVisible();
    }
}