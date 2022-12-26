package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/InstantRewards/InstanceRewards.feature",
        glue = "StepDefinations",tags = "@tag1 or @tag2 or @tag3",
        plugin = "html:target/cucumber/Instance_Reward_report.html",
        monochrome = true
      )
public class InstanceRwdTestRunner {
}

