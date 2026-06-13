package co.com.Automatizacion.task;

import co.com.Automatizacion.userinterfaces.LibrosPageMF;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarLibros implements Task {

    public static ConsultarLibros consultar() {
        return Tasks.instrumented(ConsultarLibros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(LibrosPageMF.BOTON_LIBROS, isVisible())
                        .forNoMoreThan(10).seconds(),

                Click.on(LibrosPageMF.BOTON_LIBROS),

                WaitUntil.the(LibrosPageMF.CAMPO_BUSCAR, isVisible())
                        .forNoMoreThan(10).seconds(),

                Enter.theValue("flash")
                        .into(LibrosPageMF.CAMPO_BUSCAR),

                Click.on(LibrosPageMF.BOTON_BUSCAR)

        );
    }
}