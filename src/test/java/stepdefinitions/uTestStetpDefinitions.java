package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

public class uTestStetpDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Daniel wants to create a new user at uTest$")
    public void thanDanielWantsToCreateANewUserAtUTest() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage());
    }

    @When("^he clicks on the button Join Today$")
    public void heClicksOnTheButtonJoinToday() {
        OnStage.theActorCalled("Daniel").attemptsTo(Register.onThePage());
    }

    @Then("^he fill in the form and create a new user$")
    public void heFillInTheFormAndCreateANewUser() {
        OnStage.theActorCalled("Daniel").attemptsTo((Location.onThePage()),(Devices.onThePage()),(Password.onThePage()));
    }

}
