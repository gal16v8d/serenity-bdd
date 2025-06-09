package com.gsdd.pageobjects.wikipedia;

import lombok.experimental.UtilityClass;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

@UtilityClass
public class Navigate {
  /** An action that opens the browser on the Wikipedia home page */
  public static Performable toTheHomePage() {
    return Open.url("http://wikipedia.com/");
  }
}
