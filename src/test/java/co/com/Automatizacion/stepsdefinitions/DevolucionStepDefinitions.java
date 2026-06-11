package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.questions.MensajeDevolucionExitosa;
import co.com.Automatizacion.task.RegistrarDevolucion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class DevolucionStepDefinitions {

    @Cuando("^registra la devolucion de un libro prestado$")
    public void registraLaDevolucionDeUnLibroPrestado() {

        theActorInTheSpotlight().attemptsTo(
                RegistrarDevolucion.delLibro()
        );
    }

    @Entonces("^se debe verificar que la devolucion fue registrada correctamente$")
    public void seDebeVerificarQueLaDevolucionFueRegistradaCorrectamente() {

        theActorInTheSpotlight().should(
                seeThat(
                        MensajeDevolucionExitosa.enPantalla(),
                        containsString("Devolución registrada")
                )
        );
    }
}