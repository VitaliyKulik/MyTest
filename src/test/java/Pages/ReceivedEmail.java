package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valentin on 16.09.2017.
 */
public class ReceivedEmail extends BasePage {

    @FindBy(xpath = "//div[@class='message_header clear']/h3")
    private WebElement subjReceivedEmail;

    @FindBy(xpath = "//a[@class='black']")
    private WebElement fromEmail;

    @FindBy(xpath = "//div[@class='message_body']")
    private WebElement messageBody;

    public String getSubj() {
        return subjReceivedEmail.getText();
    }

    public String getFrom() {
        return fromEmail.getText();
    }

    public String getText() {
        return messageBody.getText();
    }





}
