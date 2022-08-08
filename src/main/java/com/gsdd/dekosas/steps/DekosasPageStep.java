package com.gsdd.dekosas.steps;

import com.gsdd.dekosas.model.BuyData;
import com.gsdd.dekosas.model.LoginData;
import com.gsdd.dekosas.page.object.DekosasPageObject;
import com.gsdd.utils.PageUtils;
import lombok.Getter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Getter
public class DekosasPageStep {

  DekosasPageObject dekosasPageObject = new DekosasPageObject();

  @Step
  public void openBrowser() {
    dekosasPageObject.open();
  }

  @Step
  public void clickMyAccount(int wait) {
    PageUtils.awaitFor(dekosasPageObject.getDriver(), wait)
        .until(ExpectedConditions.elementToBeClickable(dekosasPageObject.getMyAccount()));
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getMyAccount()).click();
  }

  @Step
  public void fillLoginData(LoginData data, int wait) {
    PageUtils.awaitFor(dekosasPageObject.getDriver(), wait)
        .until(ExpectedConditions.elementToBeClickable(dekosasPageObject.getUsername()));
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getUsername())
        .sendKeys(data.getUser());
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getPassword())
        .sendKeys(data.getPass());
  }

  @Step
  public void clickLogin() {
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getButtonSubmit()).click(); 
  }

  @Step
  public void clickToogleAllShop() {
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getAllShop()).click();
  }

  @Step
  public void clickKitchen() {
    dekosasPageObject.withAction()
        .moveToElement(dekosasPageObject.getDriver().findElement(dekosasPageObject.getKitchen()), 0,
            50)
        .moveToElement(
            dekosasPageObject.getDriver().findElement(dekosasPageObject.getKitchenAccessories()))
        .click().build().perform();
  }

  @Step
  public void clickItem(By item) {
    PageUtils.clickItem(dekosasPageObject.getDriver(), item);
  }

  @Step
  public void incrementItem() {
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getIncrement())
        .sendKeys(Keys.ARROW_RIGHT, Keys.BACK_SPACE, "3");
  }

  @Step
  public void addToShoppingCar() {
    PageUtils.awaitFor(dekosasPageObject.getDriver(), 5).until(ExpectedConditions.invisibilityOf(
        dekosasPageObject.getDriver().findElement(dekosasPageObject.getDivMaskButtonCar())));
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getButtonCar()).click();
  }

  @Step
  public void goBackToMainPage() {
    dekosasPageObject.getDriver().get("https://dekosas.com/co/");
  }

  @Step
  public void searchProduct(String searchKey) {
    PageUtils.searchProduct(dekosasPageObject.getDriver(), dekosasPageObject.getSearchTxt(),
        searchKey);
  }

  @Step
  public void clickBuy(int wait) {
    PageUtils.awaitFor(dekosasPageObject.getDriver(), wait)
        .until(ExpectedConditions.presenceOfElementLocated(dekosasPageObject.getTotal()));
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getGoToBuy()).click();
  }

  @Step
  public void fillForm(BuyData data, int wait) {
    PageUtils.awaitFor(dekosasPageObject.getDriver(), wait)
        .until(ExpectedConditions.elementToBeClickable(dekosasPageObject.getFormBuyEmail()));
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getFormBuyEmail())
        .sendKeys(data.getEmail());
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getFormBuyName())
        .sendKeys(data.getName());
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getFormBuyLastName())
        .sendKeys(data.getLastName());
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getFormBuyAddress())
        .sendKeys(data.getAddress());
    PageUtils.selectVisibleText(dekosasPageObject.getDriver(),
        dekosasPageObject.getFormBuyCountry(), data.getCountry());
    PageUtils.selectVisibleText(dekosasPageObject.getDriver(), dekosasPageObject.getFormBuyState(),
        data.getState());
    PageUtils.awaitFor(dekosasPageObject.getDriver(), wait)
        .until(ExpectedConditions.elementToBeClickable(dekosasPageObject.getFormBuyCity()));
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getFormBuyCity())
        .sendKeys(data.getCity());
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getFormBuyNumber())
        .sendKeys(data.getNumber().toString());
    PageUtils.selectVisibleText(dekosasPageObject.getDriver(),
        dekosasPageObject.getFormBuyDocType(), data.getDocType());
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getFormBuyDocNumber())
        .sendKeys(data.getDocNumber().toString());
  }

  @Step
  public void clickFormNext(int wait) {
    PageUtils.awaitFor(dekosasPageObject.getDriver(), wait)
        .until(ExpectedConditions.elementToBeClickable(dekosasPageObject.getFormButtonNext()));
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getFormButtonNext()).click();
  }

  @Step
  public void navigateToCart() {
    dekosasPageObject.getDriver().get("https://dekosas.com/co/checkout/cart/");
  }

  @Step
  public void clickRemoveFromCart(int wait) {
    PageUtils.awaitFor(dekosasPageObject.getDriver(), wait)
        .until(ExpectedConditions.presenceOfElementLocated(dekosasPageObject.getTotal()));
    dekosasPageObject.getDriver().findElement(dekosasPageObject.getCartDelete()).click();
  }

  @Step
  public void confirmCartEmpty(int wait) {
    PageUtils.awaitFor(dekosasPageObject.getDriver(), wait)
        .until(ExpectedConditions.presenceOfElementLocated(dekosasPageObject.getCartEmpty()));
  }

}
