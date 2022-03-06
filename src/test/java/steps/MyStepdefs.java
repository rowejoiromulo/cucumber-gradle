package steps;

import engine.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {

    private WebDriver driver;

    public MyStepdefs (Driver driver){
        this.driver = driver.get();
    }

    @Given("I redirect to google page")
    public void iRedirectToGooglePage() {
        System.out.println("Running iRedirectToGooglePage.............");
    }

    @When("I enter {string}")
    public void iEnter(String arg0) {
        System.out.println("Running iEnter.............");
    }

    @And("I click search")
    public void iClickSearch() {
        System.out.println("Running iClickSearch.............");
    }

    @Then("the google search should be displayed")
    public void theGoogleSearchShouldBeDisplayed() {
        System.out.println("Running theGoogleSearchShouldBeDisplayed.............");
    }
}
