package com.gsdd.runners;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.CoreMatchers.containsString;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.ui.InputField;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


@ExtendWith(SerenityJUnit5Extension.class)
class WikipediaScreenPlayTest {

  public static final String TEXT = "Everest";
  @Managed(driver = "firefox")
  private WebDriver browser;
  @CastMember(name = "foxy")
  private Actor foxy;
  
  private Performable navigateToTheHomePage() {
    return Open.url("http://wikipedia.com/");
  }
  
  private Performable searchByKeyword(String keyword) {
    return Task.where("{0} searches for articles containing they word " + keyword,
        Enter.theValue(keyword).into(InputField.withNameOrId("search")).thenHit(Keys.ENTER));
  }
  
  private Question<String> firstHeading() {
    return Text.of("#firstHeading");
  }

  @Test
  void searchByKeyword() {
    givenThat(foxy).wasAbleTo(navigateToTheHomePage());
    when(foxy).attemptsTo(searchByKeyword(TEXT));
    then(foxy).should(seeThat(firstHeading(), containsString("Mount Everest")));
  }

}
