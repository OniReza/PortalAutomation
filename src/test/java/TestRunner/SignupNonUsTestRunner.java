package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/SignUp/SignUp_non_us.feature",glue = "StepDefinations",tags="@vip2",
        plugin = "html:target/cucumber/Signup_infinity_report.html")
public class SignupNonUsTestRunner {
}


