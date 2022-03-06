package pages;

import engine.Driver;

public class HomePage extends BasePage{
    // Homepage URL
    public final String ENDPOINT = "/inventory.html";

    public HomePage(Driver driver) {
        super(driver);
    }
}
