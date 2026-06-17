package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidacionLogin implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionLogin.class);

    public static ValidacionLogin validacionLogin() {
        return new ValidacionLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(HomePage.TITULO_BIBLIOTECA)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return !texto.isEmpty();

        } catch (Exception e) {

            logger.error("No se encontró el título de la biblioteca: "
                    + e.getMessage());

            return false;
        }
    }
}