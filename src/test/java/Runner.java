import engine.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        plugin = {"pretty", "html:result/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = {"steps", "support"},
        tags = "@valid"
        )

public class Runner {
    public static class Hooks {

        private Driver driver;

        public Hooks(Driver driver) {
            this.driver = driver;
        }

        @Before()
        public void before() {
            driver.start();
        }

        @After()
        public void after() {
            driver.close();
        }
    }
}
