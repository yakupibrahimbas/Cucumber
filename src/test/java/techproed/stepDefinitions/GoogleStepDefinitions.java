package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefinitions {
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {

    }

    @When("google arama kutsunda {string} aratir")
    public void googleAramaKutsundaAratir(String arg0) {

    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arg0) {
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {
    }

    @When("kullanici verilen bilgilerle arama yapar")
    public void kullaniciVerilenBilgilerleAramaYapar(DataTable data) {
        
    }
}
