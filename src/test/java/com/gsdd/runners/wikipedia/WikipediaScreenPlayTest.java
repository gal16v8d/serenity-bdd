package com.gsdd.runners.wikipedia;

import com.gsdd.pageobjects.wikipedia.DisplayedArticle;
import com.gsdd.pageobjects.wikipedia.Navigate;
import com.gsdd.pageobjects.wikipedia.Search;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
class WikipediaScreenPlayTest {

  public static final String SEARCH_TEXT = "Dross (YouTuber)";
  public static final String EXPECTED = "Dross (YouTuber)";

  @Managed(driver = "firefox")
  private WebDriver browser;

  @CastMember(name = "foxy")
  private Actor foxy;

  @Test
  void searchByKeyword() {
    foxy.attemptsTo(
        Navigate.toTheHomePage(),
        Search.byKeyword(SEARCH_TEXT),
        Ensure.that(DisplayedArticle.firstHeading()).isEqualTo(EXPECTED));
  }
}
