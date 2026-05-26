package co.com.AutomatizacionAlmaSoft.stepsdefinitions;

import co.com.AutomatizacionAlmaSoft.questions.ValidacionLogin;
import co.com.AutomatizacionAlmaSoft.task.AbrirPagina;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import co.com.AutomatizacionAlmaSoft.models.CredencialesInicioSesion;
import co.com.AutomatizacionAlmaSoft.task.Autenticarse;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

public class IniciarsesionStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft$")
    public  void queElUsuarioSeEncuentreEnLaPaginaDeInicioSesionDeSesionDeAlmaSoft (){
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.laPagina());
    }

    @Cuando("^ingrese las credenciales correctas \\(Correo electronico y contraseña\\)$")
    public void ingreseLasCredencialesCorrectasCorreoElectronicoYContraseña(
            List<CredencialesInicioSesion> credenciales) {

        theActorInTheSpotlight().attemptsTo(
                Autenticarse.aute(credenciales)
        );
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(ValidacionLogin.validacionLogin()));
    }
}
