package tests;

import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by a1wen on 02.04.2017.
 */
public class BaseTest {
    @Managed(driver = "firefox")
    protected WebDriver driver;

    private String baseUrl;

    @Before
    public void setUp() throws Exception{
        //TODO Исправить путь к драйверу
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\a1wen\\Desktop\\example\\MarketTests\\drivers\\geckodriver.exe");
        baseUrl = "http://yandex.ru";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @After
    public void finished() throws Exception{
        driver.quit();
    }
}
