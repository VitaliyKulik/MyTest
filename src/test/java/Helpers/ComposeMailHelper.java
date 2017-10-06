package Helpers;

import Pages.BasePage;
import Pages.ComposeMail;
import Utils.Email;
import Utils.EmailFactory;

/**
 * Created by Valentin on 17.09.2017.
 */
public class ComposeMailHelper extends ComposeMail {
    public void composeEmail(Email email) {
        sendEmai(email.getRecipient(),email.getSubject(),email.getTextMessage());
    }

    public void composeToMe() {
        Email email = EmailFactory.getValidEmailToMe();
        sendEmai(email.getRecipient(),email.getSubject(),email.getTextMessage());
    }

}
