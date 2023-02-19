package com.gsdd.runners.cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = {"src/test/resources/features/youtube/open.feature"},
    glue = "com/gsdd/steps/youtube", snippets = SnippetType.CAMELCASE)
public class YoutubeRunner {
  
  public static final int WAIT_SEC = 30;

}
