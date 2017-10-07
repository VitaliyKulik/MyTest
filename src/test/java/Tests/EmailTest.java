package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Valentin on 10.09.2017.
 */
public class EmailTest extends BaseTest {

    /*@Test(priority = 1)
    public void test3() throws Exception {
        Assert.assertTrue(true);
    }*/

    @Test(priority = 1)
    public void testEmail() throws Exception {
        app.login.loginValidUser();
        //app.login.login("qazwsx3@i.ua","qazwsx123");
        String username = app.mail.getTextUserName();
        Assert.assertEquals(username, "test1", "Current username " + username + " is not correct");

    }

    @Test(priority = 2)
    public void testEmail1() throws Exception {

        app.mail.newMessage();
        //app.compose.composeToMe();
        app.compose.composeEmail("qazwsx3@i.ua", "test3", "testmessage3");
        app.mail.toInbox();
        SoftAssert softAssert = new SoftAssert();
       /* String lastUserName = app.mail.getInboxLasUserName();
        String lastSubj = app.mail.getInboxLasSubj();
        Assert.assertEquals(lastUserName, "test1 test2", "Current username " + lastUserName + " is not correct");
        Assert.assertEquals(lastSubj, "test3", "Current subject " + lastSubj + " is not correct");
      String lastUnreadSubj=app.mail.getInboxLasSubj();
        softAssert.assertEquals(lastUnreadSubj,"test3", "Current subject " + lastUnreadSubj + " is not correct");
        String subj = app.receivedEmail.getSubj();
        String from = app.receivedEmail.getFrom();
        String text = app.receivedEmail.getText();

       // SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(subj, "test3", "Current subject " + subj + " is not correct");
        softAssert.assertEquals(from, "qazwsx3@i.ua", "Current from " + from + " is not correct");
        softAssert.assertTrue(text.startsWith("testmessage3"), "Current subject " + text + " is not correct");
    */
        String lastFrom = app.mail.lastEmailsFrom();
        String lastSubj = app.mail.lastEmailsSubj();
        softAssert.assertEquals(lastFrom, "test1 test2", "Current username " + lastFrom + " is not correct");
        softAssert.assertEquals(lastSubj, "test3", "Current subject " + lastSubj + " is not correct");

        app.mail.toLastEmail();
        String subj = app.receivedEmail.getSubj();
        String from = app.receivedEmail.getFrom();
        String text = app.receivedEmail.getText();
        softAssert.assertEquals(subj, "test3", "Current subject " + subj + " is not correct");
        softAssert.assertEquals(from, "qazwsx3@i.ua", "Current from " + from + " is not correct");
        softAssert.assertTrue(text.startsWith("testmessage3"), "Current subject " + text + " is not correct");

        softAssert.assertAll();

    }
}
