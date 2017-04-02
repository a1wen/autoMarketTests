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

    public void submitFilter(){
        submit.click();
    }

    public String getPriceFrom(){
        return priceFrom.getText();
    }


}
