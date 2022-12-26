package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/NewAccount/NewAccount.feature",glue = "StepDefinations",tags="@tag1 or @tag2",
        plugin = "html:target/cucumber/NewAccount.html")
public class NewAccountsRunner {
}
