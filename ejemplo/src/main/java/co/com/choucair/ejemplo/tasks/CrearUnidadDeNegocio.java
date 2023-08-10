package co.com.choucair.ejemplo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.ejemplo.userinterfaces.PaginaCrearUnidadDeNegocio.*;


public class CrearUnidadDeNegocio implements Task {

    private String nombreUnidadNegocio;
    private String unidadPrincipal;

    public CrearUnidadDeNegocio conNombreUnidadNegocio(String nombreUnidadNegocio) {
        this.nombreUnidadNegocio = nombreUnidadNegocio;
        return this;
    }

    public CrearUnidadDeNegocio yunidadPrincipal(String  unidadPrincipal) {
        this. unidadPrincipal =  unidadPrincipal;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUEVA_UNIDAD_DE_NEGOCIO),
                Enter.theValue(nombreUnidadNegocio).into(INPUT_NOMBRE),
                Click.on(INPUT_SELECCIONAR_UNIDAD),
                Enter.theValue(unidadPrincipal).into(INPUT_BUSCAR_UNIDAD),
                Hit.the(Keys.TAB).into(INPUT_BUSCAR_UNIDAD),
                Click.on(BOTON_GUARDAR)

        );
    }public static CrearUnidadDeNegocio crearUnidadDeNegocio() {
        return new CrearUnidadDeNegocio();
    }
}
