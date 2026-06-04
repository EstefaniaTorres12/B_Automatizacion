package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.DatosActualizarProducto;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.ProductosUI.*;

public class ActualizarProducto implements Task {

    private List<DatosActualizarProducto> datosProducto;

    public ActualizarProducto(List<DatosActualizarProducto> datosProducto) {
        this.datosProducto = datosProducto;
    }

    public static ActualizarProducto conDatos(List<DatosActualizarProducto> datosProducto) {
        return Instrumented.instanceOf(ActualizarProducto.class)
                .withProperties(datosProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Clear.field(INPUT_PRECIO),
                Enter.theValue(datosProducto.get(0).getPrecio())
                        .into(INPUT_PRECIO),

                Clear.field(INPUT_STOCK),
                Enter.theValue(datosProducto.get(0).getStock())
                        .into(INPUT_STOCK),

                Scroll.to(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );
    }
}