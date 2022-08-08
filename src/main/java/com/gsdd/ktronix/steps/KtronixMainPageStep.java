package com.gsdd.ktronix.steps;

import com.gsdd.ktronix.page.object.KtronixPageObject;
import net.thucydides.core.annotations.Step;

public class KtronixMainPageStep {

  KtronixPageObject ktronixPageObject = new KtronixPageObject();

  @Step
  public void openBrowser() {
    ktronixPageObject.open();
  }

  @Step
  public void clickComputersLink() {
    ktronixPageObject.getDriver().findElement(ktronixPageObject.getTitleComputers()).click();
  }

}
