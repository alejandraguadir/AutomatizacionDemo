package co.com.choucair.ejemplo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.ejemplo.userinterfaces.PaginaUnidadDeNegocio.*;


public class UnidadDeNegocio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_ORGANIZACION),
                Click.on(OPCION_UNIDADES_DE_NEGOCIO)
        );
    }
    public static UnidadDeNegocio unidadDeNegocio() {
        return new UnidadDeNegocio();
    }
}
