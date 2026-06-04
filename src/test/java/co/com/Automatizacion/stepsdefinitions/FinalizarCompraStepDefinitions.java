package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.questions.ValidacionFinalizarCompra;
import co.com.Automatizacion.task.FinalizarCompra;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class FinalizarCompraStepDefinitions {

    @Cuando("^finaliza la compra de un producto$")
    public void finalizaLaCompraDeUnProducto() {

        theActorInTheSpotlight().attemptsTo(
                FinalizarCompra.delProducto()
        );
    }

    @Entonces("^debe visualizar el mensaje de compra exitosa$")
    public void debeVisualizarElMensajeDeCompraExitosa() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionFinalizarCompra.validar(),
                        equalTo("Thank you for your order!")
                )
        );
    }
}