package by.step.aqa.example.testsVK.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginBlock extends BaseBlock{

    public LoginBlock (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
