package com.gsdd.runners;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.CoreMatchers.containsString;
import com.gsdd.wikipedia.page.object.WikipediaPageObject;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;


@ExtendWith(SerenityJUnit5Extension.class)
class WikipediaScreenPlayTest {

  public static final String TEXT = "Everest";
  @Managed(driver = "firefox")
  private WebDriver browser;
  @CastMember(name = "foxy")
  private Actor foxy;
  private WikipediaPageObject pageObject = new WikipediaPageObject();

  @BeforeEach
  void setUp() {
    foxy.can(BrowseTheWeb.with(browser));
  }

  @Test
  void searchByKeyword() {
    givenThat(foxy).wasAbleTo(Open.browserOn(pageObject));
    when(foxy).attemptsTo(pageObject.searchByKeyword(TEXT));
    then(foxy).should(seeThat(pageObject.firstHeading(), containsString("Mount Everest")));
  }

}
