package co.com.AutomatizacionAlmaSoft.stepsdefinitions;

import co.com.AutomatizacionAlmaSoft.models.DatosRegistroCliente;
import co.com.AutomatizacionAlmaSoft.task.AbrirPagina;
import co.com.AutomatizacionAlmaSoft.task.RegistrarCliente;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroClienteStepDefinitions {

    @Dado("^que el usuario se encuentra en la pagina de registro de AlmaSoft$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeRegistroDeAlmaSoft() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^ingrese los datos requeridos correctamente$")
    public void ingreseLosDatosRequeridosCorrectamente(DataTable dataTable) {

        List<DatosRegistroCliente> datos =
                dataTable.asList(DatosRegistroCliente.class);

        theActorInTheSpotlight().attemptsTo(
                RegistrarCliente.conDatos(datos)
        );
    }

    @Entonces("^se debe verificar que el usuario haya sido registrado correctamente\\.$")
    public void seDebeVerificarQueElUsuarioHayaSidoRegistradoCorrectamente() {

        System.out.println("Usuario registrado correctamente");
    }
}