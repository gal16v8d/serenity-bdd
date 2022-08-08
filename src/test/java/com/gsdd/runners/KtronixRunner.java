package com.gsdd.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/ktronix.feature",
    glue = "com/gsdd/steps/ktronix",
    snippets = SnippetType.CAMELCASE
)
public class KtronixRunner {

}
