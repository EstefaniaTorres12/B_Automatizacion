package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.CredencialesIniciarSesion;
import co.com.Automatizacion.task.AbrirPagina;
import co.com.Automatizacion.task.Autenticarse;
import cucumber.api.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginComunStepDefinitions {

    @Dado("^que el administrador ha iniciado sesion en la Biblioteca$")
    public void queElAdministradorHaIniciadoSesionEnLaBiblioteca() {

        theActorInTheSpotlight().attemptsTo(
                AbrirPagina.laPagina(),
                Autenticarse.con(
                        new CredencialesIniciarSesion(
                                "admin@biblioteca.com",
                                "demo1234"
                        )
                )
        );
    }
}