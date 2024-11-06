package data;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement cartPriceProduct = $(byXpath("//*[@id=\"tbodyid\"]/tr/td[3]"));

    private final SelenideElement placeOrder = $(byXpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));

    public OrderPage goToCart() {

        placeOrder.click();
        return new OrderPage();
    }

    public String getProductCartPrice() {
        return cartPriceProduct.text();
    }
}
