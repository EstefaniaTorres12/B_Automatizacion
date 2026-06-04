package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.DatosCheckout;
import co.com.Automatizacion.questions.ValidacionCheckout;
import co.com.Automatizacion.task.RealizarCheckout;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutStepDefinitions {

    @Cuando("^realiza el checkout$")
    public void realizaElCheckout(List<DatosCheckout> datos) {

        theActorInTheSpotlight().attemptsTo(
                RealizarCheckout.conDatos(datos)
        );
    }

    @Entonces("^debe visualizar la información de la compra$")
    public void debeVisualizarLaInformacionDeLaCompra() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionCheckout.validar(),
                        equalTo("Checkout: Overview")
                )
        );
    }

}
