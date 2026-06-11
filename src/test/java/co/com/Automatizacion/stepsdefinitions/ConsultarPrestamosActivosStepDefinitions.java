package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.CredencialesIniciarSesion;
import co.com.Automatizacion.questions.ValidacionPrestamosActivos;
import co.com.Automatizacion.task.AbrirPagina;
import co.com.Automatizacion.task.Autenticarse;
import co.com.Automatizacion.task.ConsultarPrestamosActivos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarPrestamosActivosStepDefinitions {

    @Dado("^que el usuario ha iniciado sesion correctamente en la Biblioteca$")
    public void queElUsuarioHaIniciadoSesionCorrectamenteEnLaBiblioteca() {

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

    @Cuando("^ingrese al modulo de prestamos$")
    public void ingreseAlModuloDePrestamos() {

        theActorInTheSpotlight().attemptsTo(
                ConsultarPrestamosActivos.consultar()
        );
    }

    @Entonces("^se debe verificar que se visualice el listado de prestamos activos$")
    public void seDebeVerificarQueSeVisualiceElListadoDePrestamosActivos() {

        theActorInTheSpotlight().should(
                seeThat(ValidacionPrestamosActivos.validar())
        );
    }
}