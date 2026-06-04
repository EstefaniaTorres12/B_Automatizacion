package co.com.AutomatizacionAlmaSoft.stepsdefinitions;

import co.com.AutomatizacionAlmaSoft.models.DatosCategoria;
import co.com.AutomatizacionAlmaSoft.task.AbrirModuloCategorias;
import co.com.AutomatizacionAlmaSoft.task.CrearCategoria;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearCategoriaStepDefinitions {

    @Cuando("^ingrese al modulo categorias$")
    public void ingreseAlModuloCategorias() {

        theActorInTheSpotlight().attemptsTo(
                AbrirModuloCategorias.ingresar()
        );
    }

    @Cuando("^diligencie el formulario con datos validos de la categoria$")
    public void diligencieElFormularioConDatosValidosDeLaCategoria(DataTable dataTable) {

        List<DatosCategoria> datosCategoria =
                dataTable.asList(DatosCategoria.class);

        theActorInTheSpotlight().attemptsTo(
                CrearCategoria.conDatos(datosCategoria)
        );
    }

    @Entonces("^el sistema debera mostrar el mensaje \"([^\"]*)\"$")
    public void elSistemaDeberaMostrarElMensaje(String mensaje) {

    }
}