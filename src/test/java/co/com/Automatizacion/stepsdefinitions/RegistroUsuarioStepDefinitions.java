package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.CredencialesIniciarSesion;
import co.com.Automatizacion.models.RegistroUsuarioModel;
import co.com.Automatizacion.questions.MensajeErrorRegistro;
import co.com.Automatizacion.questions.MensajeRegistroExitoso;
import co.com.Automatizacion.task.AbrirModuloUsuarios;
import co.com.Automatizacion.task.AbrirPagina;
import co.com.Automatizacion.task.Autenticarse;
import co.com.Automatizacion.task.RegistrarUsuario;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class RegistroUsuarioStepDefinitions {


    @Dado("^que el administrador se encuentra en la pagina de usuarios$")
    public void queElAdministradorSeEncuentraEnLaPaginaDeUsuarios() {

        theActorInTheSpotlight().attemptsTo(
                AbrirModuloUsuarios.abrir()
        );
    }

    @Cuando("^registra un nuevo usuario con los siguientes datos$")
    public void registraUnNuevoUsuario(DataTable tabla) {

        List<Map<String, String>> datos =
                tabla.asMaps(String.class, String.class);

        RegistroUsuarioModel usuario =
                RegistroUsuarioModel.desde(datos.get(0));

        theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.con(usuario)
        );
    }

    @Entonces("^se debe verificar que el usuario fue registrado correctamente$")
    public void seDebeVerificarQueElUsuarioFueRegistradoCorrectamente() {

        theActorInTheSpotlight().should(
                seeThat(
                        MensajeRegistroExitoso.enPantalla(),
                        containsString("Usuario registrado correctamente")
                )
        );
    }

    @Entonces("^se debe visualizar el mensaje de error de registro$")
    public void seDebeVisualizarElMensajeDeErrorDeRegistro() {

        theActorInTheSpotlight().should(
                seeThat(
                        MensajeErrorRegistro.enPantalla(),
                        equalTo("Ya existe un usuario con ese correo")
                )
        );
    }
}