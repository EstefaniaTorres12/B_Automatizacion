package co.com.Automatizacion.task;

import co.com.Automatizacion.userinterfaces.UsuariosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloUsuarios implements Task {

    public static AbrirModuloUsuarios abrir() {
        return Tasks.instrumented(AbrirModuloUsuarios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UsuariosPage.BTN_USUARIOS)
        );
    }
}