package co.com.AutomatizacionAlmaSoft.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.AutomatizacionAlmaSoft.userinterfaces.UsuarioUI.MENSAJE_USUARIO_CREADO;


public class ValidacionCrearUsuario implements Question<Boolean> {
    private static final String MENSAJE_ESPERADO =
            "Datos enviados correctamente!!!!......";

    public static ValidacionCrearUsuario validacionUsuario() {
        return new ValidacionCrearUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String texto = Text.of(MENSAJE_USUARIO_CREADO)
                .viewedBy(actor)
                .asString()
                .trim();

        return texto.contains("Datos enviados");
    }
}
