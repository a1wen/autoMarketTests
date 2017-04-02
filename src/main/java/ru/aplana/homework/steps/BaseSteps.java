package ru.aplana.homework.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.homework.pages.MainPage;

/**
 * Created by a1wen on 02.04.2017.
 */
public class BaseSteps extends ScenarioSteps{
    MainPage mainpage;

    @Step("Переход на страницу Маркета")
    public void gotoMarket(){
        mainpage.market.click();
    }
}
