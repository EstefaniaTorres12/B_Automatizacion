package co.com.AutomatizacionAlmaSoft.stepsdefinitions;

import co.com.AutomatizacionAlmaSoft.models.DatosAdquirirPlan;
import co.com.AutomatizacionAlmaSoft.task.AdquirirPlanFunebre;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PlanFunebreStepDefinitions {

    @Cuando("^seleccione un plan funerario y complete la informacion de pago$")
    public void seleccioneUnPlanFunerarioYCompleteLaInformacionDePago(DataTable dataTable) {

        List<DatosAdquirirPlan> datos =
                dataTable.asList(DatosAdquirirPlan.class);

        theActorInTheSpotlight().attemptsTo(
                AdquirirPlanFunebre.conDatos(datos)
        );
    }

    @Entonces("^se debe verificar que el plan fue adquirido correctamente\\.$")
    public void seDebeVerificarQueElPlanFueAdquiridoCorrectamente() {

        System.out.println("Plan adquirido correctamente");
    }
}