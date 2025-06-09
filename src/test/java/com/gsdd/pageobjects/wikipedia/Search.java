package com.gsdd.pageobjects.wikipedia;

import static com.gsdd.pageobjects.wikipedia.WikipediaConstants.SEARCH;

import lombok.experimental.UtilityClass;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

@UtilityClass
public class Search {

  public static Performable byKeyword(String keyword) {
    return Task.where(
        "{0} searches for articles containing they word " + keyword,
        Enter.theValue(keyword).into(SEARCH).thenHit(Keys.ENTER));
  }
}
