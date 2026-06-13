package co.com.Automatizacion.task;

import co.com.Automatizacion.userinterfaces.PrestamosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RegistrarDevolucion implements Task {

    public static RegistrarDevolucion delLibro() {
        return Tasks.instrumented(RegistrarDevolucion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PrestamosPage.BTN_DEVOLVER)
        );
    }
}