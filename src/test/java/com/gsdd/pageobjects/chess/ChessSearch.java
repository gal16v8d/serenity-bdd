package com.gsdd.pageobjects.chess;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.chess.com/")
public class ChessSearch extends PageObject {
  public static final By SEARCH_FIELD = By.className("index-chess-title");
  public static final By PLAY_LINK =
      By.xpath("//a[@data-nav-link='play' and @href='https://www.chess.com/play']");
  public static final By PLAY_BOT = By.xpath("//a[@href='/play/computer']");
  public static final By BOT_SECTION = By.className("bot-group-list-scroll");
}
