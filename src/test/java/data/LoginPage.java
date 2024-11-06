package data;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
public class LoginPage {
    private final SelenideElement userName = $(By.xpath("//*[@id=\"loginusername\"]"));
    private final SelenideElement passwordUser = $(By.xpath("//*[@id=\"loginpassword\"]"));
private final SelenideElement logIN = $(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));

    public DashboardPage logPass  () {
        userName.setValue("Test_123321");
        passwordUser.setValue("123123123");
        logIN.click();
        return  new DashboardPage();
    }



}
