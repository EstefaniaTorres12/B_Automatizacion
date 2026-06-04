package co.com.AutomatizacionAlmaSoft.stepsdefinitions;

import co.com.AutomatizacionAlmaSoft.models.CredencialesInicioSesion;
import co.com.AutomatizacionAlmaSoft.questions.ValidacionLogin;
import co.com.AutomatizacionAlmaSoft.task.AbrirPagina;
import co.com.AutomatizacionAlmaSoft.task.Autenticarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarsesionStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de Swag Labs$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeSwagLabs() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^ingrese las credenciales correctas$")
    public void ingreseLasCredencialesCorrectas(
            List<CredencialesInicioSesion> credenciales) {

        theActorInTheSpotlight().attemptsTo(
                Autenticarse.aute(credenciales)
        );
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina\\.$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamente() {

        theActorInTheSpotlight().should(
                seeThat(ValidacionLogin.validacionLogin())
        );
    }
}