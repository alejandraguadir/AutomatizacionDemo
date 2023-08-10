package co.com.choucair.ejemplo.stepdefinitions;

import co.com.choucair.ejemplo.models.DataReunion;
import co.com.choucair.ejemplo.models.SetDataReunion;
import co.com.choucair.ejemplo.questions.ConfirmacionReunion;
import co.com.choucair.ejemplo.tasks.tasks2.RealizarLogin;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.logging.Logger;

import static co.com.choucair.ejemplo.tasks.ProgramarReunion.programarReunion;
import static co.com.choucair.ejemplo.tasks.SeleccionarMenuReunion.seleccionarMenuReunion;
import static co.com.choucair.ejemplo.tasks.UnidadDeNegocio.unidadDeNegocio;
import static co.com.choucair.ejemplo.tasks.tasks2.CrearReunion.crearReunion;
import static co.com.choucair.ejemplo.tasks.tasks2.CrearUNegocio.crearUNegocio;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Demo2StepDefinitions {
    private static final Logger log = Logger.getLogger(String.valueOf(Demo2StepDefinitions.class));
    private final SetDataReunion setDataReunion = new SetDataReunion();
    private final ConfirmacionReunion confirmacionReunion = new ConfirmacionReunion();


    @Before
    public void initialConfigurationDektop(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor").wasAbleTo(
                Open.url("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")
        );
        log.info("Ingreso a URL correctamente");
    }
    @Given("el administrador inicia sesion")
    public void elAdministradorIniciaSesion(DataTable data ) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                RealizarLogin.ingresarCredenciales(setDataReunion.setData(data).get(0))
        );

        log.info("Login realizado correctamente");


    }
    @When("el administrador crea la unidad de negocio")
    public void elAdministradorCreaLaUnidadDeNegocio(DataTable data ) {
        theActorInTheSpotlight().attemptsTo(
                unidadDeNegocio()
        );
        log.info("Menú Unidad de negocio seleccionado correctamente");
        theActorInTheSpotlight().attemptsTo(
                crearUNegocio(setDataReunion.setData(data).get(0))
        );
        log.info("Menú Unidad de negocio creada correctamente");
        System.out.println(data);
    }
    @When("el administrador programa la reunion")
    public void elAdministradorProgramaLaReunion(DataTable data) {
        theActorInTheSpotlight().attemptsTo(
                seleccionarMenuReunion()
        );
        log.info("Menú reunión seleccionada correctamente");
        System.out.println(data);
        theActorInTheSpotlight().attemptsTo(
                crearReunion(setDataReunion.setData(data).get(0))
        );
        log.info("Reunion creada correctamente");
        System.out.println(data);
    }
    @Then("la reunion se programara de manera exitosa")
    public void laReunionSeProgramaraDeManeraExitosa() {
        List<String> resultadosObtenidos = confirmacionReunion.answeredBy(OnStage.theActorInTheSpotlight());

        // Imprimir los resultados obtenidos
        System.out.println("Resultados obtenidos:");
        for (String resultado : resultadosObtenidos) {
            System.out.println(resultado);
        }

    }


}
