package com.gsdd.steps.dekosas;

import com.gsdd.dekosas.steps.DekosasPageStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;

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
    Assertions.assertTrue(dekosasStep.getDekosasPageObject().getDriver()
        .findElement(dekosasStep.getDekosasPageObject().getCartSummary()).isDisplayed());
  }

}
