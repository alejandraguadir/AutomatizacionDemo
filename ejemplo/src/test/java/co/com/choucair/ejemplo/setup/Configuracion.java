package co.com.choucair.ejemplo.setup;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class Configuracion {

    @Managed()
    protected WebDriver webDriver;


    private static void maximizar(WebDriver webDriver) {
        webDriver.manage().window().maximize();
    }

    protected void quitarDriver() {
        webDriver.close();
        webDriver.quit();
    }


}
