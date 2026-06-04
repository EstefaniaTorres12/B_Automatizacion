package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.DatosRegistroCliente;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.RegistroClienteUI.*;

public class RegistrarCliente implements Task {

    private List<DatosRegistroCliente> datos;

    public RegistrarCliente(List<DatosRegistroCliente> datos) {
        this.datos = datos;
    }

    public static RegistrarCliente conDatos(List<DatosRegistroCliente> datos) {
        return Instrumented.instanceOf(RegistrarCliente.class)
                .withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        DatosRegistroCliente cliente = datos.get(0);

        actor.attemptsTo(

                Click.on(BTN_ABRIR_REGISTRO),

                Enter.theValue(cliente.getDocumento())
                        .into(INPUT_DOCUMENTO),

                Enter.theValue(cliente.getPrimerNombre())
                        .into(INPUT_PRIMER_NOMBRE),

                Enter.theValue(cliente.getSegundoNombre())
                        .into(INPUT_SEGUNDO_NOMBRE),

                Enter.theValue(cliente.getPrimerApellido())
                        .into(INPUT_PRIMER_APELLIDO),

                Enter.theValue(cliente.getSegundoApellido())
                        .into(INPUT_SEGUNDO_APELLIDO),

                Enter.theValue(cliente.getDireccion())
                        .into(INPUT_DIRECCION),

                Enter.theValue(cliente.getTelefono())
                        .into(INPUT_TELEFONO),

                Enter.theValue(cliente.getCorreo())
                        .into(INPUT_CORREO),

                Enter.theValue(cliente.getContraseña())
                        .into(INPUT_CONTRASENA),

                Enter.theValue("2000-12-10")
                        .into(INPUT_FECHA_NACIMIENTO),

                Click.on(BTN_GUARDAR)

        );
    }
}