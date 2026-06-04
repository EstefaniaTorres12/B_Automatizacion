package co.com.Automatizacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.Automatizacion.userinterfaces.AgregarProductoCarritoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarProducto implements Task {

    public static AgregarProducto alCarrito() { return Tasks.instrumented(AgregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Scroll.to(BTN_AGREGAR_CHAQUETA),

                WaitUntil.the(BTN_AGREGAR_CHAQUETA, isClickable())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(BTN_AGREGAR_CHAQUETA),

                Click.on(BTN_CARRITO)
        );
    }
}
