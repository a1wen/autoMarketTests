package ru.aplana.homework.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;
import ru.aplana.homework.pages.*;

import static org.junit.Assert.*;

/**
 * Created by a1wen on 02.04.2017.
 */
//TODO Требуется рефакторинг для вынесения методов работы с объектами выдачи в один файл, слить в 1 файл ProductsPage и Headphones
public class BaseSteps extends ScenarioSteps{
    MainPage mainpage = new MainPage();
    MarketPage marketPage = new MarketPage();
    ElectronicPage electronicPage = new ElectronicPage();
    ProductsPage productsPage = new ProductsPage();
    ItemPage item = new ItemPage();

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
        productsPage.priceFrom.sendKeys(price);
        productsPage.priceFrom.sendKeys(Keys.ENTER);
    }

    @Step("Проверка введенного значения {0}")
    public void checkPriceFrom(String price){
        assertEquals(price, productsPage.getPriceFrom());
    }

    @Step("Применить фильтр")
    public void submitFilter(){
        productsPage.submitFilter();
        try {
            java.util.concurrent.TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Нажать чек-бокс LG")
    public void clickCheckLG(){
        productsPage.checkLG.click();
    }

    @Step("Нажать чек-бокс Samsung")
    public void clickCheckSamsung(){
        productsPage.checkSamsung.click();
    }

    @Step("Нажать чек-бокс Beats")
    public void clickCheckBeats(){
        productsPage.checkBeats.click();
    }

    @Step("Проверка количества элементов на странице, {0}")
    public void checkQuantityElements(int quantity){
        assertEquals(quantity, productsPage.getQuantityElements());
    }

    @Step("Получить название элемента {0}")
    public String getFirstItem(int index){
        return productsPage.getFirstItem(index);
    }

   @Step("Ввод значения первого элемента в поисковую строку")
    public void fillHeaderSearch(String value){
        productsPage.headerSearch.sendKeys(value);
        productsPage.headerSearch.sendKeys(Keys.ENTER);
    }

    @Step("Поиск найденного первого элемента")
    public void submitHeaderSearch(){
        productsPage.submitHeaderSearch();
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
