package ru.aplana.homework.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by a1wen on 02.04.2017.
 */
public class MainPage extends PageObject{
    //@FindBy(css = "div.home-tabs > a")
    @FindBy(linkText = "Маркет")
    public WebElement market;
}
