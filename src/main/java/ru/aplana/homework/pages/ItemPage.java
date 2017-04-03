package ru.aplana.homework.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by a1wen on 03.04.2017.
 */
public class ItemPage extends PageObject {
    @FindBy(xpath = "*//h1[@class = 'title title_22']")
    public WebElement result;

    public String getItemName(){
        return result.getText();
    }
}
