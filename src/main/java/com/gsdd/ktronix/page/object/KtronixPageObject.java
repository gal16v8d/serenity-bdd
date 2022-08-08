package com.gsdd.ktronix.page.object;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("https://ktronix.com")
public class KtronixPageObject extends PageObject {

  By titleComputers = By.xpath("//a[@title='Computadores e Impresoras']");
  
}
