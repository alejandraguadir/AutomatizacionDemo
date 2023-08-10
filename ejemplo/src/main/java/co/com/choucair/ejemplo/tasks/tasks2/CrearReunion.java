package co.com.choucair.ejemplo.tasks.tasks2;


import co.com.choucair.ejemplo.models.DataReunion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.ejemplo.userinterfaces.PaginaCrearUnidadDeNegocio.*;
import static co.com.choucair.ejemplo.userinterfaces.PaginaDeProgramarReunion.*;
import static co.com.choucair.ejemplo.userinterfaces.PaginaDeProgramarReunion.BOTON_GUARDAR;
import static co.com.choucair.ejemplo.userinterfaces.PaginaDeProgramarReunion.INPUT_ASISTENTES;


public class CrearReunion implements Task {
    private DataReunion dataReunion;

    public CrearReunion(DataReunion dataReunion) {
        this.dataReunion = dataReunion;
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(INPUT_NOMBRE_REUNION),
                Enter.theValue(dataReunion.getNombreReunion()).into(INPUT_NOMBRE_REUNION),
                Click.on(TIPO_REUNION),
                Enter.theValue(dataReunion.getTipoReunion()).into(INPUT_TIPO_REUNION),
                Hit.the(Keys.TAB).into(INPUT_TIPO_REUNION),
                Click.on(INPUT_NUMERO_REUNION),
                Enter.theValue(dataReunion.getNumeroReunion()).into(INPUT_NUMERO_REUNION),
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
                Enter.theValue(dataReunion.getUbicacionReunion()).into(INPUT_UBICACION),
                Hit.the(Keys.TAB).into(INPUT_UBICACION),

                Click.on(MENU_UNIDAD),
                Enter.theValue(dataReunion.getUnidadReunion()).into(INPUT_UNIDAD),
                Hit.the(Keys.TAB).into(INPUT_UNIDAD),

                Click.on(MENU_ORGANIZADOR),
                Enter.theValue(dataReunion.getOrganizadorReunion()).into(INPUT_ORGANIZADOR),
                Hit.the(Keys.TAB).into(INPUT_ORGANIZADOR),

                Click.on(MENU_REPORTERO),
                Enter.theValue(dataReunion.getReporteroReunion()).into(INPUT_REPORTERO),
                Hit.the(Keys.TAB).into(INPUT_REPORTERO),

                Click.on(MENU_ASISTENTES),
                Enter.theValue("Eric Butler").into(INPUT_ASISTENTES),
                Hit.the(Keys.TAB).into(INPUT_ASISTENTES),

                Click.on(BOTON_GUARDAR)

        );
    }
    public static CrearReunion crearReunion(DataReunion dataReunion) {
        return new CrearReunion(dataReunion);
    }


}
