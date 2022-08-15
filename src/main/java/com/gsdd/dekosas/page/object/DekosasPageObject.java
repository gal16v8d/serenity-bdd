package com.gsdd.dekosas.page.object;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("https://dekosas.com/co/")
public class DekosasPageObject extends PageObject {
  
  By myAccount = By.xpath("//*[text()='Mi Cuenta']");
  By username = By.id("social_login_email");
  By password = By.id("social_login_pass");
  By buttonSubmit = By.id("bnt-social-login-authentication");
  By accountLink = By.xpath("//a[@href='/co/customer/account/']");
  By allShop = By.className("menu-title");
  By kitchen = By.xpath("//a[@class='level-top' and @href='https://dekosas.com/co/mesa-y-cocina']");
  By kitchenAccessories = By.xpath("//a[@href='https://dekosas.com/co/mesa-y-cocina/accesorios-de-cocina']");
  By itemOneSelect = By.xpath("//a[@class='product-item-link' and @href='https://dekosas.com/co/mezclador-monomando-gold-tramontina']");
  By itemTwoSelect = By.xpath("//a[@class='product-item-link' and @href='https://dekosas.com/co/mezclador-monomando-black-tramontina']");
  By itemThreeSelect = By.xpath("//a[@class='product-item-link' and @href='https://dekosas.com/co/placa-de-coccion-por-induccion-tramontina']");
  By increment = By.xpath("//input[@class='input-text qty']");
  By buttonCar = By.id("product-addtocart-button");
  By divMaskButtonCar = By.xpath("//div[@class='loading-mask']");
  By searchTxt = By.id("search");
  By cartSummary = By.xpath("//div[@class='cart-summary']");
  By total = By.xpath("//strong[text()='Total del pedido']");
  By goToBuy = By.xpath("//button[@data-role='proceed-to-checkout']");
  By formBuyEmail = By.id("customer-email");
  By formBuyName = By.xpath("//input[@name='firstname' and @class='input-text']");
  By formBuyLastName = By.xpath("//input[@name='lastname' and @class='input-text']");
  By formBuyAddress = By.xpath("//input[@name='street[0]' and @class='input-text']");
  By formBuyCountry = By.xpath("//select[@name='country_id' and @class='select']");
  By formBuyState = By.xpath("//select[@name='region_id' and @class='select']");
  By formBuyCity = By.xpath("//select[@name='city-select' and @class='select']");
  By formBuyNumber = By.xpath("//input[@name='telephone' and @class='input-text']");
  By formBuyDocType = By.xpath("//select[@name='bss_custom_field[tipo_identidad]' and @class='select']");
  By formBuyDocNumber = By.xpath("//input[@name='bss_custom_field[cedula_o_nit]' and @class='input-text']");
  By formButtonNext = By.xpath("//button[@data-role='opc-continue']");
  By cartDelete = By.xpath("//a[@title='Eliminar artículo' and @class='action action-delete']");
  By cartEmpty = By.xpath("//div[@class='cart-empty text-center']");
  
}
