package com.gsdd.actions.chess;

import com.gsdd.pageobjects.chess.ChessSearch;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class ChessNavigateSteps extends UIInteractionSteps {

  ChessSearch searchPage;

  @Step("User opens the home page")
  public void opensTheHomePage() {
    searchPage.open();
  }
}
