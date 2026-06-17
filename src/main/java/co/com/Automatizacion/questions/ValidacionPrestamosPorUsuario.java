package co.com.Automatizacion.questions;

import co.com.Automatizacion.userinterfaces.PrestamosPorUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidacionPrestamosPorUsuario implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionPrestamosPorUsuario.class);

    public static ValidacionPrestamosPorUsuario validar() {
        return new ValidacionPrestamosPorUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(
                            PrestamosPorUsuarioPage.MODAL_PRESTAMOS_USUARIO)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return !texto.isEmpty();

        } catch (Exception e) {

            logger.error("No se encontró el modal de préstamos: "
                    + e.getMessage());

            return false;
        }
    }
}