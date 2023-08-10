package co.com.choucair.ejemplo.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.ejemplo.userinterfaces.PaginaDeLogin.*;


public class RealizarLogin implements Task {

    private String usuariPrueba;
    private String contrasennaPrueba;

    public RealizarLogin conElUsuario(String usuariPrueba) {
        this.usuariPrueba = usuariPrueba;
        return this;
    }

    public RealizarLogin yConLaContrasenna(String contrasennaPrueba) {
        this.contrasennaPrueba = contrasennaPrueba;
        return this;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(usuariPrueba).into(INPUT_ADMIN_LOGIN),
                Enter.theValue(contrasennaPrueba).into(INPUT_CONTRASENNA_LOGIN),
                Click.on(BOTON_INICIO_SESION)


        );
    }


    public static RealizarLogin realizarLogin() {
        return new RealizarLogin();
    }
}
