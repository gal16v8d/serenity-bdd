package com.gsdd.youtube.page.object;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("https://youtube.com/")
public class YoutubePageObject extends PageObject {

  By searchQuery = By.name("search_query");
  By searchIcon = By.id("search-icon-legacy");
  By video = By.xpath(
      "//a[@title='Digimon World 2 - Interrupt vs Interrupt [Bug]' and @id='video-title' and @class='yt-simple-endpoint style-scope ytd-video-renderer']");
}
