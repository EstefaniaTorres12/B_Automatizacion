package co.com.AutomatizacionAlmaSoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroClienteUI {

    public static final Target BTN_ABRIR_REGISTRO = Target.the("Boton abrir formulario registro")
            .located(net.thucydides.core.annotations.findby.By.xpath("//a[contains(.,'Registrarse')]"));

    public static final Target INPUT_DOCUMENTO =
            Target.the("Documento")
                    .located(By.name("DocumentoCliente"));

    public static final Target INPUT_PRIMER_NOMBRE =
            Target.the("Primer nombre")
                    .located(By.name("PrimerNombreCliente"));

    public static final Target INPUT_SEGUNDO_NOMBRE =
            Target.the("Segundo nombre")
                    .located(By.name("SegundoNombreCliente"));

    public static final Target INPUT_PRIMER_APELLIDO =
            Target.the("Primer apellido")
                    .located(By.name("PrimerApellidoCliente"));

    public static final Target INPUT_SEGUNDO_APELLIDO =
            Target.the("Segundo apellido")
                    .located(By.name("SegundoApellidoCliente"));

    public static final Target INPUT_DIRECCION =
            Target.the("Dirección")
                    .located(By.name("DireccionCliente"));

    public static final Target INPUT_TELEFONO =
            Target.the("Teléfono")
                    .located(By.name("TelefonoCliente"));

    public static final Target INPUT_CORREO =
            Target.the("Correo")
                    .located(By.name("CorreoCliente"));

    public static final Target INPUT_CONTRASENA =
            Target.the("Contraseña")
                    .located(By.name("Credencial"));

    public static final Target INPUT_FECHA_NACIMIENTO =
            Target.the("Fecha de nacimiento")
                    .located(By.name("FechaNacimiento"));

    public static final Target BTN_GUARDAR =
            Target.the("Botón guardar")
                    .located(By.xpath("//button[@type='submit']"));
}