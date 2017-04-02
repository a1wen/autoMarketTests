package ru.aplana.homework.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;
import ru.aplana.homework.pages.ElectronicPage;
import ru.aplana.homework.pages.MainPage;
import ru.aplana.homework.pages.MarketPage;
import ru.aplana.homework.pages.TVSets;

import static org.junit.Assert.*;

/**
 * Created by a1wen on 02.04.2017.
 */
public class BaseSteps extends ScenarioSteps{
    MainPage mainpage;
    MarketPage marketPage;
    ElectronicPage electronicPage;
    TVSets tvSets;

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

    @Step("Заполнение фильтра \"Цена от\" {0}")
    public void fillPriceFrom(String price){
        tvSets.priceFrom.sendKeys(price);
        tvSets.priceFrom.sendKeys(Keys.ENTER);
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

    @Step("Ввод значения первого элемента в поисковую строку")
    public void fillHeaderSearch(){
        tvSets.headerSearch.sendKeys(tvSets.getFirstTVSet());
    }

    @Step("Поиск найденного первого элемента")
    public void submitHeaderSearch(){
        tvSets.submitHeaderSearch();
    }
/*
    @Step("Нажатие чекбоксов")
    public void setCheckBox(){
        tvSets.setCheckbox(tvSets.checkLG, true);
        tvSets.setCheckbox(tvSets.checkSamsung, true);
    }
*/
}
