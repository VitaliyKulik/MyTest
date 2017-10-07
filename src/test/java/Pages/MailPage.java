package Pages;

import Utils.EmailList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @FindBy(xpath = "//p[@class='make_message']/a/i|(//li[@class='sn_menu_item'])[2]")
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

/*    @FindBy(xpath = "(//div[@class='row new']/a/span[@class='frm'])[1]")
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
    }*/

    @FindBy(xpath = "//span[@class='frm']")
    private List<WebElement> fromAll;

    @FindBy(xpath = "//span[@class='sbj']")
    private List<WebElement> subjectsAll;

    @FindBy(xpath = "//*[@class='tm']")
    private List<WebElement> dates;

    public String lastEmailsFrom() throws ParseException {
        ArrayList<EmailList> listEmail = new ArrayList<>();
        for (int i = 0; i < dates.size(); i++) {
            DateFormat format = new SimpleDateFormat("dd.MM.yy, hh:mm");
            Date date = format.parse(dates.get(i).getAttribute("title"));
            listEmail.add(new EmailList(fromAll.get(i).getText(), subjectsAll.get(i).getText(), date));
            Collections.sort(listEmail, Comparator.comparing(EmailList::getDate));
        }
        String lastUnreadFrom;
        return lastUnreadFrom = fromAll.get(0).getText();
    }

    public String lastEmailsSubj() throws ParseException {
        ArrayList<EmailList> listEmail = new ArrayList<>();
        for (int i = 0; i < dates.size(); i++) {
            DateFormat format = new SimpleDateFormat("dd.MM.yy, hh:mm");
            Date date = format.parse(dates.get(i).getAttribute("title"));
            listEmail.add(new EmailList(fromAll.get(i).getText(), subjectsAll.get(i).getText(), date));
            Collections.sort(listEmail, Comparator.comparing(EmailList::getDate));
        }
        String lastUnreadSubj;
        return lastUnreadSubj = subjectsAll.get(0).getText();
    }
    public void toLastEmail(){
        subjectsAll.get(0).click();
    }


}
