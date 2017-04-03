package ru.aplana.homework.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by a1wen on 02.04.2017.
 */
public class ProductsPage extends PageObject {
    @FindBy(id = "glf-pricefrom-var")
    public WebElement priceFrom;

    //@FindBy(id = "glf-7893318-153074")
    @FindBy(xpath = "//label[text()='LG']")// /parent::span/span/input[@type='checkbox']
    public WebElement checkLG;

    //@FindBy(id = "glf-7893318-153061")
    //@FindBy(xpath = "//label[text()='Samsung']/preceding-sibling::input[@type='checkbox']")
    @FindBy(xpath = "//label[text()='Samsung']")
    public WebElement checkSamsung;

    @FindBy(xpath = "//label[text()='Beats']")
    public WebElement checkBeats;

    @FindBy(xpath = "//*[contains(text(), 'Применить')]/parent::button")
    public WebElement submit;

    @FindBy(xpath = "//div[contains(@class, 'n-snippet-card')]")
    public List<WebElement> snippets;

    //@FindBy(css = "div.snippet-list:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h3:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
    @FindBy(xpath = "//span[contains(@class, 'snippet-card__header')]")
    public List<WebElement> productNames;

    @FindBy(xpath = ".//*[@id='header-search']")
    public WebElement headerSearch;

    @FindBy(xpath = "//span[@class = 'search2__button']")
    public WebElement headerSearchSubmit;

    public void submitFilter(){
        submit.click();
    }

    public void submitHeaderSearch(){
        headerSearch.click();
    }

    public String getPriceFrom(){
        return priceFrom.getAttribute("value");
    }

    public String getFirstItem(int index){
        return productNames.get(index).getText();
    }

    public int getQuantityElements(){
        return snippets.size();
    }

}
