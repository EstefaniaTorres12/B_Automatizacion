package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.DatosEditarCliente;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.PerfilUI.*;

public class ActualizarPerfil implements Task {
    private List<DatosEditarCliente> datosPerfil;

    public ActualizarPerfil(List<DatosEditarCliente> datosPerfil) {
        this.datosPerfil = datosPerfil;
    }

    public static ActualizarPerfil conDatos(List<DatosEditarCliente> datosPerfil) {
        return Instrumented.instanceOf(ActualizarPerfil.class)
                .withProperties(datosPerfil);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(BTN_PERFIL),

                Click.on(BTN_PERFIL),

                Clear.field(INPUT_PRIMER_NOMBRE),
                Enter.theValue(datosPerfil.get(0).getPrimerNombre())
                        .into(INPUT_PRIMER_NOMBRE),

                Clear.field(INPUT_SEGUNDO_NOMBRE),
                Enter.theValue(datosPerfil.get(0).getSegundoNombre())
                        .into(INPUT_SEGUNDO_NOMBRE),

                Clear.field(INPUT_PRIMER_APELLIDO),
                Enter.theValue(datosPerfil.get(0).getPrimerApellido())
                        .into(INPUT_PRIMER_APELLIDO),

                Clear.field(INPUT_SEGUNDO_APELLIDO),
                Enter.theValue(datosPerfil.get(0).getSegundoApellido())
                        .into(INPUT_SEGUNDO_APELLIDO),

                Clear.field(INPUT_CORREO),
                Enter.theValue(datosPerfil.get(0).getCorreo())
                        .into(INPUT_CORREO),

                Clear.field(INPUT_DIRECCION),
                Enter.theValue(datosPerfil.get(0).getDireccion())
                        .into(INPUT_DIRECCION),

                Clear.field(INPUT_CONTRASENA),
                Enter.theValue(datosPerfil.get(0).getContrasena())
                        .into(INPUT_CONTRASENA),

                Click.on(BTN_GUARDAR_CAMBIOS)
        );
    }
}