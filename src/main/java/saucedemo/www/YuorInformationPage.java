package saucedemo.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import saucedemo.common.CommonMethods;

public class YuorInformationPage extends CommonMethods {
    public YuorInformationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement txtFirstName;
    @FindBy(id = "last-name")
    private WebElement txtLastName;
    @FindBy(id = "postal-code")
    private WebElement txtPostalCode;
    @FindBy(id = "continue")
    private WebElement btncontinue;

    public boolean captureFirstNameField(String fname) {
        if (waitForElementToBeVisible(txtFirstName)) {
            captureText(txtFirstName, fname);
            return true;
        }
        return false;
    }

    public boolean capturelastNameField(String lname) {
        if (waitForElementToBeVisible(txtLastName)) {
            captureText(txtLastName, lname);
            return true;
        }
        return false;
    }

    public boolean capturePostalCodeField(String postalcode) {
        if (waitForElementToBeVisible(txtPostalCode)) {
            captureText(txtPostalCode, postalcode);
            return true;
        }
        return false;
    }

    public boolean clickcontinue() {
        if (waitForElementToBeVisible(btncontinue)) {
            clickElement(btncontinue);
            return true;
        }
        return false;
    }
}