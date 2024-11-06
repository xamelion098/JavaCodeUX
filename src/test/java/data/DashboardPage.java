package data;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private final SelenideElement productName = $(byXpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
    private final SelenideElement productPrice = $(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h5"));
    private final SelenideElement addToCart = $(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    private final SelenideElement cartPlaceOrder = $(byXpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    private final SelenideElement goToCardBoard = $(byXpath("//*[@id=\"cartur\"]"));

    public CartPage addToCarts() {
        productName.click();
        addToCart.click();
        cartPlaceOrder.click();
        goToCardBoard.click();
        return new CartPage();
    }

    public String getProductPrice() {
        return productPrice.text();
    }

}
