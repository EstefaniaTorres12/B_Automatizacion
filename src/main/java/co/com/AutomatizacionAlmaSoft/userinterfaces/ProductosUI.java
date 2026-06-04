package co.com.AutomatizacionAlmaSoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosUI {

    public static final Target BTN_PRODUCTOS =
            Target.the("Botón menú productos")
                    .located(By.xpath("//a[contains(.,'Productos')]"));

    public static final Target BTN_AGREGAR_PRODUCTO =
            Target.the("Botón agregar producto")
                    .located(By.xpath("//a[contains(text(),'Agregar Producto')]"));

    public static final Target BTN_ACCIONES = Target.the("Botón acciones")
            .located(By.xpath("//button[contains(.,'Acciones')]"));

    public static final Target BTN_EDITAR = Target.the("Botón editar")
            .located(By.xpath("//a[contains(@href,'/productos/editar/')]"));


    public static final Target INPUT_NOMBRE = Target.the("Campo nombre")
            .located(By.name("nombre"));

    public static final Target INPUT_DESCRIPCION = Target.the("Campo descripción")
            .located(By.name("descripcion"));

    public static final Target INPUT_PRECIO1 = Target.the("Campo precio")
            .located(By.name("precio"));

    public static final Target INPUT_PRECIO = Target.the("Campo precio")
            .located(By.name("producto_precio"));

    public static final Target INPUT_STOCK = Target.the("Campo stock")
            .located(By.name("producto_stock"));

    public static final Target SELECT_ESTADO = Target.the("Lista estado")
            .located(By.name("producto_estado"));

    public static final Target INPUT_IMAGEN = Target.the("Campo ruta imagen")
            .located(By.name("producto_imagen"));

    public static final Target SELECT_CATEGORIA = Target.the("Lista categoría")
            .located(By.name("categoria_id"));

    public static final Target SELECT_SUBCATEGORIA = Target.the("Lista subcategoría")
            .located(By.name("subcategoria_id"));

    public static final Target BTN_GUARDAR = Target.the("Botón guardar producto")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target MENSAJE_PRODUCTO_CREADO = Target.the("Mensaje producto creado")
            .located(By.xpath("//*[contains(text(),'Producto creado correctamente')]"));
}
