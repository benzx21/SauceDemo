package saucedemo.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import saucedemo.common.CommonMethods;

public class ProductsPage extends CommonMethods {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backpack;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement onesie;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    private WebElement cart;


   public boolean addsecondcostliestitem(){
       if (waitForElementToBeVisible(backpack)) {
           clickElement(backpack);
           return true;
       }
       return false;
   }
    public boolean addthecheapestitem(){
        if (waitForElementToBeVisible(onesie)) {
            clickElement(onesie);
            return true;
        }
        return false;
    }
    public boolean clickCart(){
        if (waitForElementToBeVisible(cart)) {
            clickElement(cart);
            return true;
        }
        return false;
    }
   }


