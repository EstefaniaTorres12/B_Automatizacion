package co.com.AutomatizacionAlmaSoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriasUI {

    public static final Target BTN_CATEGORIAS = Target.the("Botón categorías")
            .located(By.xpath("//a[contains(text(),'Categorias')]"));

    public static final Target BTN_AGREGAR_CATEGORIA =
            Target.the("Botón agregar categoría")
                    .located(By.xpath("//a[contains(text(),'Agregar Categoría')]"));


    public static final Target INPUT_NOMBRE_CATEGORIA = Target.the("Campo nombre categoría")
            .located(By.name("nombre"));

    public static final Target BTN_GUARDAR = Target.the("Botón guardar")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target MENSAJE_CATEGORIA_CREADA =
            Target.the("Mensaje categoría creada")
                    .located(By.xpath("//*[contains(text(),'Categoría creada correctamente ')]"));
}