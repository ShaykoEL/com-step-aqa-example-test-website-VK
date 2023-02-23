package java.by.step.aqa.example.testsVK.login_page_tests;

import by.step.aqa.example.testsVK.service.LoginService;
import org.junit.jupiter.api.BeforeEach;

import java.by.step.aqa.example.testsVK.base.BaseUITestsClass;
import java.time.Duration;

public class LoginPageTest extends BaseUITestsClass {
    private LoginService loginservice = new LoginService(driver);

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://vk.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
    }
}
