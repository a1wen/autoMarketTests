package ru.aplana.homework.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;
import ru.aplana.homework.pages.*;

import static org.junit.Assert.*;

/**
 * Created by a1wen on 02.04.2017.
 */
public class BaseSteps extends ScenarioSteps{
    MainPage mainpage;
    MarketPage marketPage;
    ElectronicPage electronicPage;
    TVSets tvSets;
    Headphones phones;
    ItemPage item;

    @Step("Переход на страницу Маркета")
    public void gotoMarket(){
        mainpage.market.click();
    }

    @Step("Переход на страницу \"Электроника\"")
    public void gotoElectronic() {
        marketPage.electronic.click();
    }

    @Step("Переход на страницу \"Телевизоры\"")
    public void gotoTV(){
        electronicPage.tvSet.click();
    }

    @Step("Переход на струницу \"Наушники\"")
    public void gotoHeadphones(){
        electronicPage.headphones.click();
    }

    @Step("Заполнение фильтра \"Цена от\" {0}")
    public void fillPriceFrom(String price){
        tvSets.priceFrom.sendKeys(price);
        tvSets.priceFrom.sendKeys(Keys.ENTER);
    }

    @Step("Заполнение фильтра \"Цена\" наушников {0}")
    public void fillPriceHeadphones(String price){
        phones.priceFrom.sendKeys(price);
        phones.priceFrom.sendKeys(Keys.ENTER);
    }

    @Step("Проверка введенного значения {0}")
    public void checkPriceFrom(String price){
        assertEquals(price, tvSets.getPriceFrom());
    }

    @Step("Применить фильтр")
    public void submitFilter(){
        tvSets.submitFilter();
    }

    @Step("Нажать чек-бокс LG")
    public void clickCheckLG(){
        tvSets.checkLG.click();
    }

    @Step("Нажать чек-бокс Samsung")
    public void clickCheckSamsung(){
        tvSets.checkSamsung.click();
    }

    @Step("Проверка количества элементов на странице, {0}")
    public void checkQuantityElements(int quantity){
        assertEquals(quantity, tvSets.getQuantityElements());
    }

    @Step("Получить название элемента {0}")
    public String getFirstTVSet(int index){
        return tvSets.getFirstTVSet(index);
    }

   @Step("Ввод значения первого элемента в поисковую строку")
    public void fillHeaderSearch(String value){
        tvSets.headerSearch.sendKeys(value);
    }

    @Step("Поиск найденного первого элемента")
    public void submitHeaderSearch(){
        tvSets.submitHeaderSearch();
    }

    @Step("Проверка соответствия значений названия продукта")
    public void checkItemName(String expectedName){
        assertEquals(expectedName, item.getItemName());
    }
/*
    @Step("Нажатие чекбоксов")
    public void setCheckBox(){
        tvSets.setCheckbox(tvSets.checkLG, true);
        tvSets.setCheckbox(tvSets.checkSamsung, true);
    }
*/
}
