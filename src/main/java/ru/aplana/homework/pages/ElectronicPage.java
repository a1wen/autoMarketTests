package ru.aplana.homework.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by a1wen on 02.04.2017.
 */
public class ElectronicPage extends PageObject{
    //@FindBy(linkText = "Телевизоры")
    @FindBy(css = "div.catalog-menu__item:nth-child(3) > div:nth-child(2) > a:nth-child(1)")
    public WebElement tvSet;

    @FindBy(css = ".link.catalog-menu__list-item.metrika.i-bem.metrika_js_inited")
    public WebElement headphones;
}
