package com.gsdd.actions.youtube;

import com.gsdd.pageobjects.youtube.YoutubeSearch;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class YoutubeNavigateSteps extends UIInteractionSteps {

  YoutubeSearch searchPage;

  @Step("User opens the home page")
  public void opensTheHomePage() {
    searchPage.open();
  }
}
