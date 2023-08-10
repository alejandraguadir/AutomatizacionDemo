package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaUnidadDeNegocio {

    public static final Target OPCION_ORGANIZACION = Target.the("Opción organización")
            .located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[1]/a/span"));

    public static final Target OPCION_UNIDADES_DE_NEGOCIO = Target.the("Opción unidades de negocio")
            .located(By.xpath("//*[@id=\"nav_menu1_3_1\"]/li[1]/a/span"));







}
