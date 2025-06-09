package com.gsdd.actions.youtube;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import com.gsdd.pageobjects.youtube.YoutubeSearch;
import java.time.Duration;
import java.util.List;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class YoutubeSearchSteps extends UIInteractionSteps {

  YoutubeSearch searchPage;

  @Step("User searches for '{0}'")
  public void searchForTerm(String searchTerm) {
    find(YoutubeSearch.SEARCH_QUERY).sendKeys(searchTerm);
    find(YoutubeSearch.SEARCH_ICON).click();
    withTimeoutOf(Duration.ofSeconds(10))
        .waitFor(presenceOfElementLocated(YoutubeSearch.RESULT_CONTENT));
  }

  @Step("Check the search results")
  public List<String> getSearchResults() {
    return findAll(YoutubeSearch.VIDEO).texts();
  }
}
