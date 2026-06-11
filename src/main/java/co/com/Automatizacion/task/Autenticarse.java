package co.com.Automatizacion.task;

import co.com.Automatizacion.models.CredencialesIniciarSesion;
import co.com.Automatizacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Autenticarse implements Task {

    private final CredencialesIniciarSesion credenciales;

    public Autenticarse(CredencialesIniciarSesion credenciales) {
        this.credenciales = credenciales;
    }

    public static Autenticarse con(CredencialesIniciarSesion credenciales) {
        return Tasks.instrumented(Autenticarse.class, credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(credenciales.getEmail())
                        .into(LoginPage.CAMPO_EMAIL),

                Enter.theValue(credenciales.getPassword())
                        .into(LoginPage.CAMPO_PASSWORD),

                Click.on(LoginPage.BOTON_INGRESAR)

        );
    }
}