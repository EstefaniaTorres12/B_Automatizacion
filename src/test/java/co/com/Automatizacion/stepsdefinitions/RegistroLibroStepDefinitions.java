package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.CredencialesIniciarSesion;
import co.com.Automatizacion.models.LibroModel;
import co.com.Automatizacion.questions.MensajeRegistroLibroExitoso;
import co.com.Automatizacion.task.AbrirModuloLibros;
import co.com.Automatizacion.task.AbrirPagina;
import co.com.Automatizacion.task.Autenticarse;
import co.com.Automatizacion.task.RegistrarLibro;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class RegistroLibroStepDefinitions {


    @Dado("^que el administrador se encuentra en la pagina de libros$")
    public void queElAdministradorSeEncuentraEnLaPaginaDeLibros() {

        theActorInTheSpotlight().attemptsTo(
                AbrirModuloLibros.abrir()
        );
    }

    @Cuando("^registra un nuevo libro con los siguientes datos$")
    public void registraUnNuevoLibro(DataTable tabla) {

        List<Map<String, String>> datos =
                tabla.asMaps(String.class, String.class);

        LibroModel libro =
                LibroModel.desde(datos.get(0));

        theActorInTheSpotlight().attemptsTo(
                RegistrarLibro.con(libro)
        );
    }

    @Entonces("^se debe verificar que el libro fue registrado correctamente$")
    public void seDebeVerificarQueElLibroFueRegistradoCorrectamente() {

        theActorInTheSpotlight().should(
                seeThat(
                        MensajeRegistroLibroExitoso.enPantalla(),
                        containsString("Libro registrado correctamente")
                )
        );
    }
}