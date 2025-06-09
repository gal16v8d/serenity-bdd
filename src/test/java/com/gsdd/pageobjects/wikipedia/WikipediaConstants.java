package com.gsdd.pageobjects.wikipedia;

import lombok.experimental.UtilityClass;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.InputField;

@UtilityClass
public class WikipediaConstants {
  public static final String SEARCH_FIELD = "#firstHeading";
  public static final Target SEARCH = InputField.withNameOrId("search");
}
