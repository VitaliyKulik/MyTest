package Utils;

import java.util.ResourceBundle;

/**
 * Created by Valentin on 05.10.2017.
 */
public class EmailFactory {
    static ResourceBundle resource;

    static {
        resource = ResourceBundle.getBundle("email");
    }

    public static Email getValidEmailToMe() {
        return new Email(resource.getString("valid.login"), resource.getString("valid.subject"), resource.getString("valid.textMessage"));
    }


}
