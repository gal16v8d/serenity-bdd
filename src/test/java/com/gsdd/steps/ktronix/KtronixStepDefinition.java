package com.gsdd.steps.ktronix;

import com.gsdd.ktronix.steps.KtronixMainPageStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class KtronixStepDefinition {
  
  @Steps
  KtronixMainPageStep ktronixStep;
  
  @Given("^User is on main page$")
  public void userIsOnMainPage() {
      ktronixStep.openBrowser();
  }


  @When("^Click on computers link$")
  public void clickOnComputersLink() {
      ktronixStep.clickComputersLink();
  }

  @Then("^Computers page should be visible$")
  public void computersPageShouldBeVisible() {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }

}
