package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

@RunWith(Cucumber.class)


@CucumberOptions(features = "src/test/resources/Features/Cards/Cards.feature",glue = "StepDefinations",
        tags = "@t1 or @t2",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CardsTestRunner {

}
