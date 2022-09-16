package com.gsdd.wikipedia.page.object;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.InputField;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@Getter
@DefaultUrl("http://wikipedia.com/")
public class WikipediaPageObject extends PageObject {
  
  public static final Target SEARCH = InputField.withNameOrId("search");
  
  public Performable searchByKeyword(String keyword) {
    return Task.where("{0} searches for articles containing they word " + keyword,
        Enter.theValue(keyword).into(SEARCH).thenHit(Keys.ENTER));
  }
  
  public Question<String> firstHeading() {
    return Text.of("#firstHeading");
  }

}
