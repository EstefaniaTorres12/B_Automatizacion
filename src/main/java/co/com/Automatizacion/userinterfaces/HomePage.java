package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target TITULO_BIBLIOTECA =
            Target.the("titulo biblioteca comunitaria")
                    .locatedBy("//h3[contains(text(),'Biblioteca Comunitaria')]");
}