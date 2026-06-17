package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.PrestamosVencidosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidacionPrestamosVencidos implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionPrestamosVencidos.class);

    public static ValidacionPrestamosVencidos validar() {
        return new ValidacionPrestamosVencidos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(
                            PrestamosVencidosPage.TITULO_PRESTAMOS_VENCIDOS)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return !texto.isEmpty();

        } catch (Exception e) {

            logger.error("No se encontró préstamos vencidos: "
                    + e.getMessage());

            return false;
        }
    }
}