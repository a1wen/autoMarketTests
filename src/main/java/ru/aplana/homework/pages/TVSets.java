package ru.aplana.homework.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by a1wen on 02.04.2017.
 */
public class TVSets extends PageObject {
    @FindBy(id = "glf-pricefrom-var")
    public WebElement priceFrom;

    @FindBy(id = "glf-7893318-153074")
    public WebElement checkLG;

    @FindBy(id = "glf-7893318-153061")
    public WebElement checkSamsung;

    @FindBy(linkText = "Применить")
    public WebElement submit;

    @FindBy(css = "div.snippet-list:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
    public WebElement firstTVSet;

    public void submitFilter(){
        submit.click();
    }

    public String getPriceFrom(){
        return priceFrom.getText();
    }

    public String getFirstTVSet(){
        return firstTVSet.getText();
    }

    @Override
    public void setCheckbox(WebElement field, boolean value) {
        super.setCheckbox(field, value);
    }
}
