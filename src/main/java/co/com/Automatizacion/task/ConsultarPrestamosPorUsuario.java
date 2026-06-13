package co.com.Automatizacion.task;

import co.com.Automatizacion.userinterfaces.PrestamosPorUsuarioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConsultarPrestamosPorUsuario implements Task {

    public static ConsultarPrestamosPorUsuario consultar() {
        return Tasks.instrumented(ConsultarPrestamosPorUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(PrestamosPorUsuarioPage.BTN_IR_A_USUARIOS),

                Click.on(PrestamosPorUsuarioPage.BTN_VER_PRESTAMOS)

        );
    }
}