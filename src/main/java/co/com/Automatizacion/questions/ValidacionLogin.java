package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionLogin implements Question<Boolean> {

    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePage.TITULO_BIBLIOTECA
                .resolveFor(actor)
                .isVisible();
    }
}