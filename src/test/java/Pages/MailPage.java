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
    //get uesername from mail page

    @FindBy(xpath = "html/body/div[1]/div[5]/div[1]/div[1]/p/a")
    private WebElement createMessage;
    //p[@class='make_message']/a/i|(//li[@class='sn_menu_item'])[2]
    public void newMessage() {
        createMessage.click();
    }
    //click to create new message

    @FindBy(xpath = "//li[@class='current new']/a|//li[@class='new']/a")
    private WebElement inbox;

    public void toInbox() {
        inbox.click();
    }
    //go to Inbox

    @FindBy(xpath = "(//div[@class='row new']/a/span[@class='frm'])[1]")
    private WebElement lastName;

    public String getInboxLasUserName() {
        return lastName.getText();
    }
    //get last user name from the list

    @FindBy(xpath = "(//div[@class='row new']/a/span[@class='sbj']/span)[1]")
    private WebElement lastSubj;

    public String getInboxLasSubj() {
        return lastSubj.getText();
    }
    //get last subject from the list

    public void openLastMail() {
        lastSubj.click();
    }


}
