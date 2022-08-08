package com.gsdd.steps.dekosas;

import com.gsdd.dekosas.steps.DekosasPageStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class DekosasShopStepDefinition {

  @Steps
  DekosasPageStep dekosasStep;

  @Given("^User is on shopping page$")
  public void userIsOnShoppingPage() {
    dekosasStep.openBrowser();
  }

  @When("^Select products$")
  public void selectProducts() {
    dekosasStep.clickToogleAllShop();
    dekosasStep.clickKitchen();
    dekosasStep.clickItem(dekosasStep.getDekosasPageObject().getItemOneSelect());
    dekosasStep.incrementItem();
    dekosasStep.addToShoppingCar();
    dekosasStep.goBackToMainPage();
    dekosasStep.searchProduct("monomando");
    dekosasStep.clickItem(dekosasStep.getDekosasPageObject().getItemTwoSelect());
    dekosasStep.addToShoppingCar();
  }

  @Then("^Should be on shopping car$")
  public void shouldBeOnShoppingCar() {
    Assert.assertTrue(dekosasStep.getDekosasPageObject().getDriver()
        .findElement(dekosasStep.getDekosasPageObject().getCartSummary()).isDisplayed());
  }

}
