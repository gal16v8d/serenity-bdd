package com.gsdd.pageobjects.wikipedia;

import static com.gsdd.pageobjects.wikipedia.WikipediaConstants.SEARCH_FIELD;

import lombok.experimental.UtilityClass;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

@UtilityClass
public class DisplayedArticle {
  public static Question<String> firstHeading() {
    return Text.of(SEARCH_FIELD);
  }
}
