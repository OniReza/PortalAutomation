package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Travel/Travel.feature",glue = "StepDefinations",
        plugin = "html:target/cucumber/Travel_report.html")
public class TravelTestRunner {
}
