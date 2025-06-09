package com.gsdd.runners.duckduckgo;

import static org.assertj.core.api.Assertions.assertThat;

import com.gsdd.actions.duckduckgo.DuckDuckNavigateSteps;
import com.gsdd.actions.duckduckgo.DuckDuckSearchSteps;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
class DuckDuckSearchTest {

  public static final String SHOULD_BE_ABLE_TO_SEARCH_FOR_RED_THINGS =
      "Should be able to search for red things";
  public static final String RESULT_PAGE_TITLE_SHOULD_MENTION_THE_SEARCH_TERM =
      "Result page title should mention the search term";

  @Steps DuckDuckNavigateSteps navigate;
  @Steps DuckDuckSearchSteps search;

  @Test
  @DisplayName(SHOULD_BE_ABLE_TO_SEARCH_FOR_RED_THINGS)
  void searchForRedThings() {
    navigate.opensTheHomePage();
    search.searchForTerm("red");

    Serenity.reportThat(
        SHOULD_BE_ABLE_TO_SEARCH_FOR_RED_THINGS,
        () ->
            assertThat(search.getSearchResults())
                .anyMatch(title -> title.toLowerCase().contains("red")));
  }

  @Test
  @DisplayName(RESULT_PAGE_TITLE_SHOULD_MENTION_THE_SEARCH_TERM)
  void searchForGreenThings() {
    navigate.opensTheHomePage();
    search.searchForTerm("green");

    Serenity.reportThat(
        RESULT_PAGE_TITLE_SHOULD_MENTION_THE_SEARCH_TERM,
        () -> assertThat(search.getTitle()).containsIgnoringCase("green"));
  }
}
