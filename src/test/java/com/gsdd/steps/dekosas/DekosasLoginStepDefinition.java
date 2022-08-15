package com.gsdd.steps.dekosas;

import com.gsdd.dekosas.model.LoginData;
import com.gsdd.dekosas.steps.DekosasPageStep;
import com.gsdd.runners.cucumber.DekosasRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;

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
    Assertions.assertNotNull(dekosasStep.getDekosasPageObject().getDriver()
        .findElement(dekosasStep.getDekosasPageObject().getAccountLink()));
  }

}
