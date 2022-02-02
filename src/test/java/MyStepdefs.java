import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import saucedemo.www.*;

public class MyStepdefs extends BaseClass{
    @Given("^As a user i launch the sauce demo webpage$")
    public void as_a_user_i_launch_the_sauce_demo_webpage()  {
    openBrowser(endPoint);

    }

    @And("^I click logon$")
    public void i_click_logon()  {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue("",loginPage.clickLoginButton());

    }


    @And("^I add the second costliest product$")
    public void iAddTheSecondCostliestProduct() {
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertTrue("",productsPage.addsecondcostliestitem());
    }

    @And("^I add the cheapest product$")
    public void iAddTheCheapestProduct() {
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertTrue("",productsPage.addthecheapestitem());
    }

    @And("^I click cart$")
    public void iClickCart() {
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertTrue("",productsPage.clickCart());
    }

    @And("^I click checkout$")
    public void iClickCheckout() {
        YourCartPage yourCartPage = new YourCartPage(driver);
        Assert.assertTrue("", yourCartPage.clickCart());
    }
    @And("^I click continue$")
    public void iClickContinue() {
        YuorInformationPage yuorInformationPage = new YuorInformationPage(driver);
        Assert.assertTrue("",yuorInformationPage.clickcontinue());
    }

    @And("^I enter\"([^\"]*)\"$")
    public void iEnter(String username)  {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue("",loginPage.captureUsernameField(username));
    }

    @And("^I type \"([^\"]*)\"$")
    public void iType(String password)  {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue("",loginPage.capturePasswordField(password));
    }


    @And("^I enter the \"([^\"]*)\"$")
    public void iEnterThe(String fname) throws Throwable {
        YuorInformationPage yuorInformationPage = new YuorInformationPage(driver);
        Assert.assertTrue("",yuorInformationPage.captureFirstNameField(fname));
    }

    @And("^I entered the \"([^\"]*)\"$")
    public void iEnteredThe(String sname) throws Throwable {
        YuorInformationPage yuorInformationPage = new YuorInformationPage(driver);
        Assert.assertTrue("",yuorInformationPage.capturelastNameField(sname));
    }

    @And("^I type the \"([^\"]*)\"$")
    public void iTypeThe(String postalcode) {
        YuorInformationPage yuorInformationPage = new YuorInformationPage(driver);
        Assert.assertTrue("",yuorInformationPage.capturePostalCodeField(postalcode));
    }

    @And("^I click finish$")
    public void iClickFinish() {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        Assert.assertTrue("",checkoutOverviewPage.clickFinishButton());
    }

    @And("^I verify the \"([^\"]*)\"$")
    public void iVerifyThe(String message) {
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        Assert.assertTrue("",checkoutOverviewPage.verifyThankyouForYourOrderMessage(message));
    }
}

