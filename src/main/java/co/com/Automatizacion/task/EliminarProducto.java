package co.com.Automatizacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.Automatizacion.userinterfaces.EliminarProductoUI.BTN_ELIMINAR_PRODUCTO;

public class EliminarProducto implements Task {

    public static EliminarProducto delCarrito() {
        return Tasks.instrumented(EliminarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_ELIMINAR_PRODUCTO)
        );
    }
}