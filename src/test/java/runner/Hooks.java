package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        plugin = {"json:target/reports/CucumberReport.json"},
        glue = {"stepDefinitions"}, tags = {"@teste"})
public class Hooks {


    public static WebDriver driver;


//
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//    }

    @BeforeClass
    public static void setupTest() {
//        driver = new ChromeDriver();

//       WebDriver driver = new ChromeDriver();
//
//       driver.close();

        driver = new ChromeDriver();
//        String baseUrl = "http://demo.guru99.com/test/newtours/";
//        driver.get(baseUrl);

//        public ronaldo = driver;

    }
//
//    @AfterClass
//    public static void stop() {
//        driver.quit();
//    }

}
