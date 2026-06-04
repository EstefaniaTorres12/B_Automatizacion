package co.com.Automatizacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.Automatizacion.userinterfaces.FinalizarCompraUI.BTN_FINISH;

public class FinalizarCompra implements Task {

    public static FinalizarCompra delProducto() {
        return Tasks.instrumented(FinalizarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_FINISH)
        );
    }
}