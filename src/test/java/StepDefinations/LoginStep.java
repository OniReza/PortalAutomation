package StepDefinations;

import Pages.LoginPage;
import Utility.*;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginStep {
    public WebDriver driver;
    LoginPage loginPage;
    SmartWait smartWait = new SmartWait();

    public LoginStep()
    {
        this.driver= Hooks.getDriver();
        loginPage=new LoginPage(driver);
    }

    @After(order=1)
    public void takeScraenshotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }

    }
    /*Modify by: Abid Reza
     12-20-2022

    */
    @Given("a valid url")
    public void a_valid_url() throws InterruptedException {

        String URL= BaseData.BaseUrlMain();
        String PURL=BaseData.BasePopUpUrl();
        driver.get(PURL);
        driver.get(URL);
        driver.manage().window().maximize();
        System.out.println("Valid Url Is Given");
        smartWait.waitUntilPageIsLoaded(5);
        loginPage.PageClass();
        Thread.sleep(8000);
      // basicAuthHandle();
    }

    @And("user input email with credential")
    public void user_input_email_with_credential()throws InterruptedException
    {
        loginPage.PageClass();
        basicAuthHandle();
        System.out.println("User Input Email and Password");
        smartWait.waitUntilPageIsLoaded(10);
    }

    @Then("user should see the landing page")
    public void user_should_see_landing_page()throws InterruptedException
    {
        Assert.assertTrue("Landing Page",loginPage. isLandingPageAvailable());
        System.out.println("User Should See The Landing Page");
        smartWait.waitUntilPageIsLoaded(10);
    }
    public void basicAuthHandle() {
        try {
            String url = driver.getCurrentUrl();
            if (url.contains("tst.clubswan")) {
                System.setProperty("java.awt.headless", "false");
                Robot robot = new Robot();
                if (url.contains("sandbox") || url.contains("tst")) {
                    //type devs
                    robot.keyPress(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    //press Tab button
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    //type super!power
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyPress(KeyEvent.VK_U);
                    robot.keyRelease(KeyEvent.VK_U);
                    robot.keyPress(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_P);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_R);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    robot.keyPress(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_P);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_W);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    Thread.sleep(500);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                } else {
                    //type sandbox
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.keyPress(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_N);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.keyPress(KeyEvent.VK_B);
                    robot.keyRelease(KeyEvent.VK_B);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_X);
                    //press Tab
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    //type test!easy
                    robot.keyPress(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_T);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyPress(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_T);

                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_SHIFT);

                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyPress(KeyEvent.VK_A);
                    robot.keyRelease(KeyEvent.VK_A);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_S);
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.keyRelease(KeyEvent.VK_Y);

                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    Thread.sleep(500);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                }

            }

        }
        catch (NoAlertPresentException | InterruptedException | AWTException e)
        {
            System.out.println("No Alert Present");
        }

    }

    @And("if Additional Information page appear user will answer Questions")
    public void additionalInfoPage() throws InterruptedException {
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (driver.getCurrentUrl().contains("risk")) {
            System.out.println("Additional Information");

            System.out.println("Additional Information Complete");
        }
        System.out.println("No Additional Information");
    }

    @And("if Recurring payment page appear user will pay recurring fee")
    public void reSub() throws InterruptedException {
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (driver.getCurrentUrl().contains("lock-account")) {
            Thread.sleep(2000);
            System.out.println("Recurring pay");
            Assert.assertTrue("Account suspended page appeared", loginPage.makePaymentChcek());
            Thread.sleep(1000);

            loginPage.Payment();
           // Payment using wallet
            loginPage.payByWallet();

            //payment by card
//           loginPage.payByCard();
//            driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//            driver.switchTo().frame("apex-frame");
//            loginPage.apexClass();

            driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

            Assert.assertTrue("Waiting page not appeared", loginPage.loadingCheck());
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            System.out.println("Recurring pay Complete");

        }
        System.out.println("No Recurring pay");
    }

    @And("if Additional Information and Recurring payment didn't appear")
    public void if_Additional_Information_and_Recurring_payment_did_not_appear() {
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        String url=driver.getCurrentUrl();
        if (!url.contains("risk") && !url.contains("lock")){
            System.out.println("We will go dashboard directly");
        }
    }

    @Then("user will be on dashboard")
    public void user_will_be_on_dashboard() throws InterruptedException, Exception {
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Assert.assertTrue("Not in Dashboard", loginPage.dashBoardCheck());
        System.out.println("We ar in Dashboard");
        Thread.sleep(6000);

        Thread.sleep(20000);

    }
}










