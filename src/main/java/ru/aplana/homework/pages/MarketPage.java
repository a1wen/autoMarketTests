package ru.aplana.homework.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by a1wen on 02.04.2017.
 */

public class MarketPage extends PageObject{
    //@FindBy(css = "div.topmenu > ul.topmenu__list > li.topmenu__item > a")
    @FindBy(linkText = "Электроника")
    public WebElement electronic;
}
