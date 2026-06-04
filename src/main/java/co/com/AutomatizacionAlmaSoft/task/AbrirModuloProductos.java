package co.com.AutomatizacionAlmaSoft.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.ProductosUI.BTN_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirModuloProductos implements Task {

    public static AbrirModuloProductos ingresar() {
        return instrumented(AbrirModuloProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PRODUCTOS)
        );
    }
}
