package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.DatosUsuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.ProductosUI.BTN_AGREGAR_PRODUCTO;
import static co.com.AutomatizacionAlmaSoft.userinterfaces.UsuarioUI.*;

public class CrearUsuario implements Task {

    private List<DatosUsuario> datosUsuario;

    public CrearUsuario(List<DatosUsuario> datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    public static CrearUsuario conDatos(List<DatosUsuario> datosUsuario) {
        return Instrumented.instanceOf(CrearUsuario.class)
                .withProperties(datosUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BTN_AGREGAR_USUARIO),

                SelectFromOptions.byVisibleText("Asesor")
                        .from(SELECT_ROL),

                Enter.theValue(datosUsuario.get(0).getDocumento())
                        .into(INPUT_DOCUMENTO),

                Enter.theValue(datosUsuario.get(0).getPrimerNombre())
                        .into(INPUT_PRIMER_NOMBRE),

                Enter.theValue(datosUsuario.get(0).getSegundoNombre())
                        .into(INPUT_SEGUNDO_NOMBRE),

                Enter.theValue(datosUsuario.get(0).getPrimerApellido())
                        .into(INPUT_PRIMER_APELLIDO),

                Enter.theValue(datosUsuario.get(0).getSegundoApellido())
                        .into(INPUT_SEGUNDO_APELLIDO),

                Enter.theValue(datosUsuario.get(0).getDireccion())
                        .into(INPUT_DIRECCION),

                Enter.theValue(datosUsuario.get(0).getTelefono())
                        .into(INPUT_TELEFONO),

                Enter.theValue(datosUsuario.get(0).getCorreo())
                        .into(INPUT_CORREO),

                Enter.theValue(datosUsuario.get(0).getContrasena())
                        .into(INPUT_CONTRASENA),

                Scroll.to(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );
    }
}