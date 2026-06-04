package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.DatosAdquirirPlan;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.PlanFunebreUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AdquirirPlanFunebre implements Task {

    private List<DatosAdquirirPlan> datos;

    public AdquirirPlanFunebre(List<DatosAdquirirPlan> datos) {
        this.datos = datos;
    }

    public static AdquirirPlanFunebre conDatos(List<DatosAdquirirPlan> datos) {
        return Instrumented.instanceOf(AdquirirPlanFunebre.class)
                .withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        DatosAdquirirPlan plan = datos.get(0);

        actor.attemptsTo(

                Scroll.to(BTN_PREMIUN),
                Click.on(BTN_PREMIUN),

                WaitUntil.the(BTN_ADQUIRIR_PLAN, isVisible()).
                        forNoMoreThan(10).seconds(),

                SelectFromOptions.byVisibleText(plan.getMetodoPago())
                        .from(SELECT_METODO_PAGO),

                SelectFromOptions.byVisibleText(plan.getEntidadBancaria())
                        .from(SELECT_ENTIDAD_PSE),

                SelectFromOptions.byVisibleText(
                                plan.getTipoPersona().equalsIgnoreCase("Natural")
                                        ? "Persona natural"
                                        : "Persona juridica")
                        .from(SELECT_TIPO_PERSONA),

                Enter.theValue(plan.getCorreo())
                        .into(INPUT_CORREO),

                Click.on(BTN_CONFIRMAR_PAGO)
        );
    }
}