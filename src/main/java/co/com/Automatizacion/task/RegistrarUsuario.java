package co.com.Automatizacion.task;

import co.com.Automatizacion.models.RegistroUsuarioModel;
import co.com.Automatizacion.userinterfaces.RegistroUsuarioPage;
import co.com.Automatizacion.utils.GeneradorDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarUsuario implements Task {

    private final RegistroUsuarioModel usuario;

    public RegistrarUsuario(RegistroUsuarioModel usuario) {
        this.usuario = usuario;
    }

    public static RegistrarUsuario con(RegistroUsuarioModel usuario) {
        return Tasks.instrumented(RegistrarUsuario.class, usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(RegistroUsuarioPage.BTN_REGISTRAR_USUARIO),

                Enter.theValue(GeneradorDatos.generarNombre())
                        .into(RegistroUsuarioPage.CAMPO_NOMBRE),

                Enter.theValue(GeneradorDatos.generarEmail())
                        .into(RegistroUsuarioPage.CAMPO_EMAIL),

                Enter.theValue(usuario.getPassword())
                        .into(RegistroUsuarioPage.CAMPO_PASSWORD),

                Enter.theValue(usuario.getTelefono())
                        .into(RegistroUsuarioPage.CAMPO_TELEFONO),

                Click.on(RegistroUsuarioPage.BTN_GUARDAR)
        );
    }
}