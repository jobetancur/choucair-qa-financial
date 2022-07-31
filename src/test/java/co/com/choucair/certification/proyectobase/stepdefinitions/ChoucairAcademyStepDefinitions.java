package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UtestDataUser;
import co.com.choucair.certification.proyectobase.questions.Reply;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Alejandro wants to register in utest$")
    public void thanAlejandroWantsToRegisterInUtest() {
        OnStage.theActorCalled("Alejandro").wasAbleTo(OpenUp.thePage());
    }


    @When("^the user enters the required data$")
    public void theUserEntersTheRequiredData(List<UtestDataUser> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theFields(data), FillLocation.theFields(data),
                FillDevice.theFields(data), FillLastStep.theFields(data));
    }

    @Then("^registration is completed$")
    public void registrationIsCompleted(List<UtestDataUser> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Reply.to(data)));
    }

}
