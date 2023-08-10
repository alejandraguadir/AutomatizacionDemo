package co.com.choucair.ejemplo.stepdefinitions;

import co.com.choucair.ejemplo.questions.ConfirmarReunion;
import co.com.choucair.ejemplo.setup.Configuracion;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



import static co.com.choucair.ejemplo.questions.ConfirmarReunion.confirmarReunion;
import static co.com.choucair.ejemplo.tasks.CrearUnidadDeNegocio.crearUnidadDeNegocio;
import static co.com.choucair.ejemplo.tasks.ProgramarReunion.programarReunion;
import static co.com.choucair.ejemplo.tasks.RealizarLogin.realizarLogin;
import static co.com.choucair.ejemplo.tasks.SeleccionarMenuReunion.seleccionarMenuReunion;
import static co.com.choucair.ejemplo.tasks.UnidadDeNegocio.unidadDeNegocio;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


public class DemoStepDefinitions extends Configuracion {

    @Before
    public void initialConfigurationDektop(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor").wasAbleTo(
                Open.url("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")
        );
    }
    @Given("el usuario inicio sesion")
    public void elUsuarioInicioSesion() {

            theActorInTheSpotlight().attemptsTo(
                    realizarLogin()
                            .conElUsuario("admin")
                            .yConLaContrasenna("serenity")
            );



    }
    @When("el usuario crea la unidad de negocio")
    public void elUsuarioCreaLaUnidadDeNegocio() {
        theActorInTheSpotlight().attemptsTo(
                unidadDeNegocio()
        );
        theActorInTheSpotlight().attemptsTo(
                crearUnidadDeNegocio()
                        .conNombreUnidadNegocio("Unidad two")
                        .yunidadPrincipal("Operations")
        );
    }

    @When("el usuario programa la reunion")
    public void elUsuarioProgramaLaReunion() {
        theActorInTheSpotlight().attemptsTo(
                seleccionarMenuReunion()
        );
        theActorInTheSpotlight().attemptsTo(
                programarReunion()
        );

    }
    @Then("la reunion se programara exitosamente")
    public void laReunionSeProgramaraExitosamente() {
        String resultadoEsperado = "Planeacion mensual - 12 - Team Weekly - 09/13/2023 01:45 - 09/13/2023 03:00 - HQ-01 - Unidad two";

        theActorInTheSpotlight().should(
                seeThat(confirmarReunion(), equalTo(resultadoEsperado))
        );

    }}