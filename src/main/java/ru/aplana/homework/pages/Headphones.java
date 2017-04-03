package ru.aplana.homework.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by a1wen on 03.04.2017.
 */
public class Headphones extends PageObject {
    @FindBy(id = "glf-pricefrom-var")
    public WebElement priceFrom;

    @FindBy(xpath = "//label[text()='Beats']")
    public WebElement checkBeats;


}
