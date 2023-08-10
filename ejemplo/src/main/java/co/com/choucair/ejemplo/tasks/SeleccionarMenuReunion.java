package co.com.choucair.ejemplo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.ejemplo.userinterfaces.MenuReuniones.*;


public class SeleccionarMenuReunion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_REUNION),
                Click.on(MENU_REUNIONES),
                Click.on(BOTON_NUEVA_REUNION)
        );
    }
    public static SeleccionarMenuReunion seleccionarMenuReunion() {
        return new SeleccionarMenuReunion();
    }
}
