package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.questions.ValidacionCarrito;
import co.com.Automatizacion.task.AgregarProducto;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class AgregarproductocarritoStepDefinitions {


    @Cuando("^agrega un producto al carrito$")
    public  void agregaUnProductoAlCarrito(){
        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarrito()
        );
    }

    @Entonces("^debe visualizar el producto en el carrito$")
    public void debeVisualizarElProductoEnElCarrito() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionCarrito.validarProducto(),
                        equalTo("Sauce Labs Fleece Jacket")
                )
        );
    }

}
