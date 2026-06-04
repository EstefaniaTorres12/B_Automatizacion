package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.questions.ValidacionEliminarProducto;
import co.com.Automatizacion.task.EliminarProducto;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class EliminarProductoStepDefinitions {

    @Cuando("^elimina el producto del carrito$")
    public void eliminaElProductoDelCarrito() {

        theActorInTheSpotlight().attemptsTo(
                EliminarProducto.delCarrito()
        );
    }

    @Entonces("^el carrito debe quedar vacío$")
    public void elCarritoDebeQuedarVacio() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionEliminarProducto.carritoVacio(),
                        equalTo(true)
                )
        );
    }
}