package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.aplana.homework.steps.BaseSteps;

/**
 * Created by a1wen on 03.04.2017.
 */

@RunWith(SerenityRunner.class)
public class MarketHeadphones extends BaseTest {
    @Steps
    BaseSteps steps;

    @Title("Поиск первых наушников в списке, цена выше 5000 руб, производитель Beats")
    @Test
    public void testMarketHeadphones() throws Exception{
        steps.gotoMarket();
        steps.gotoElectronic();
        steps.gotoHeadphones();
        try{
            steps.fillPriceHeadphones("5000");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
