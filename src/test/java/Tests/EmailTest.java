package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Valentin on 10.09.2017.
 */
public class EmailTest extends BaseTest {

    @Test(priority = 3)
    public void test3() throws Exception {
        Assert.assertTrue(true);
    }

    @Test(priority=2)
    public void testEmail() throws Exception {
        app.login.loginValidUser();
       // app.login.login("qazwsx3@i.ua","qazwsx123");
        String username = app.mail.getTextUserName();
        Assert.assertEquals(username, "test1", "Current username " + username + " is not correct");

        //li[@class='ho_menu_item']/a/span
        //*[@class='user_name']
    }
   /* @Test(priority=1)
    public void testEmail1() throws Exception {
        app.mail.newMessage();
        app.compose.sendEmai("qazwsx3@i.ua", "test3", "testmessage3");
        app.sendStatus.toMailPage();
        String lastUserName = app.mail.getInboxLasUserName();
        Assert.assertEquals(lastUserName, "test1 test2", "Current username " + lastUserName + " is not correct");
        String lastSubj = app.mail.getInboxLasSubj();
        Assert.assertEquals(lastSubj, "test3", "Current subject " + lastSubj + " is not correct");
        app.mail.openLastMail();
        String subj = app.receivedEmail.getSubj();
        Assert.assertEquals(subj, "test3", "Current subject " + subj + " is not correct");
        String from = app.receivedEmail.getFrom();
        Assert.assertEquals(from, "qazwsx3@i.ua", "Current from " + from + " is not correct");
        String text = app.receivedEmail.getText();
        Assert.assertTrue(text.startsWith("testmessage3"), "Current subject " + text + " is not correct");
    }*/
}
