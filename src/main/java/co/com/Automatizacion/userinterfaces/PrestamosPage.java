package co.com.Automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrestamosPage {

    public static final Target BTN_PRESTAMOS =
            Target.the("modulo prestamos")
                    .locatedBy("//button[contains(.,'Préstamos')]");

    public static final Target BTN_REGISTRAR_PRESTAMO =
            Target.the("registrar prestamo")
                    .locatedBy("//button[contains(.,'Registrar Préstamo')]");

    public static final Target LISTA_USUARIO =
            Target.the("lista usuarios")
                    .locatedBy("(//div[@role='combobox'])[1]");

    public static final Target LISTA_LIBRO =
            Target.the("lista libros")
                    .locatedBy("(//div[@role='combobox'])[2]");

    public static Target OPCION_USUARIO(String usuario){
        return Target.the("opcion usuario")
                .locatedBy("//li[@role='option' and contains(.,'" + usuario + "')]");
    }

    public static Target OPCION_LIBRO(String libro){
        return Target.the("opcion libro")
                .locatedBy("//li[@role='option' and contains(.,'" + libro + "')]");
    }

    public static final Target FECHA_DEVOLUCION =
            Target.the("fecha devolucion")
                    .locatedBy("//input[@type='date']");

    public static final Target BTN_GUARDAR =
            Target.the("guardar prestamo")
                    .locatedBy("//button[contains(.,'Guardar')]");

    public static final Target MENSAJE_EXITO =
            Target.the("mensaje exito")
                    .locatedBy("//*[contains(text(),'Préstamo registrado correctamente')]");

    public static final Target BTN_DEVOLVER =
            Target.the("boton devolver")
                    .locatedBy("//button[contains(.,'Devolver')]");

    public static final Target MENSAJE_DEVOLUCION_EXITOSA =
            Target.the("mensaje devolucion exitosa")
                    .locatedBy("//div[contains(@class,'MuiAlert-message')]");


}