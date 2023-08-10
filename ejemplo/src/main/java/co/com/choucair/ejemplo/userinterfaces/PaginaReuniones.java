package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaReuniones {

    public static final Target NOMBRE_REUNION = Target.the("Nombre de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[2]"));
    public static final Target NUMERO_REUNION = Target.the("Número de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[3]"));
    public static final Target NOMBRE_TIPO_DE_REUNION = Target.the("Nombre de tipo de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[4]"));
    public static final Target FECHA_INICIO = Target.the("Fecha de inicio de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[5]"));
    public static final Target FECHA_FIN = Target.the("Fecha fin de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[6]"));
    public static final Target NOMBRE_UBICACION = Target.the("Ubicación de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[7]"));
    public static final Target NOMBRE_UNIDAD= Target.the("Nombre unidad de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[8]"));
    public static final Target NOMBRE_ORGANIZADOR = Target.the("Organizador  de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[9]"));
    public static final Target NOMBRE_REPORTERO = Target.the("Reportero de reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[3]/div[5]/div/div[1]/div[10]"));
}
