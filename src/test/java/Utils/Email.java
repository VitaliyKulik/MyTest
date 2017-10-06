package Utils;

/**
 * Created by Valentin on 17.09.2017.
 */
public class Email {
    //sendEmai(String recipient, String subject, String textMessage)
    String recipient;
    String subject;
    String textMessage;

    public Email(String recipient, String subject, String textMessage) {
        this.recipient = recipient;
        this.subject = subject;
        this.textMessage = textMessage;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public String toString() {
        return "Email{" +
                "recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", textMessage='" + textMessage + '\'' +
                '}';
    }
}
