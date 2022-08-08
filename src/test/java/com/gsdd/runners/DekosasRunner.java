package com.gsdd.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = {"src/test/resources/features/dekosas/login.feature",
        "src/test/resources/features/dekosas/shop.feature",
        "src/test/resources/features/dekosas/cancel_shop.feature"},
    glue = "com/gsdd/steps/dekosas", snippets = SnippetType.CAMELCASE)
public class DekosasRunner {
  
  public static final int WAIT_SEC = 30;

}
