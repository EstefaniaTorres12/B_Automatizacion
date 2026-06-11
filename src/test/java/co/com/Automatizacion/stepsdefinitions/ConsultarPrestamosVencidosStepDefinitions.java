package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.questions.ValidacionPrestamosVencidos;
import co.com.Automatizacion.task.ConsultarPrestamosVencidos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarPrestamosVencidosStepDefinitions {


    @Cuando("^ingrese al modulo de prestamos y consulte los prestamos vencidos$")
    public void ingreseAlModuloDePrestamosYConsulteLosPrestamosVencidos() {

        theActorInTheSpotlight().attemptsTo(
                ConsultarPrestamosVencidos.consultar()
        );
    }

    @Entonces("^se debe verificar que se visualice el listado de prestamos vencidos$")
    public void seDebeVerificarQueSeVisualiceElListadoDePrestamosVencidos() {

        theActorInTheSpotlight().should(
                seeThat(
                        "validacion prestamos vencidos",
                        ValidacionPrestamosVencidos.validar()
                )
        );
    }
}