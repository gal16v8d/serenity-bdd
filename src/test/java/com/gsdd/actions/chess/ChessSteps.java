package com.gsdd.actions.chess;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import com.gsdd.pageobjects.chess.ChessSearch;
import com.gsdd.utils.PageUtils;
import java.time.Duration;
import java.util.List;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class ChessSteps extends UIInteractionSteps {

  ChessSearch searchPage;

  @Step("User click to play a bot")
  public void clickToPlayBot() {
    find(ChessSearch.PLAY_LINK).click();
    find(ChessSearch.PLAY_BOT).click();
    withTimeoutOf(Duration.ofSeconds(10))
        .waitFor(presenceOfElementLocated(ChessSearch.BOT_SECTION));
  }

  @Step("Check coach section")
  public List<String> checkBotSection() {
    return findAll(ChessSearch.BOT_SECTION).texts();
  }

  @Step("User scrolls to puzzles section")
  public void scrollToPuzzles() {
    PageUtils.scrollElement(searchPage.getDriver(), ChessSearch.SEARCH_FIELD);
  }

  @Step("Check solve chess puzzles section")
  public List<String> checkSolveChessPuzzlesSection() {
    return findAll(ChessSearch.SEARCH_FIELD).texts();
  }
}
