package data;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement loginIn = $(By.xpath("//*[@id=\"login2\"]"));

    public LoginPage logIn() {
        loginIn.click();
        return new LoginPage();
    }
}
