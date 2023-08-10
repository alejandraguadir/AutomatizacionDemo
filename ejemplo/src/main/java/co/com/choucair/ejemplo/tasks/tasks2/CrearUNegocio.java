package co.com.choucair.ejemplo.tasks.tasks2;


import co.com.choucair.ejemplo.models.DataReunion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.ejemplo.userinterfaces.PaginaCrearUnidadDeNegocio.*;
import static co.com.choucair.ejemplo.userinterfaces.PaginaDeLogin.*;


public class CrearUNegocio implements Task {
    private DataReunion dataReunion;

    public CrearUNegocio(DataReunion dataReunion) {
        this.dataReunion = dataReunion;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(NUEVA_UNIDAD_DE_NEGOCIO),
                Enter.theValue(dataReunion.getNombreUnidad()).into(INPUT_NOMBRE),
                Click.on(INPUT_SELECCIONAR_UNIDAD),
                Enter.theValue(dataReunion.getUnidadPrincipal()).into(INPUT_BUSCAR_UNIDAD),
                Hit.the(Keys.TAB).into(INPUT_BUSCAR_UNIDAD),
                Click.on(BOTON_GUARDAR)
        );
    }
    public static CrearUNegocio crearUNegocio(DataReunion dataReunion) {
        return new CrearUNegocio(dataReunion);
    }


}
