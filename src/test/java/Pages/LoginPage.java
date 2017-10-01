package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

        /*Function <WebDriver, Boolean> s = (a) ->{return a.findElement(By.xpath("//input[@name='login']"))
                .getAttribute("href")
                .endsWith("dff");
        };
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(s);*/
        log.info(String.format("Login user name - %s , password - %s", name, password));
        name.chars().forEach(d -> {
                    inputLogin.sendKeys(Character.toString((char) d));
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );
        // inputLogin.sendKeys(name);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }
}
