package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosUtests;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import question.ValidateRegisterComplete;
import tasks.ClickOnBecomeUtester;
import tasks.RegisterUserReto;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast() );
        OnStage.theActorCalled("Alex");
    }

    @Given("^the user is on Homepage$")
    public void theUserIsOnHomepage()  {
        theActorInTheSpotlight().wasAbleTo(Open.url( "https://utest.com/"));

    }

    @When("^the user clicks on become a utester$")
    public void theUserClicksOnBecomeAUtester() throws Exception {
    theActorInTheSpotlight().attemptsTo(ClickOnBecomeUtester.forresgister());
    }

    @When("^user fills all the forms$")
    public void userFillsAllTheForms(List<DatosUtests> datos) throws Exception {
    theActorInTheSpotlight().attemptsTo(RegisterUserReto.makeinfomation(datos));
    }

    @Then("^the user successfully  creatted  the account$")
    public void theUserSuccessfullyCreattedTheAccount() throws Exception {
        theActorInTheSpotlight().should(seeThat(ValidateRegisterComplete.ofutest(), is(true)));
    }

    @Given("^the user has a valid account$")
    public void theUserHasAValidAccount() throws Exception {
    }

    @When("^the user clicks on Log in$")
    public void theUserClicksOnLogIn() throws Exception {

    }

    @When("^enters email$")
    public void entersEmail(DataTable arg1) throws Exception {

    }

    @When("^User puts password$")
    public void userPutsPassword(DataTable arg1) throws Exception {
    }

    @When("^clicks sign in$")
    public void clicksSignIn() throws Exception {

    }

    @Then("^the user is successfully logged in$")
    public void theUserIsSuccessfullyLoggedIn() throws Exception {

    }

    @When("^user enters email$")
    public void userEntersEmail(DataTable arg1) throws Exception {

    }

    @When("^User Clicks create an account$")
    public void userClicksCreateAnAccount() throws Exception {

    }

    @Then("^validate message account in use$")
    public void validateMessageAccountInUse() throws Exception {

    }
}
