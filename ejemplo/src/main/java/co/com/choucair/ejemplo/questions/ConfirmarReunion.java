package co.com.choucair.ejemplo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.ejemplo.userinterfaces.PaginaReuniones.*;


public class ConfirmarReunion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String nombreReunion = NOMBRE_REUNION.resolveFor(actor).getText();
        String numeroReunion = NUMERO_REUNION.resolveFor(actor).getText();
        String tipoReunion = NOMBRE_TIPO_DE_REUNION.resolveFor(actor).getText();
        String fechaInicioReunion = FECHA_INICIO.resolveFor(actor).getText();
        String fechaFinReunion = FECHA_FIN.resolveFor(actor).getText();
        String ubicacionReunion = NOMBRE_UBICACION.resolveFor(actor).getText();
        String unidadReunion = NOMBRE_UNIDAD.resolveFor(actor).getText();

        return nombreReunion + " - " + numeroReunion + " - " + tipoReunion + " - " + fechaInicioReunion + " - " + fechaFinReunion + " - " + ubicacionReunion + " - " + unidadReunion;



    }

    public static ConfirmarReunion confirmarReunion(){
        return new ConfirmarReunion();
    }
}
