package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeLogin {

    public static final Target INPUT_ADMIN_LOGIN = Target.the("Input de admin para el login")
            .located(By.xpath("(//input[@id='LoginPanel0_Username'])[1]"));


    public static final Target INPUT_CONTRASENNA_LOGIN = Target.the("Input de contrasenna para el login")
            .located(By.xpath("//input[@id='LoginPanel0_Password']"));

    public static final Target BOTON_INICIO_SESION= Target.the("Botón iniciar sesión")
            .located(By.id("LoginPanel0_LoginButton"));





}
