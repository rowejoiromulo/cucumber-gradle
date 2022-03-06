package pages;

import engine.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage{

    public final String BASE_URL = "https://www.saucedemo.com";
    public final String INVALID_CREDS_MSG = "Epic sadface: Username and password do not match any user in this service";

    //Constructor that will be automatically called as soon as the object of the class is created
    public LoginPage(Driver driver) {
        super(driver);
    }
    //Locator for username field
    By uName = By.id("user-name");

    //Locator for password field
    By pswd = By.name("password");

    //Locator for login button
    By loginBtn = By.className("submit-button");

    // Locator for error message
    By errMsg = By.xpath("//*[@data-test=\"error\"]");

    public void enterUserName(String user) {
        wait.until(ExpectedConditions.presenceOfElementLocated(uName))
                .sendKeys(user);
    }

    public void enterPassword(String pwd) {
        wait.until(ExpectedConditions.presenceOfElementLocated(pswd))
                .sendKeys(pwd);
    }

    public void clickLogIn() {
        driver.findElement(loginBtn).click();
    }

    public boolean isErrorMsgDisplayed() {
        return driver.findElement(errMsg).isDisplayed();
    }

    public String getErrorMsgText() {
        return driver.findElement(errMsg).getText();
    }
}
