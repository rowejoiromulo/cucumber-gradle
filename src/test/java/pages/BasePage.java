package pages;

import engine.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private long seconds = 10;

    public BasePage(Driver driver) {
        this.driver = driver.get();
        wait = new WebDriverWait(this.driver, seconds);
    }

    public void load(String url) {
        driver.get(url);
    }
}
