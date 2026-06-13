package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrestamosVencidosPage {

    public static final Target BOTON_PRESTAMOS =
            Target.the("Boton prestamos")
                    .located(By.xpath("//button[contains(text(),'Ir a Préstamos')]"));

    public static final Target BOTON_VER_VENCIDOS =
            Target.the("Boton ver vencidos")
                    .located(By.xpath("//button[contains(text(),'Ver Vencidos')]"));

    public static final Target TITULO_PRESTAMOS_VENCIDOS =
            Target.the("Titulo prestamos vencidos")
                    .located(By.xpath("//*[contains(text(),'Préstamos vencidos')]"));
}