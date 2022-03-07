package steps;

import engine.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.User;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.BDDAssertions.then;

import pages.HomePage;
import pages.LoginPage;


public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    public LoginSteps (Driver driver) {
        this.driver = driver.get();
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver);
    }

    @Given("I am at the login page")
    public void open_login() {
        loginPage.load(loginPage.BASE_URL);
    }

    @Given("I entered these credentials")
    public void enterCred(User cred) {
        loginPage.enterUserName(cred.getUsername());
        loginPage.enterPassword(cred.getPassword());
    }

    @When("I click on log in button")
    public void press_login() {
        loginPage.clickLogIn();
    }

    @Then("Product inventory is shown")
    public void inventory_page() {
        // check if URL matches the homepage URL
        String inventoryURL = driver.getCurrentUrl();
        then(inventoryURL).isEqualTo(loginPage.BASE_URL + homePage.ENDPOINT);

        // TODO: check for the Product title


        // close browser
        driver.close();
    }

    @Then("Error message is shown")
    public void error_login() {
        // check for error element existence
        then(loginPage.isErrorMsgDisplayed()).isTrue();

        // assert the error message shown
        then(loginPage.getErrorMsgText()).isEqualTo(loginPage.INVALID_CREDS_MSG);
    }

}
