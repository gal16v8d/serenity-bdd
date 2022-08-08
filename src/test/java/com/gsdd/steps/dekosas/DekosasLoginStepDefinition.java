package com.gsdd.steps.dekosas;

import com.gsdd.dekosas.model.LoginData;
import com.gsdd.dekosas.steps.DekosasPageStep;
import com.gsdd.runners.DekosasRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class DekosasLoginStepDefinition {

  @Steps
  DekosasPageStep dekosasStep;

  @Given("^User is on main page$")
  public void userIsOnMainPage() {
    dekosasStep.openBrowser();
  }


  @When("^Prompt to login$")
  public void promptToLogin() {
    dekosasStep.clickMyAccount(DekosasRunner.WAIT_SEC);
    dekosasStep.fillLoginData(
        LoginData.builder().user("probando@gmail.com").pass("Probando123").build(),
        DekosasRunner.WAIT_SEC);
    dekosasStep.clickLogin();
  }

  @Then("^User gets logged$")
  public void userGetsLogged() {
    Assert.assertNotNull(dekosasStep.getDekosasPageObject().getDriver()
        .findElement(dekosasStep.getDekosasPageObject().getAccountLink()));
  }

}
