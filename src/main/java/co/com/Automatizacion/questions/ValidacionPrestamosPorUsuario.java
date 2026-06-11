package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.PrestamosPorUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionPrestamosPorUsuario implements Question<Boolean> {

    public static ValidacionPrestamosPorUsuario validar() {
        return new ValidacionPrestamosPorUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return PrestamosPorUsuarioPage.MODAL_PRESTAMOS_USUARIO
                .resolveFor(actor)
                .isVisible();
    }
}