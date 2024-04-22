package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit in entegre olmasini saglayan scenario calistirici notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimiz ve hangi raporlari alacağımızı belirtiriz

        plugin = {
                "pretty",//Console da scenariolar ile ilgili ayrintili bilgi almamizi saglar
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinitions","techproed/hooks"},
        tags = "@US012",
        dryRun = false,  //==> eger true secilirse scanariolari calistirmadan feature file daki
        // eksik step defeinitonlarin olup olmadigini kontrol eder, ve browser'i calistirmaz
        monochrome = false
)
public class Runner {
}