package co.com.AutomatizacionAlmaSoft.stepsdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PlanFunebreStepDefinitions {

    @Cuando("^seleccione un plan funerario y complete la informacion de pago$")
    public void seleccioneUnPlanFunerarioYCompleteLaInformacionDePago() {

        theActorInTheSpotlight();

    }

    @Entonces("^se debe verificar que el plan fue adquirido correctamente\\.$")
    public void seDebeVerificarQueElPlanFueAdquiridoCorrectamente() {

    }
}