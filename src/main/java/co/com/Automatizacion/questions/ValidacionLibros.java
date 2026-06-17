package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.LibrosPageMF;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidacionLibros implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionLibros.class);

    public static ValidacionLibros validar() {
        return new ValidacionLibros();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(LibrosPageMF.LIBRO_ENCONTRADO)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return !texto.isEmpty();

        } catch (Exception e) {

            logger.error("No se encontró el libro: "
                    + e.getMessage());

            return false;
        }
    }
}