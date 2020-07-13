package com.banistmo.personas.certification.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.banistmo.personas.certification.task.RateTask.actorRateOptions;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RunnerStepDefinitions {
     @Before
     public void OpenPage() {
         OnStage.setTheStage(new OnlineCast());
     }
     @When("^(.*) is on the People Banismto Page you select the (.*)$")
    public void IsOnThePeopleBanismtoPageYouSelectThe(String strActor, String strOptions) {
       theActorCalled(strActor).attemptsTo(actorRateOptions(strActor,strOptions));
    }

    @Then("^you will see the pdf of (.*)$")
    public void youWillSeeThePdfOfFileName(String strFileName) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
