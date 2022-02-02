package saucedemo.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import saucedemo.common.CommonMethods;

public class YourCartPage extends CommonMethods {
    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "checkout")
    private WebElement btncheckout;

    public boolean clickCart() {
        if (waitForElementToBeVisible(btncheckout)) {
            clickElement(btncheckout);
            return true;
        }
        return false;
    }
}
