package pages;

import PageObject.Methods;

public class HomePage extends Methods {

    public void navigateToHomePage() {
        navigateToUrl("base_url");
    }

    public void navigateToLogIn() {
        clickToElement("home_login_item");
        waitForSecond(2000);
    }

    public void searchForProduct(String product) {
        clickToElement("home_search_input");
        sendKeysToElement("home_search_input", product);
        clickToElement("home_search_button");
    }

    public void checkForLogin() {
        waitForSecond(2000);
        elementIsDisplayed("account_verify");
        expectedText = getTextFromElement("account_verify");
        compareTextWithExpected("account_verify");
    }

    public void clickAcceptCookies() {
        clickToElement("cookies_accept_button");
        waitForSecond(2000);
    }

}
