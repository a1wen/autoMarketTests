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
        try{
            baseSteps.clickCheckLG();
            baseSteps.clickCheckSamsung();
            baseSteps.fillPriceFrom("20000");
            baseSteps.submitFilter();
            baseSteps.checkPriceFrom("20000");
            baseSteps.checkQuantityElements(12);
            baseSteps.fillHeaderSearch();
            baseSteps.submitHeaderSearch();
            baseSteps.wait(60);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }


    }
}
