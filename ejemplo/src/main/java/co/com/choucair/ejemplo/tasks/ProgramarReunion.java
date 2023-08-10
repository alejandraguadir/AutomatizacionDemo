package co.com.choucair.ejemplo.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.ejemplo.userinterfaces.PaginaDeProgramarReunion.*;


public class ProgramarReunion implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(INPUT_NOMBRE_REUNION),
               Enter.theValue("Planeacion mensual").into(INPUT_NOMBRE_REUNION),
               Click.on(TIPO_REUNION),
               Enter.theValue("Team").into(INPUT_TIPO_REUNION),
               Hit.the(Keys.TAB).into(INPUT_TIPO_REUNION),
               Click.on(INPUT_NUMERO_REUNION),
               Enter.theValue("12").into(INPUT_NUMERO_REUNION),
               Click.on(OPCION_CALENDARIO),
               Click.on(ANIO),
               Click.on(CAMPO_ANIO),
               Click.on(MES),
               Click.on(CAMPO_MES),
               Click.on(DIA),
               Click.on(CAMPO_HORA),
               Click.on(HORA),

               Click.on(OPCION_CALENDARIO_FINALIZACION),
               Click.on(ANIO_FINALIZACION),
               Click.on(CAMPO_ANIO_FINALIZACION),
               Click.on(MES_FINALIZACION),
               Click.on(CAMPO_MES_FINALIZACION),
               Click.on(DIA_FINALIZACION),

               Click.on(OPCION_CALENDARIO_FINALIZACION),
               Click.on(CAMPO_HORA_FINALIZACION),
               Click.on(HORA_FINALIZACION),
               Click.on(MENU_UBICACION),
               Enter.theValue("HQ-01").into(INPUT_UBICACION),
               Hit.the(Keys.TAB).into(INPUT_UBICACION),

               Click.on(MENU_UNIDAD),
               Enter.theValue("Unidad two").into(INPUT_UNIDAD),
               Hit.the(Keys.TAB).into(INPUT_UNIDAD),

               Click.on(MENU_ORGANIZADOR),
               Enter.theValue("Sara Torres").into(INPUT_ORGANIZADOR),
               Hit.the(Keys.TAB).into(INPUT_ORGANIZADOR),

               Click.on(MENU_REPORTERO),
               Enter.theValue("james Jones").into(INPUT_REPORTERO),
               Hit.the(Keys.TAB).into(INPUT_REPORTERO),

               Click.on(MENU_ASISTENTES),
               Enter.theValue("Eric Butler").into(INPUT_ASISTENTES),
               Hit.the(Keys.TAB).into(INPUT_ASISTENTES),

               Click.on(BOTON_GUARDAR)

       );
    }
    public static ProgramarReunion programarReunion() {
        return new ProgramarReunion();
    }
}
