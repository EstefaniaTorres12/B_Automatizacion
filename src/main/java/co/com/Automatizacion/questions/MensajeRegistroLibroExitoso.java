package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.LibrosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MensajeRegistroLibroExitoso implements Question<String> {

    private static final Logger logger =
            LoggerFactory.getLogger(
                    MensajeRegistroLibroExitoso.class);

    public static MensajeRegistroLibroExitoso enPantalla() {
        return new MensajeRegistroLibroExitoso();
    }

    @Override
    public String answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(
                            LibrosPage.MENSAJE_EXITO)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Mensaje encontrado: " + texto);

            return texto;

        } catch (Exception e) {

            logger.error("No se encontró el mensaje: "
                    + e.getMessage());

            return "";
        }
    }
}