package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.CredencialesIniciarSesion;
import co.com.Automatizacion.questions.ValidacionPrestamosPorUsuario;
import co.com.Automatizacion.task.AbrirPagina;
import co.com.Automatizacion.task.Autenticarse;
import co.com.Automatizacion.task.ConsultarPrestamosPorUsuario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarPrestamosPorUsuarioStepDefinitions {

    @Dado("^que el administrador ha iniciado sesion correctamente en la Biblioteca$")
    public void queElAdministradorHaIniciadoSesionCorrectamenteEnLaBiblioteca() {

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

    @Cuando("^ingrese al modulo de usuarios y consulte los prestamos de un usuario$")
    public void ingreseAlModuloDeUsuariosYConsulteLosPrestamosDeUnUsuario() {

        theActorInTheSpotlight().attemptsTo(
                ConsultarPrestamosPorUsuario.consultar()
        );
    }

    @Entonces("^se debe verificar que se visualice el detalle de prestamos del usuario$")
    public void seDebeVerificarQueSeVisualiceElDetalleDePrestamosDelUsuario() {

        theActorInTheSpotlight().should(
                seeThat(ValidacionPrestamosPorUsuario.validar())
        );
    }
}