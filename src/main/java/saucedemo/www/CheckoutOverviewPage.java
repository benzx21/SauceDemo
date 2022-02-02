package saucedemo.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import saucedemo.common.CommonMethods;

public class CheckoutOverviewPage extends CommonMethods {
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "finish")
    private WebElement btnFinish;
    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    private WebElement lblMessage;


    public boolean clickFinishButton() {
        if (waitForElementToBeVisible(btnFinish)) {
            clickElement(btnFinish);
            return true;
        }
        return false;
    }

    public boolean verifyThankyouForYourOrderMessage(String message) {
        if (waitForElementToBeVisible(lblMessage)) {
            if (lblMessage.getText().equalsIgnoreCase(message)){
                return true;
            }
           else return false;
        }
        return false;
    }
}