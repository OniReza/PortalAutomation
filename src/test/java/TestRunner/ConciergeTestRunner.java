package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Concierge/Concierge.feature",glue = "StepDefinations",
        plugin = "html:target/cucumber/Concierge_report.html")

public class ConciergeTestRunner {
}
