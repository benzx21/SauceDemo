package saucedemo.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
    private static final Logger logger = LogManager.getLogger(CommonMethods.class);
    protected WebDriver driver;
    WebDriverWait wait;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    public boolean waitForElementToBeVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }
        catch(Exception e) {
            logger.info("Element did not become visible within 15 seconds");
            return false;
        }
    }

    public boolean clickElement(WebElement element) {
        try {
            element.click();
            return true;
        }
        catch(Exception e) {
            logger.info("Element not successfully clicked");
            return false;
        }
    }

    public boolean captureText(WebElement element, String text) {
        try {
            element.sendKeys(text);
            return true;
        }
        catch(Exception e) {
            logger.info("Element not successfully captured");
            return false;
        }


    }

}
