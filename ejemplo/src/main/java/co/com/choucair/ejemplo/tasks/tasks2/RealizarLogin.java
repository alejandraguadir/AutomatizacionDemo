package co.com.choucair.ejemplo.tasks.tasks2;


import co.com.choucair.ejemplo.models.DataReunion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.ejemplo.userinterfaces.PaginaDeLogin.*;


public class RealizarLogin implements Task {
    private DataReunion dataReunion;

    public RealizarLogin (DataReunion dataReunion) {
        this.dataReunion = dataReunion;

    }
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataReunion.getAdmin()).into(INPUT_ADMIN_LOGIN),
                Enter.theValue(dataReunion.getPassword()).into(INPUT_CONTRASENNA_LOGIN ),
                Click.on(BOTON_INICIO_SESION)
        );
    }
    public static RealizarLogin ingresarCredenciales(DataReunion dataReunion) {
        return new RealizarLogin(dataReunion);
    }


}
