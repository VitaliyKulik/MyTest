package Utils;

import java.util.Date;

/**
 * Created by Valentin on 07.10.2017.
 */
public class EmailList {
    String from;
    String subject;
    Date date;

    public EmailList(String from, String subject, Date date) {
        this.from = from;
        this.subject = subject;
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "EmailList{" +
                "from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", date=" + date +
                '}';
    }
}
