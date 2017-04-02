package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.aplana.homework.steps.BaseSteps;

import static org.junit.Assert.*;

/**
 * Created by a1wen on 02.04.2017.
 */

@RunWith(SerenityRunner.class)
public class MarketTV extends BaseTest {
    @Steps
    BaseSteps baseSteps;

    @Title("Поиск первого телевизора в списке, цена выше 20000 руб, производители Samsung и LG")
    @Test
    public void testMarketTV() throws Exception{
        baseSteps.gotoMarket();
        baseSteps.gotoElectronic();
        baseSteps.gotoTV();
        baseSteps.fillPriceFrom("20000");
        //assertEquals();
        baseSteps.clickCheckLG();
        baseSteps.clickCheckSamsung();
        baseSteps.submitFilter();

        baseSteps.wait(6000);
    }
}
