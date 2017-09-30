package Utils;

import java.util.ResourceBundle;

/**
 * Created by Valentin on 17.09.2017.
 */
public class UserFactory {
    static ResourceBundle resource;

    static {
        resource = ResourceBundle.getBundle("user");
    }

    public static User getValidUser() {
        return new User(resource.getString("valid.login"), resource.getString("valid.password"));
    }
    public static User getInValidUser() {
        return new User(resource.getString("inValid.login"), resource.getString("inValid.password"));
    }


}
