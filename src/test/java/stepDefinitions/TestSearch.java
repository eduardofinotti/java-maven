package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.Hooks;

public class TestSearch {

//    setupTest setupTest = new setupTest();
    Hooks Hooks = new Hooks();

//   public  WebDriver driver = new ChromeDriver();

    @Dado("^abro a url$")
    public void abro_a_url() {
        runner.Hooks.driver.get("http://demo.guru99.com/");
    }

    @Quando("^preencho o campo$")
    public void preencho_o_campo() {
        WebElement element = runner.Hooks.driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");
    }

    @Então("^clico no botao$")
    public void clico_no_botao() {
        WebElement button = runner.Hooks.driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }

}