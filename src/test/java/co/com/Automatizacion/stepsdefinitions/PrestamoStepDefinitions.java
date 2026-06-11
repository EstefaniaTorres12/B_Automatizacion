package co.com.Automatizacion.stepsdefinitions;

import co.com.Automatizacion.models.PrestamoModel;
import co.com.Automatizacion.questions.MensajeRegistroPrestamoExitoso;
import co.com.Automatizacion.task.AbrirModuloPrestamos;
import co.com.Automatizacion.task.RegistrarPrestamo;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class PrestamoStepDefinitions {

    @Dado("^que el administrador se encuentra en la pagina de prestamos$")
    public void queElAdministradorSeEncuentraEnLaPaginaDePrestamos() {

        theActorInTheSpotlight().attemptsTo(
                AbrirModuloPrestamos.abrir()
        );
    }

    @Cuando("^registra un nuevo prestamo con los siguientes datos$")
    public void registraUnNuevoPrestamo(DataTable tabla) {

        List<Map<String, String>> datos =
                tabla.asMaps(String.class, String.class);

        PrestamoModel prestamo =
                PrestamoModel.desde(datos.get(0));

        theActorInTheSpotlight().attemptsTo(
                RegistrarPrestamo.con(prestamo)
        );
    }

    @Entonces("^se debe verificar que el prestamo fue registrado correctamente$")
    public void seDebeVerificarQueElPrestamoFueRegistradoCorrectamente() {

        theActorInTheSpotlight().should(
                seeThat(
                        MensajeRegistroPrestamoExitoso.enPantalla(),
                        containsString("Préstamo registrado correctamente")
                )
        );
    }
}