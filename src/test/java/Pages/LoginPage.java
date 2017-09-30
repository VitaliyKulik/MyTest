package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Valentin on 10.09.2017.
 */
public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@name='pass']")
    private WebElement inputPassword;

    @FindBy(xpath = "//p/input[@type='submit']")
    private WebElement btnLogin;

    /*public void loginUser(String name, String password) {
        inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }*/
    protected void loginUser(String name, String password) {
        /*System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().refresh();*/
        inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }
}
