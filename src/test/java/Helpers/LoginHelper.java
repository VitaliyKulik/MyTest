package Helpers;


import Pages.LoginPage;
import Utils.User;
import Utils.UserFactory;

/**
 * Created by Valentin on 16.09.2017.
 */
public class LoginHelper extends LoginPage {

    public void login(User user) {
        loginUser(user.getName(), user.getPassword());
    }

    public void loginValidUser() {
        User user = UserFactory.getValidUser();
        loginUser(user.getName(), user.getPassword());
    }

    public void loginInValidUser() {
        User user = UserFactory.getInValidUser();
        loginUser(user.getName(), user.getPassword());
    }


}
