package Pages;

import Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Valentin on 10.09.2017.
 */
public abstract class BasePage {
    protected static WebDriver driver= DriverFactory.getDriver();

   public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
