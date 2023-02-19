package com.gsdd.youtube.steps;

import com.gsdd.utils.PageUtils;
import com.gsdd.youtube.page.object.YoutubePageObject;
import lombok.Getter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Getter
public class YoutubePageStep {

  YoutubePageObject ytPageObject = new YoutubePageObject();

  @Step
  public void openBrowser() {
    ytPageObject.open();
  }

  @Step
  public void enterSearchTerms(String input, int wait) {
    PageUtils.awaitFor(ytPageObject.getDriver(), wait)
        .until(ExpectedConditions.elementToBeClickable(ytPageObject.getSearchQuery()));
    ytPageObject.getDriver().findElement(ytPageObject.getSearchQuery()).sendKeys(input);
  }

  @Step
  public void clickSearch() {
    ytPageObject.getDriver().findElement(ytPageObject.getSearchIcon()).click();
  }

}
