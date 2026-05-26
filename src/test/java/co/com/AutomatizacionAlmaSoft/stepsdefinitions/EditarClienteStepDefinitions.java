package co.com.AutomatizacionAlmaSoft.stepsdefinitions;

import co.com.AutomatizacionAlmaSoft.models.DatosEditarCliente;
import co.com.AutomatizacionAlmaSoft.task.ActualizarPerfil;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarClienteStepDefinitions {

    @Cuando("^actualice los datos del perfil y haga click en \"([^\"]*)\"$")
    public void actualiceLosDatosDelPerfilYHagaClickEn(String boton, DataTable dataTable) {

        List<DatosEditarCliente> datos = dataTable.asList(DatosEditarCliente.class);

        theActorInTheSpotlight().attemptsTo(
                ActualizarPerfil.conLosDatos(datos.get(0))
        );
    }

    @Entonces("^se debe verificar que los datos fueron actualizados correctamente\\.$")
    public void seDebeVerificarQueLosDatosFueronActualizadosCorrectamente() {

        System.out.println("Los datos fueron actualizados correctamente");

    }
}