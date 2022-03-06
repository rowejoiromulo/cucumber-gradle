package support;

import engine.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    private Driver driver;

    public Hooks(Driver driver) {
        this.driver = driver;
    }

    @Before()
    public void before() {
        driver.start();
        System.out.println("INSIDE BEFORE HOOK");
    }

    @After()
    public void after() {
        driver.close();
        System.out.println("INSIDE AFTER HOOK");
    }
}
