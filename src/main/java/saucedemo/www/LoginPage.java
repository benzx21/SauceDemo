package saucedemo.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import saucedemo.common.CommonMethods;

public class LoginPage extends CommonMethods {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement txtUserName;
    @FindBy(id = "password")
    private WebElement txtPassword;
    @FindBy(id = "login-button")
    private WebElement btnLogin;

    public boolean captureUsernameField(String username) {
        if (waitForElementToBeVisible(txtUserName)) {
            captureText(txtUserName, username);
            return true;
        }
        return false;
    }

    public boolean capturePasswordField(String password) {
        if (waitForElementToBeVisible(txtPassword)) {
            captureText(txtPassword, password);
            return true;
        }
        return false;
    }

    public boolean clickLoginButton() {
        if (waitForElementToBeVisible(btnLogin)) {
            clickElement(btnLogin);
            return true;
        }
        return false;
    }
}