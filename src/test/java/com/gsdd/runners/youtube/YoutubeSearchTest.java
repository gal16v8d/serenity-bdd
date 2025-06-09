package com.gsdd.runners.youtube;

import static org.assertj.core.api.Assertions.assertThat;

import com.gsdd.actions.youtube.YoutubeNavigateSteps;
import com.gsdd.actions.youtube.YoutubeSearchSteps;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
class YoutubeSearchTest {

  public static final String SHOULD_BE_ABLE_TO_SEARCH_VIDEO = "Should be able to search video";
  @Steps YoutubeNavigateSteps navigate;

  @Steps YoutubeSearchSteps search;

  @Test
  @DisplayName(SHOULD_BE_ABLE_TO_SEARCH_VIDEO)
  void searchForVideo() {
    navigate.opensTheHomePage();
    search.searchForTerm("interrupt vs interrupt galv-9s");

    Serenity.reportThat(
        SHOULD_BE_ABLE_TO_SEARCH_VIDEO, () -> assertThat(search.getSearchResults()).isNotEmpty());
  }
}
