package co.com.choucair.ejemplo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;

import static co.com.choucair.ejemplo.userinterfaces.PaginaReuniones.*;

public class ConfirmacionReunion implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {
        List<String> resultadosObtenidos = new ArrayList<>();

        String nombreReunion = NOMBRE_REUNION.resolveFor(actor).getText();
        String tipoReunion = NOMBRE_TIPO_DE_REUNION.resolveFor(actor).getText();
        String numeroReunion = NUMERO_REUNION.resolveFor(actor).getText();
        String ubicacionReunion = NOMBRE_UBICACION.resolveFor(actor).getText();
        String unidadReunion = NOMBRE_UNIDAD.resolveFor(actor).getText();

        //String fechaInicioReunion = FECHA_INICIO.resolveFor(actor).getText();
        //String fechaFinReunion = FECHA_FIN.resolveFor(actor).getText();


        // Agregar cada resultado a la lista
        resultadosObtenidos.add(nombreReunion);
        resultadosObtenidos.add(tipoReunion);
        resultadosObtenidos.add(numeroReunion);
        resultadosObtenidos.add(ubicacionReunion);
        resultadosObtenidos.add(unidadReunion);
        //resultadosObtenidos.add(fechaInicioReunion);
        //resultadosObtenidos.add(fechaFinReunion);


        return resultadosObtenidos;
    }

    public static ConfirmacionReunion resultadosObtenidos() {
        return new ConfirmacionReunion();
    }
}
