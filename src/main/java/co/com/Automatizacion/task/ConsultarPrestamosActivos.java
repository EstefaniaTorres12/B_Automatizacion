package co.com.Automatizacion.task;

import co.com.Automatizacion.userinterfaces.PrestamosActivosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConsultarPrestamosActivos implements Task {

    public static ConsultarPrestamosActivos consultar() {
        return Tasks.instrumented(ConsultarPrestamosActivos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PrestamosActivosPage.BTN_IR_A_PRESTAMOS)
        );
    }
}