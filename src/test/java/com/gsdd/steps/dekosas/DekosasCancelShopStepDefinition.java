package com.gsdd.steps.dekosas;

import com.gsdd.dekosas.model.BuyData;
import com.gsdd.dekosas.steps.DekosasPageStep;
import com.gsdd.runners.DekosasRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class DekosasCancelShopStepDefinition {

  @Steps
  DekosasPageStep dekosasStep;

  @Given("^User select products to buy$")
  public void userSelectProductsToBuy() {
    dekosasStep.openBrowser();
  }


  @When("^Perform cancel$")
  public void performCancel() {
    dekosasStep.searchProduct("monomando");
    dekosasStep.clickItem(dekosasStep.getDekosasPageObject().getItemOneSelect());
    dekosasStep.addToShoppingCar();
    dekosasStep.searchProduct("monomando");
    dekosasStep.clickItem(dekosasStep.getDekosasPageObject().getItemTwoSelect());
    dekosasStep.addToShoppingCar();
    dekosasStep.searchProduct("induccion");
    dekosasStep.clickItem(dekosasStep.getDekosasPageObject().getItemThreeSelect());
    dekosasStep.addToShoppingCar();
    dekosasStep.clickBuy(DekosasRunner.WAIT_SEC);
    BuyData data = BuyData.builder().email("probando@gmail.com").name("Pepito").lastName("Perez")
        .address("Calle falsa 123").country("Colombia").state("Antioquia").city("Sabaneta")
        .number(3156667788L).docType("Cédula de Ciudadanía").docNumber(1014654299L).build();
    dekosasStep.fillForm(data, DekosasRunner.WAIT_SEC);
    dekosasStep.clickFormNext(DekosasRunner.WAIT_SEC);
    dekosasStep.navigateToCart();
    for (int i = 0; i < 3; i++) {
      dekosasStep.clickRemoveFromCart(DekosasRunner.WAIT_SEC);
    }
    dekosasStep.confirmCartEmpty(DekosasRunner.WAIT_SEC);
  }

  @Then("^Shop gets cancel$")
  public void shopGetsCancel() {
    Assert.assertTrue(dekosasStep.getDekosasPageObject().getDriver()
        .findElement(dekosasStep.getDekosasPageObject().getCartEmpty()).isDisplayed());
  }

}
