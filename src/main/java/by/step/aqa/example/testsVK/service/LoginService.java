package by.step.aqa.example.testsVK.service;

import by.step.aqa.example.testsVK.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginService extends BaseService {

    private LoginPage loginPage = new LoginPage(driver);

    public LoginService (WebDriver driver){
        super(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

}
