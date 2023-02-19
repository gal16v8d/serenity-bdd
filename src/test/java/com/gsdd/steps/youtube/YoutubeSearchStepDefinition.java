package com.gsdd.steps.youtube;

import com.gsdd.runners.cucumber.DekosasRunner;
import com.gsdd.youtube.steps.YoutubePageStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class YoutubeSearchStepDefinition {
  
  @Steps
  YoutubePageStep ytStep;
  
  @Given("^User is on main page$")
  public void userIsOnMainPage() {
    ytStep.openBrowser();
  }
  
  @When("^Page loads and search$")
  public void searchOnYt() {
    ytStep.enterSearchTerms("interrupt vs interrupt galv-9s", DekosasRunner.WAIT_SEC);
    ytStep.clickSearch();
  }
  
  @Then("^Video is available$")
  public void checkVideo() {
    Assertions.assertNotNull(ytStep.getYtPageObject().getDriver()
        .findElement(ytStep.getYtPageObject().getVideo()));
  }

}
