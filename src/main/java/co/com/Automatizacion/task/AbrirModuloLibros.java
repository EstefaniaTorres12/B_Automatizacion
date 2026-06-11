package co.com.Automatizacion.task;

import co.com.Automatizacion.userinterfaces.LibrosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloLibros implements Task {

    public static AbrirModuloLibros abrir() {
        return Tasks.instrumented(AbrirModuloLibros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LibrosPage.BTN_LIBROS)
        );
    }
}