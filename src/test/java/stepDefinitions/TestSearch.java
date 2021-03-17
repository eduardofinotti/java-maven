package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.Hooks;

public class TestSearch {

    @Dado("^abro a url$")
    public void abro_a_url() {
        Hooks.driver.get("http://demo.guru99.com/");
    }

    @Quando("^preencho o campo$")
    public void preencho_o_campo() {
        WebElement element = Hooks.driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");
    }

    @Então("^clico no botao$")
    public void clico_no_botao() {
        WebElement button = Hooks.driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }

}