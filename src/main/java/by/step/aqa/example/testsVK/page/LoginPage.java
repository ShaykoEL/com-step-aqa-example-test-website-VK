package by.step.aqa.example.testsVK.page;

import by.step.aqa.example.testsVK.block.LoginBlock;
import by.step.aqa.example.testsVK.block.LoginMobilePromoBlock;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private LoginBlock loginblock = new LoginBlock(driver);

    public LoginPage (WebDriver driver) {
        super (driver);
    }

    public LoginBlock getLoginBlock() {
        return loginblock;
    }

    public LoginMobilePromoBlock getLoginMobilePromoBlock() {
        return loginMobilePromoBlock;
    }
}
