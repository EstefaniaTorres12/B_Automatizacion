package co.com.AutomatizacionAlmaSoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PerfilUI {

    public static final Target BTN_PERFIL =
            Target.the("Botón perfil")
                    .located(By.xpath("//*[contains(text(),'Perfil')]"));

    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Campo primer nombre")
            .located(By.name("usuario_primer_nombre"));

    public static final Target INPUT_SEGUNDO_NOMBRE = Target.the("Campo segundo nombre")
            .located(By.name("usuario_segundo_nombre"));

    public static final Target INPUT_PRIMER_APELLIDO = Target.the("Campo primer apellido")
            .located(By.name("usuario_primer_apellido"));

    public static final Target INPUT_SEGUNDO_APELLIDO = Target.the("Campo segundo apellido")
            .located(By.name("usuario_segundo_apellido"));

    public static final Target INPUT_CORREO = Target.the("Campo correo")
            .located(By.name("usuario_correo"));

    public static final Target INPUT_DIRECCION = Target.the("Campo direccion")
            .located(By.name("usuario_direccion"));

    public static final Target INPUT_CONTRASENA = Target.the("Campo contraseña")
            .located(By.name("usuario_credencial"));

    public static final Target BTN_GUARDAR_CAMBIOS = Target.the("Botón guardar cambios")
            .located(By.xpath("//button[contains(text(),'Guardar cambios')]"));

    public static final Target MENSAJE_ACTUALIZACION_EXITOSA = Target.the("Mensaje actualización exitosa")
            .located(By.xpath("//*[contains(text(),'Perfil actualizado correctamente.')]"));
}