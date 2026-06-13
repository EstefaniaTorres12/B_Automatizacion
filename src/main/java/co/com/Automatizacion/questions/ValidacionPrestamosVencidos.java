package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.PrestamosVencidosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionPrestamosVencidos implements Question<Boolean> {

    public static ValidacionPrestamosVencidos validar() {
        return new ValidacionPrestamosVencidos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return PrestamosVencidosPage.TITULO_PRESTAMOS_VENCIDOS
                .resolveFor(actor)
                .isVisible();
    }
}