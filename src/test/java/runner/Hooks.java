package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"}
        , plugin = {"json:target/reports/CucumberReport.json"},
        glue = {"stepDefinitions"}, tags = {"~@Ignore"})
public class Hooks {

    public static ChromeDriver driver;

    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void stop() {
        driver.quit();
    }

}
