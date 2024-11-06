package test;

import com.codeborne.selenide.Selenide;
import data.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.math.BigDecimal;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUIDemoblaze {
    @BeforeEach
    void setUP () {
        open("https://www.demoblaze.com/");
        $(By.xpath("//*[@id=\"login2\"]")).shouldBe(exist);
    }
    @AfterAll
    static void close () {
        Selenide.closeWebDriver();

    }


    @Test
    public void testAddToItemAndCheckAmount () {
        var mainPage = new MainPage ();
        var loginPage = mainPage.logIn ();
        var dashboardPage = loginPage.logPass ();
        String productPrice = dashboardPage.getProductPrice ();
        BigDecimal productPriceBigDecimal = new BigDecimal(productPrice.replace("$", ""));
        var cartPage = dashboardPage.addToCarts ();
        var orderPage = cartPage.goToCart ();
        String productCartPrice = cartPage.getProductCartPrice ();
        BigDecimal productCartPriceBigDecimal = new BigDecimal(productCartPrice);
        orderPage.userInfo ();
        assertEquals(productPriceBigDecimal, productCartPriceBigDecimal);
        /*String productOrderPrice = orderPage.getOrderPrice ();
        BigDecimal productOrderPriceDecimal = new BigDecimal(productOrderPrice.replace("Amount:  USD", ""));
        assertEquals(productPriceBigDecimal, productOrderPrice); К сожалению, найти валидный селектор в конечной точке не получилось. (*/


    }


}
