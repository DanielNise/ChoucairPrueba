package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import model.uTestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

import java.util.List;

public class uTestStetpDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than Daniel wants to create a new user at uTest$")
    public void thanDanielWantsToCreateANewUserAtUTest(List<uTestData> uTestData) throws  Exception {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage());
    }

    @When("^he clicks on the button Join Today$")
    public void heClicksOnTheButtonJoinToday(List<uTestData> uTestData) throws  Exception {
        OnStage.theActorCalled("Daniel").attemptsTo(Register.onThePage(uTestData.get(0).getStrFirstName(),uTestData.get(0).getStrLastName()
                                , uTestData.get(0).getSrtEmail(), uTestData.get(0).getSrtBirthMonth(), uTestData.get(0).getStrBirthDay(),uTestData.get(0).getStrBirthYear()));
    }

    @Then("^he fill in the form and create a new user$")
    public void heFillInTheFormAndCreateANewUser(List<uTestData> uTestData) throws  Exception {
        OnStage.theActorCalled("Daniel").attemptsTo((Location.onThePage()),(Devices.onThePage()),(Password.onThePage(uTestData.get(0).getStrPassword(),uTestData.get(0).getStrConfirmPassword())));
    }

}
