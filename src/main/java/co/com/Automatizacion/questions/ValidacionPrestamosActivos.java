package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.PrestamosActivosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidacionPrestamosActivos implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionPrestamosActivos.class);

    public static ValidacionPrestamosActivos validar() {
        return new ValidacionPrestamosActivos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(
                            PrestamosActivosPage.TITULO_PRESTAMOS_ACTIVOS)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return !texto.isEmpty();

        } catch (Exception e) {

            logger.error("No se encontró préstamos activos: "
                    + e.getMessage());

            return false;
        }
    }
}