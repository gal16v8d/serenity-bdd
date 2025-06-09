package com.gsdd.pageobjects.youtube;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://youtube.com/")
public class YoutubeSearch extends PageObject {

  public static final By SEARCH_QUERY = By.name("search_query");
  public static final By SEARCH_ICON = By.xpath("//button[@aria-label='Search']");
  public static final By RESULT_CONTENT = By.id("contents");
  public static final By VIDEO =
      By.xpath(
          "//a[@title='Digimon World 2 - Interrupt vs Interrupt [Bug]' and @id='video-title' and"
              + " @class='yt-simple-endpoint style-scope ytd-video-renderer']");
}
