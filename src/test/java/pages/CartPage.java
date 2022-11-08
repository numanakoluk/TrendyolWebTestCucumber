package pages;

import PageObject.Methods;

public class CartPage extends Methods {

    public void checkForProducts() {
        clickToElement("cart_okey_info");
        waitForSecond(2000);
        expectedText = getTextFromElement("cart_first_product_item");
        compareTextWithExpected("cart_first_product_item");
        waitForSecond(2000);
        expectedText = getTextFromElement("cart_second_product_item");
        compareTextWithExpected("cart_second_product_item");
    }
    public void deleteProduct() {
         waitForSecond(2000);
         clickToElementProduct("cart_first_delete_basket");
         waitForSecond(2000);
         clickToElementProduct("cart_delete_button");
         waitForSecond(5000);
         clickToElementProduct("cart_first_delete_basket2");
         waitForSecond(2000);
         clickToElementProduct("cart_delete_button");
         waitForSecond(2000);
    }
}
