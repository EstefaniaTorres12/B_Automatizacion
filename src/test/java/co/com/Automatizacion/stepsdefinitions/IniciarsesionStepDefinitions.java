package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.CredencialesIniciarSesion;
import co.com.Automatizacion.questions.ValidacionLogin;
import co.com.Automatizacion.task.AbrirPagina;
import co.com.Automatizacion.task.Autenticarse;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarsesionStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de Biblioteca$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeBiblioteca() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^ingrese las credenciales correctas$")
    public void ingreseLasCredencialesCorrectas(DataTable tabla) {

        List<Map<String, String>> datos =
                tabla.asMaps(String.class, String.class);

        CredencialesIniciarSesion modelo =
                CredencialesIniciarSesion.desde(datos.get(0));

        theActorInTheSpotlight().attemptsTo(
                Autenticarse.con(modelo)
        );
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina\\.$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamente() {

        theActorInTheSpotlight().should(
                seeThat(ValidacionLogin.validacionLogin())
        );
    }
}