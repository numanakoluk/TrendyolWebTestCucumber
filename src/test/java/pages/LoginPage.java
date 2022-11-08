package pages;

import PageObject.Methods;

public class LoginPage extends Methods {

    public void login() {
        sendKeysToElement("login_email_input", "testautomationdeneme@gmail.com");
        sendKeysToElement("login_password_input", "0018000Na");
        waitForSecond(2);
        clickToElement("login_button");
    }
}
