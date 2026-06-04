package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.DatosCategoria;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.CategoriasUI.*;

public class CrearCategoria implements Task {

    private List<DatosCategoria> datosCategoria;

    public CrearCategoria(List<DatosCategoria> datosCategoria) {
        this.datosCategoria = datosCategoria;
    }

    public static CrearCategoria conDatos(List<DatosCategoria> datosCategoria) {
        return Instrumented.instanceOf(CrearCategoria.class)
                .withProperties(datosCategoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_AGREGAR_CATEGORIA),

                Enter.theValue(datosCategoria.get(0).getNombre())
                        .into(INPUT_NOMBRE_CATEGORIA),

                Click.on(BTN_GUARDAR)
        );
    }
}