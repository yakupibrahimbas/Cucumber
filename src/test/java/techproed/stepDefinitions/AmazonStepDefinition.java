package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("arama kutusunda iphone aratilir")
    public void arama_kutusunda_iphone_aratilir() {

        amazonPage.handleCaptcha();
        amazonPage.aramaKutusu.sendKeys("iphone");
        amazonPage.aramaKutusu.submit();
    }

    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("arama kutusunda samsung aratilir")
    public void arama_kutusunda_samsung_aratilir() {
        amazonPage.handleCaptcha();
        amazonPage.aramaKutusu.sendKeys("samsung");
        amazonPage.aramaKutusu.submit();
    }


    @When("arama kutusunda nokia aratilir")
    public void aramaKutusundaNokiaAratilir() {
        amazonPage.handleCaptcha();
        amazonPage.aramaKutusu.sendKeys("nokia");
        amazonPage.aramaKutusu.submit();
    }
    @When("arama kutsunda iphone aratir")
    public void arama_kutsunda_iphone_aratir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}