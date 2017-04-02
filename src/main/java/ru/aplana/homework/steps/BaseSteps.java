package ru.aplana.homework.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.homework.pages.ElectronicPage;
import ru.aplana.homework.pages.MainPage;
import ru.aplana.homework.pages.MarketPage;

/**
 * Created by a1wen on 02.04.2017.
 */
public class BaseSteps extends ScenarioSteps{
    MainPage mainpage;
    MarketPage marketPage;
    ElectronicPage electronicPage;

    @Step("Переход на страницу Маркета")
    public void gotoMarket(){
        mainpage.market.click();
    }

    @Step("Переход на страницу \"Электроника\"")
    public void gotoElectronic() {
        System.out.println(marketPage.electronic.toString());
        marketPage.electronic.click();
    }

    @Step("Переход на страницу \"Телевизоры\"")
    public void gotoTV(){
        electronicPage.tvSet.click();
    }
}
