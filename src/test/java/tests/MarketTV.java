package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.aplana.homework.steps.BaseSteps;

/**
 * Created by a1wen on 02.04.2017.
 */

@RunWith(SerenityRunner.class)
public class MarketTV extends BaseTest {
    @Steps
    BaseSteps baseSteps;

}