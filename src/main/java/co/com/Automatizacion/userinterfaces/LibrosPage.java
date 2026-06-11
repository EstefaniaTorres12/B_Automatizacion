package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LibrosPage {

    public static final Target BOTON_LIBROS =
            Target.the("Boton libros")
                    .located(By.xpath("//button[contains(.,'Ir a Libros')]"));

    public static final Target TITULO_LIBROS =
            Target.the("Titulo libros")
                    .located(By.xpath("//h1[contains(.,'Libros')]"));

    public static final Target CAMPO_BUSCAR =
            Target.the("Campo buscar")
                    .located(By.xpath("//input"));

    public static final Target BOTON_BUSCAR =
            Target.the("Boton buscar")
                    .located(By.xpath("//button[contains(text(),'Buscar')]"));

    public static final Target LIBRO_ENCONTRADO =
            Target.the("Libro encontrado")
                    .located(By.xpath("//*[contains(text(),'flash')]"));
}