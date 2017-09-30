package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valentin on 10.09.2017.
 */
public class MailPage extends BasePage {

    @FindBy(xpath = "//li[@class='ho_menu_item']/a/span")
    private WebElement textUserName;

    public String getTextUserName() {
        return textUserName.getText();
    }

    @FindBy(xpath = "//p[@class='make_message']/a")
    private WebElement createMessage;

    public void newMessage() {
        createMessage.click();
    }


    @FindBy(xpath = "//li[@class='current new']/a")
    private WebElement inbox;
//ul[@class='list_underlined']/li[1]/a
//li[contains(@class,'new')]/a
//     (//li[contains(@class,'new')]/a)[1]

    @FindBy(xpath = "(//div[@class='row new']/a/span[@class='frm'])[1]")
    private WebElement lastName;

    public String getInboxLasUserName() {
        return lastName.getText();
    }

    @FindBy(xpath = "(//div[@class='row new']/a/span[@class='sbj']/span)[1]")
    private WebElement lastSubj;

    public String getInboxLasSubj() {
        return lastSubj.getText();
    }

    public void openLastMail() {
        lastSubj.click();
    }

    //li[@class='new']/a

}
