package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeProgramarReunion {

    public static final Target INPUT_NOMBRE_REUNION = Target.the("Nombre de la reunión")
            .located(By.xpath("//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']"));
    public static final Target TIPO_REUNION = Target.the("Tipo reunion")
            .located(By.xpath("(//span[@id='select2-chosen-6'])[1]"));
    public static final Target INPUT_TIPO_REUNION = Target.the("Input tipo reunion")
            .located(By.xpath("(//input[@id='s2id_autogen6_search'])[1]"));
    public static final Target INPUT_NUMERO_REUNION = Target.the("Input numero de reunión")
            .located(By.xpath("  (//input[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber'])[1]"));
    public static final Target OPCION_CALENDARIO = Target.the("Calendario fecha inicial")
            .located(By.xpath("(//i[@class='fa fa-calendar'])[1]"));
    public static final Target MES = Target.the("Mes fecha inicial")
            .located(By.xpath("(//select[@class='ui-datepicker-month'])[1]"));
    public static final Target CAMPO_MES = Target.the("Seleccionar mes")
            .located(By.xpath("(//option[@value='8'])[1]"));
    public static final Target ANIO = Target.the("Año fecha inicial")
            .located(By.xpath("//select[@class='ui-datepicker-year']"));
    public static final Target CAMPO_ANIO = Target.the("Seleccionar mes fecha inicial")
            .located(By.xpath("//option[@value='2023']"));
    public static final Target DIA = Target.the("Dia fecha inicial")
            .located(By.xpath("(//a[normalize-space()='13'])[1]"));
    public static final Target CAMPO_HORA = Target.the("Hora inicio")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/select"));
    public static final Target HORA = Target.the("Seleccionar hora de inicio")
            .located(By.xpath("(//option[@value='01:45'][normalize-space()='01:45'])[1]"));
    public static final Target OPCION_CALENDARIO_FINALIZACION = Target.the("Calendario fecha finalizacion")
            .located(By.xpath("(//button[@type='button'])[3]"));
    public static final Target MES_FINALIZACION = Target.the("Mes finalización")
            .located(By.xpath("(//select[@class='ui-datepicker-month'])[1]"));
    public static final Target CAMPO_MES_FINALIZACION = Target.the("Selecciona mes finalización")
            .located(By.xpath("(//option[@value='8'])[1]"));
    public static final Target ANIO_FINALIZACION = Target.the("Año finalización")
            .located(By.xpath("//select[@class='ui-datepicker-year']"));
    public static final Target CAMPO_ANIO_FINALIZACION = Target.the("Seleciona año finalización")
            .located(By.xpath("//option[@value='2023']"));
    public static final Target DIA_FINALIZACION = Target.the("Selecina dia finalización")
            .located(By.xpath("(//a[normalize-space()='13'])[1]"));
    public static final Target CAMPO_HORA_FINALIZACION = Target.the("Hora finalización")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/select"));
    public static final Target HORA_FINALIZACION = Target.the("Selección de hora")
            .located(By.xpath("(//option[@value='03:00'][normalize-space()='03:00'])[2]"));

    public static final Target MENU_UBICACION = Target.the("Menú ubicación")
            .located(By.xpath("(//a[@class='select2-choice select2-default'])[6]"));

    public static final Target INPUT_UBICACION = Target.the("Input Ubicación")
            .located(By.xpath("(//input[@id='s2id_autogen7_search'])[1]"));


    public static final Target MENU_UNIDAD = Target.the("Menú unidad")
            .located(By.xpath("(//span[@id='select2-chosen-8'])[1]"));
    public static final Target INPUT_UNIDAD = Target.the("Input unidad")
            .located(By.xpath("(//input[@id='s2id_autogen8_search'])[1]"));

    public static final Target MENU_ORGANIZADOR = Target.the("Menú organizador")
            .located(By.xpath("(//span[@id='select2-chosen-9'])[1]"));
    public static final Target INPUT_ORGANIZADOR = Target.the("Input oorganizador")
            .located(By.xpath("(//input[@id='s2id_autogen9_search'])[1]"));

    public static final Target MENU_REPORTERO = Target.the("Menú reportero")
            .located(By.xpath("(//span[@id='select2-chosen-10'])[1]"));
    public static final Target INPUT_REPORTERO = Target.the("Input reportero")
            .located(By.xpath("(//input[@id='s2id_autogen10_search'])[1]"));

    public static final Target MENU_ASISTENTES = Target.the("Menú asistentes")
            .located(By.xpath("//*[@id=\"select2-chosen-12\"]"));

    public static final Target INPUT_ASISTENTES = Target.the("Input asistentes")
            .located(By.xpath("(//input[@id='s2id_autogen12_search'])[1]"));

    public static final Target BOTON_GUARDAR = Target.the("Botón guardar")
            .located(By.xpath("(//div[@class='buttons-inner'])[2]"));

}
