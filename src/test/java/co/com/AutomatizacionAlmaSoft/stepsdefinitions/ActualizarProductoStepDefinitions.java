package co.com.AutomatizacionAlmaSoft.stepsdefinitions;


import co.com.AutomatizacionAlmaSoft.task.AbrirModuloProductos;
import co.com.AutomatizacionAlmaSoft.models.DatosActualizarProducto;
import co.com.AutomatizacionAlmaSoft.task.ActualizarProducto;
import co.com.AutomatizacionAlmaSoft.task.SeleccionarProducto;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActualizarProductoStepDefinitions {


        @Cuando("^seleccione el producto a actualizar$")
        public void seleccioneElProductoAActualizar() {

            theActorInTheSpotlight().attemptsTo(
                    SeleccionarProducto.seleccionar()
            );
        }

        @Cuando("^actualice los datos del producto$")
        public void actualiceLosDatosDelProducto(DataTable dataTable) {

            List<DatosActualizarProducto> datosProducto =
                    dataTable.asList(DatosActualizarProducto.class);

            theActorInTheSpotlight().attemptsTo(
                    ActualizarProducto.conDatos(datosProducto)
            );
        }
    }
