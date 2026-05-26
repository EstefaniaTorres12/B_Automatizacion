package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.DatosEditarCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ActualizarPerfil implements Task {

    private DatosEditarCliente datos;

    public ActualizarPerfil(DatosEditarCliente datos) {
        this.datos = datos;
    }

    public static ActualizarPerfil conLosDatos(DatosEditarCliente datos) {
        return Tasks.instrumented(ActualizarPerfil.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("Nombre: " + datos.getNombre());
        System.out.println("Correo: " + datos.getCorreo());
        System.out.println("Telefono: " + datos.getTelefono());

    }
}