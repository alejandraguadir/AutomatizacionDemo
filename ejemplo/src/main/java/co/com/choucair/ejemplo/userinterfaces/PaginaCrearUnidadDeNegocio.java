package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCrearUnidadDeNegocio {
    public static final Target NUEVA_UNIDAD_DE_NEGOCIO = Target.the("Botón nueva unidad de negocio")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));

    public static final Target INPUT_NOMBRE = Target.the("Input nombre")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]"));

    public static final Target INPUT_SELECCIONAR_UNIDAD = Target.the("Input unidad")
            .located(By.id("s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId"));

    public static final Target INPUT_BUSCAR_UNIDAD= Target.the("Busca unidad")
            .located(By.xpath("(//input[@id='s2id_autogen1_search'])[1]"));
    public static final Target BOTON_GUARDAR = Target.the("Botón guardar")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[1]/div/span"));



}
