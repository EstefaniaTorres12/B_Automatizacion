package co.com.AutomatizacionAlmaSoft.task;

import co.com.AutomatizacionAlmaSoft.models.CredencialesInicioSesion;
import co.com.AutomatizacionAlmaSoft.utils.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutomatizacionAlmaSoft.userinterfaces.AutenticacionUI.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Autenticarse implements Task {

    private List<CredencialesInicioSesion> credenciales;

    public Autenticarse(List<CredencialesInicioSesion> credenciales) {
        this.credenciales = credenciales;
    }

    public static Autenticarse aute(List<CredencialesInicioSesion> credenciales) {
        return Instrumented.instanceOf(Autenticarse.class)
                .withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(INPUT_USUARIO),

                Enter.theValue(credenciales.get(0).getUsername())
                        .into(INPUT_USUARIO),

                Click.on(INPUT_CREDENCIAL),

                Enter.theValue(credenciales.get(0).getPasword())
                        .into(INPUT_CREDENCIAL),

                Click.on(BTN_INICIOSESION)
        );

        theActorInTheSpotlight().remember(
                SesionVariable.usuario.toString(),
                credenciales.get(0).getUsername()
        );
    }
}