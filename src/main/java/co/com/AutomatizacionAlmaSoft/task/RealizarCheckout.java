package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.DatosCheckout;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.CheckoutUI.*;

public class RealizarCheckout implements Task {

    private List<DatosCheckout> datos;

    public RealizarCheckout(List<DatosCheckout> datos) {
        this.datos = datos;
    }

    public static RealizarCheckout conDatos(List<DatosCheckout> datos) {
        return Instrumented.instanceOf(RealizarCheckout.class)
                .withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_CHECKOUT),

                Enter.theValue(datos.get(0).getNombre())
                        .into(INPUT_NOMBRE),

                Enter.theValue(datos.get(0).getApellido())
                        .into(INPUT_APELLIDO),

                Enter.theValue(datos.get(0).getCodigoPostal())
                        .into(INPUT_POSTAL),

                Click.on(BTN_CONTINUE)
        );
    }
}