package pages;

import PageObject.Methods;

public class ProductPage extends Methods {


    public void chooseProduct() {
        waitForSecond(2000);
        getTextFromElement("product_cart");
        clickToElement("product_cart");
        nextTab();
    }

    public void addProducts() {
        waitForSecond(2000);
        clickToElementProduct("product_first_add_button");
        waitForSecond(2000);
        clickToElement("product_second_go");
        waitForSecond(3000);
        clickToElement("product_second_add_button2");
        waitForSecond(5000);
        clickToElement("product_shopping_cart_button");
    }

}
