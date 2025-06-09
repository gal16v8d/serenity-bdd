package com.gsdd.actions.duckduckgo;

import com.gsdd.pageobjects.duckduckgo.DuckDuckSearch;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class DuckDuckNavigateSteps extends UIInteractionSteps {

  DuckDuckSearch searchPage;

  @Step("User opens the home page")
  public void opensTheHomePage() {
    searchPage.open();
  }
}
