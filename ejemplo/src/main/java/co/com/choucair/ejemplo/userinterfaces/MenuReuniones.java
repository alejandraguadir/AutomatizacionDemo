package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuReuniones {
    public static final Target MENU_REUNION = Target.the("Menú reuniones")
            .located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a/span"));
    public static final Target MENU_REUNIONES = Target.the("Menú reuniones")
            .located(By.xpath("//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span"));
    public static final Target BOTON_NUEVA_REUNION= Target.the("Nuevo Reunión")
            .located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
}
