package co.com.Automatizacion.task;

import co.com.Automatizacion.models.PrestamoModel;
import co.com.Automatizacion.userinterfaces.PrestamosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrarPrestamo implements Task {

    private final PrestamoModel prestamo;

    public RegistrarPrestamo(PrestamoModel prestamo) {
        this.prestamo = prestamo;
    }

    public static RegistrarPrestamo con(PrestamoModel prestamo) {
        return Tasks.instrumented(RegistrarPrestamo.class, prestamo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(PrestamosPage.BTN_REGISTRAR_PRESTAMO),

                Click.on(PrestamosPage.LISTA_USUARIO),
                Click.on(PrestamosPage.OPCION_USUARIO(prestamo.getUsuario())),

                Click.on(PrestamosPage.LISTA_LIBRO),
                Click.on(PrestamosPage.OPCION_LIBRO(prestamo.getLibro())),

                Enter.theValue(prestamo.getFechaDevolucion())
                        .into(PrestamosPage.FECHA_DEVOLUCION),

                Click.on(PrestamosPage.BTN_GUARDAR)
        );
    }
}