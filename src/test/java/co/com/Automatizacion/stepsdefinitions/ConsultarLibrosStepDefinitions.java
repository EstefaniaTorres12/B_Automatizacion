package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.CredencialesIniciarSesion;
import co.com.Automatizacion.questions.ValidacionLibros;
import co.com.Automatizacion.task.AbrirPagina;
import co.com.Automatizacion.task.Autenticarse;
import co.com.Automatizacion.task.ConsultarLibros;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarLibrosStepDefinitions {

    @Dado("^que el administrador se encuentra autenticado para consultar libros$")
    public void queElAdministradorSeEncuentraAutenticadoParaConsultarLibros() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );

        CredencialesIniciarSesion credenciales =
                new CredencialesIniciarSesion(
                        "admin@biblioteca.com",
                        "demo123"
                );

        theActorInTheSpotlight().attemptsTo(
                Autenticarse.con(credenciales)
        );
    }

    @Cuando("^ingrese al modulo de libros$")
    public void ingreseAlModuloDeLibros() {

        theActorInTheSpotlight().attemptsTo(
                ConsultarLibros.consultar()
        );
    }

    @Entonces("^se debe verificar que se visualice el listado de libros$")
    public void seDebeVerificarQueSeVisualiceElListadoDeLibros() {

        theActorInTheSpotlight().should(
                seeThat(ValidacionLibros.validar())
        );
    }
}