package co.com.Automatizacion.task;

import co.com.Automatizacion.userinterfaces.PrestamosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloPrestamos implements Task {

    public static AbrirModuloPrestamos abrir() {
        return Tasks.instrumented(AbrirModuloPrestamos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PrestamosPage.BTN_PRESTAMOS)
        );
    }
}