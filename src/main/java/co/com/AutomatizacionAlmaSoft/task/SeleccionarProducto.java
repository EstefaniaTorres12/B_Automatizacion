package co.com.AutomatizacionAlmaSoft.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.ProductosUI.BTN_ACCIONES;
import static co.com.AutomatizacionAlmaSoft.userinterfaces.ProductosUI.BTN_EDITAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {

    public static SeleccionarProducto seleccionar() {
        return instrumented(SeleccionarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_ACCIONES),

                Click.on(BTN_EDITAR)

        );
    }
}
