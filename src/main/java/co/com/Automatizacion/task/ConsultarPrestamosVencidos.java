package co.com.Automatizacion.task;

import co.com.Automatizacion.userinterfaces.PrestamosVencidosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConsultarPrestamosVencidos implements Task {

    public static ConsultarPrestamosVencidos consultar() {
        return Tasks.instrumented(ConsultarPrestamosVencidos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(PrestamosVencidosPage.BOTON_PRESTAMOS),
                Click.on(PrestamosVencidosPage.BOTON_VER_VENCIDOS)

        );
    }
}