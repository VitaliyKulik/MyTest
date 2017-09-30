package Tests;


import Helpers.App;
import org.testng.annotations.*;

/**
 * Created by Valentin on 16.09.2017.
 */
public abstract class BaseTest {

    App app = new App();


  /*  LoginPage loginPage = new LoginPage();
    MailPage mailPage = new MailPage();
    ComposeMail composeMail = new ComposeMail();
    ReceivedEmail receivedEmail = new ReceivedEmail();
    MailPage newMessage = new MailPage();
    SendStatus toInbox = new SendStatus();*/

    @BeforeSuite
    public void testSuite() throws Exception {
    }

    @AfterSuite
    public void tearDown() throws Exception {
        app.common.appOut();
    }
}
