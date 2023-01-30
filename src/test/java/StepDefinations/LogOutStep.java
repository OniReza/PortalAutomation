package StepDefinations;

import Pages.LogOutPage;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutStep {

    public WebDriver driver;
    LogOutPage logOutPage;
    SmartWait smartWait = new SmartWait();

    public LogOutStep() {
        this.driver = Hooks.getDriver();
        logOutPage = new LogOutPage(driver);
    }

    public void waitload() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() {
        waitload();
        logOutPage.logoutBtnClick();
        waitload();
    }


}
