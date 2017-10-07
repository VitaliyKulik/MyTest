package Helpers;


import Pages.LoginPage;
import Utils.User;
import Utils.UserFactory;

/**
 * Created by Valentin on 16.09.2017.
 */
public class LoginHelper extends LoginPage {

    public void login(User user) {
        login(user.getName(), user.getPassword());
    }

    public void loginValidUser() {
        User user = UserFactory.getValidUser();
        login(user.getName(), user.getPassword());
    }

    public void loginInValidUser() {
        User user = UserFactory.getInValidUser();
        login(user.getName(), user.getPassword());
    }


}
