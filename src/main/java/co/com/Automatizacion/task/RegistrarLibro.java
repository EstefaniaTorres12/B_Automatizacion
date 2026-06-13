package co.com.Automatizacion.task;

import co.com.Automatizacion.models.LibroModel;
import co.com.Automatizacion.userinterfaces.LibrosPage;
import co.com.Automatizacion.utils.GeneradorDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarLibro implements Task {

    private final LibroModel libro;

    public RegistrarLibro(LibroModel libro) {
        this.libro = libro;
    }

    public static RegistrarLibro con(LibroModel libro) {
        return Tasks.instrumented(RegistrarLibro.class, libro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(LibrosPage.BTN_REGISTRAR_LIBRO),

                Enter.theValue(GeneradorDatos.generarTituloLibro())
                        .into(LibrosPage.CAMPO_TITULO),

                Enter.theValue(libro.getAutor())
                        .into(LibrosPage.CAMPO_AUTOR),

                Enter.theValue(GeneradorDatos.generarISBN())
                        .into(LibrosPage.CAMPO_ISBN),

                Enter.theValue(libro.getCantidad())
                        .into(LibrosPage.CAMPO_CANTIDAD),

                Click.on(LibrosPage.BTN_GUARDAR)
        );
    }
}