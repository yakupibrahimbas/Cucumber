package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

import java.util.List;

public class BlueRentalStepDefinition {

    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
    }


    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        blueRentalPage.loginButton.click();
    }

    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
    }


    @And("kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String email, String password) {
        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password, Keys.ENTER);
    }

    @Then("login oldugunu dogrular")
    public void loginOldugunuDogrular() {
        Assert.assertNotEquals("Login",blueRentalPage.loginVerify.getText());
    }


    @And("verilen kullanici bilgileri ile login olur")
    public void verilenKullaniciBilgileriIleLoginOlur(DataTable dataTable) {


        List< List<String> > emailPassword =  dataTable.asLists();
        System.out.println("emailPassword = " + emailPassword);

        /*
        emailPassword =

        [
        [email, password],
        [sam.walker@bluerentalcars.com, sami],
        [john_doe@gmail.com, johndoe],
        [johnson@bluerentalcars.com, johnson]
        ]


         */


        for (int i = 1; i < emailPassword.size();         i++) {
            String email = emailPassword.get(i).get(0);
            String password = emailPassword.get(i).get(1);
            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
        }

    }

    @And("verilen kullanici bilgileri ile login olur ikinci yol")
    public void verilenKullaniciBilgileriIleLoginOlurIkinciYol(DataTable dataTable) {

        for (int i = 1; i < dataTable.asLists().size();   i++) {
            String email = dataTable.row(i).get(0);
            String password = dataTable.row(i).get(1);
            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
        }
    }


    @And("exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlur(String sayfaIsmi) {

        String dosyaYolu = "src/test/resources/adminTestData.xlsx";
        ExcelReader excelReader = new ExcelReader(dosyaYolu, sayfaIsmi);

        for (int i = 1; i <= excelReader.rowCount(); i++) {

            String email = excelReader.getCellData(i, 0);
            String password = excelReader.getCellData(i, 1);

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password, Keys.ENTER);

            ReusableMethods.bekle(2);

            Driver.getDriver().navigate().back();

            ReusableMethods.bekle(1);


        }


    }
}