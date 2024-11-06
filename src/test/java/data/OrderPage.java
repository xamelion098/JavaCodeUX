package data;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OrderPage {

    private final SelenideElement name = $(byXpath("//*[@id=\"name\"]"));
    private final SelenideElement country = $(byXpath("//*[@id=\"country\"]"));
    private final SelenideElement creditCard = $(byXpath("//*[@id=\"card\"]"));
    private final SelenideElement month = $(byXpath("//*[@id=\"month\"]"));
    private final SelenideElement year = $(byXpath("//*[@id=\"year\"]"));
    private final SelenideElement purchase = $(byXpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    private final SelenideElement orderPrice = $(byXpath("/html/body/div[10]/p/text()[2]"));


    public void userInfo () {
        name.setValue("Aleksandr");
        country.setValue("RUSSIA");
        creditCard.setValue("1111 2222 3333 4444");
        month.setValue("12");
        year.setValue("2024");
        purchase.click();

    }

   public  String getOrderPrice() {
        return orderPrice.text();
    }
}
