package co.com.AutomatizacionAlmaSoft.stepsdefinitions;

import co.com.AutomatizacionAlmaSoft.task.AbrirPagina;
import cucumber.api.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarseStepDefinitions {
    @Dado("^que el usuario se encuentra en la pagina de registro de AlmaSoft$")
    public  void QueElUsuarioSeEnLaPaginaDeRegistroDeAlmaSoft(){
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.laPagina());
    }
}
