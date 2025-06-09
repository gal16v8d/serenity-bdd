package com.gsdd.actions.duckduckgo;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import com.gsdd.pageobjects.duckduckgo.DuckDuckSearch;
import java.time.Duration;
import java.util.List;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class DuckDuckSearchSteps extends UIInteractionSteps {

  @Step("User searches for '{0}'")
  public void searchForTerm(String searchTerm) {
    find(DuckDuckSearch.SEARCH_FIELD).sendKeys(searchTerm);
    find(DuckDuckSearch.SEARCH_BUTTON).click();
    withTimeoutOf(Duration.ofSeconds(10))
        .waitFor(presenceOfElementLocated(DuckDuckSearch.ARTICLE_HEADINGS));
  }

  @Step("Check the search results")
  public List<String> getSearchResults() {
    return findAll(DuckDuckSearch.ARTICLE_HEADINGS).texts();
  }
}
