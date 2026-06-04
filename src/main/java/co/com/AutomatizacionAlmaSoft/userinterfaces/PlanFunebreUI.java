package co.com.AutomatizacionAlmaSoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlanFunebreUI {

    public static final Target BTN_PREMIUN =
            Target.the("Boton ver detalles")
                    .located(By.xpath("//button[contains(.,'Ver detalles y adquirir')]"));

    public static final Target BTN_ADQUIRIR_PLAN =
            Target.the("Botón adquirir plan")
                    .located(By.cssSelector("button.plan-modal-button"));

    public static final Target SELECT_METODO_PAGO =
            Target.the("Metodo de pago")
                    .located(By.id("metodoPago"));

    public static final Target SELECT_ENTIDAD_PSE =
            Target.the("Entidad financiera")
                    .located(By.id("entidadPse"));

    public static final Target SELECT_TIPO_PERSONA =
            Target.the("Tipo de cliente PSE")
                    .located(By.id("pseTipoCliente"));

    public static final Target INPUT_CORREO =
            Target.the("Correo del pagador")
                    .located(By.id("pseCorreo"));

    public static final Target BTN_CONFIRMAR_PAGO =
            Target.the("Boton confirmar y registrar pago")
                    .located(By.xpath("//button[contains(text(),'Confirmar y registrar pago')]"));

    public static final Target BTN_VER_MI_PLAN =
            Target.the("Boton ver mi plan")
                    .located(By.xpath("//a[contains(text(),'Ver mi plan')]"));

}