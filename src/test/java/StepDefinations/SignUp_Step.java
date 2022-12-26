package StepDefinations;

import Pages.LoginPage;
import Pages.SignUp_Page;
import Utility.*;
import io.cucumber.java.After;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SignUp_Step  {
    public WebDriver driver;
    SignUp_Page signuppage;
    SmartWait smartWait = new SmartWait();

    public SignUp_Step()
    {
        this.driver= Hooks.getDriver();
        signuppage=new SignUp_Page(driver);

    }

    @Given("A valid url for desired portal")
    public void a_valid_url_for_desired_portal() {
        String URL= BaseData.BaseUrlMain();
       // driver.get("https://devs:super!power@member.dev.clubswan.com");
        driver.get("https://devs:super!power@dev.infinityclubcardmembers.com/");
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @When("user inputs email")
    public void user_enters_email() {
        signuppage.enterEmail();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @When("user inputs email for non-us")
    public void user_inputs_email_non_us() throws InterruptedException {
        signuppage.enterEmailnon_us();;
        Thread.sleep(4000);
    }

    @When("user inputs email for non-us member details and clicks continue")
    public void user_inputs_email_for_non_us_member_details_and_clicks_continue() throws InterruptedException {
        signuppage.enterEmailnon_us();
        signuppage.continueBtnClick();
        Thread.sleep(4000);
    }

    @And("user inputs personal details")
    public void user_inputs_personal_details() throws InterruptedException {
        signuppage.residentCountry();
        signuppage.name();
        signuppage.address();
        signuppage.setState();
        signuppage.phoneNumber();
        signuppage.Password();
        signuppage.dob();
        signuppage.enterSSN();
        signuppage.checkBoxesclick();
    }

    @And("user inputs personal details for non-us members")
    public void user_inputs_personal_details_for_non_us_members() throws InterruptedException {
        signuppage.residentCountrynon_us();
        signuppage.name();
        signuppage.dob();
        signuppage.address();
        signuppage.phoneNumber();
        signuppage.Password();
        signuppage.checkBoxesclick();
    }



    @When("user enters Email for non-us Accounts")
    public void user_enters_email_non_us() {
        signuppage.enterEmailnon_us();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @And("Clicks Continue")
    public void clicks_continue() throws InterruptedException {
        signuppage.continueBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user selects Country UK")
    public void user_selects_country_uk() throws InterruptedException {
        signuppage.residentCountrynon_us();
    }

    @And("Subscription page will appear")
    public void subscription_page_will_appear() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue("Subscription page not appeared",signuppage.subscriptionPageCheck());

    }

    @And("user selects Starter Lite plan")
    public void user_selects_starter_lite_plan() throws InterruptedException {
        Thread.sleep(2000);
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getGetStarterLite();
        Thread.sleep(3000);
    }

    @When("user selects Starter plan")
    public void user_selects_starter_plan() throws InterruptedException {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getStarter();

        Thread.sleep(8000);
    }
    @When("user selects Premier plan")
    public void user_selects_premier_plan() throws InterruptedException {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        subscription_page_will_appear();
        clicks_continue();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getPremier();
        Thread.sleep(8000);
    }
    @When("user selects VIP plan")
    public void user_selects_vip_plan() throws InterruptedException {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        if (!signuppage.vipCheck()){
            signuppage.scrollbtn();
            Thread.sleep(1000);
            signuppage.getVip();
        }
        else {
            signuppage.getVip();
        }
        Thread.sleep(2000);
    }

    @When("user selects Chairman plan")
    public void user_selects_chairman_plan() throws InterruptedException {
        user_enters_email();
        signuppage.continueBtnClick();
        user_inputs_personal_details();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        if (!signuppage.chairmanCheck()){
            signuppage.scrollbtn();
            Thread.sleep(1000);
            signuppage.getChairman();
        }
        else {
            signuppage.getChairman();
        }
        Thread.sleep(2000);
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++Non US++++++++++++++++++++++++++++++++++++++++++++++++
    @When("user selects Starter plan non us")
    public void user_selects_starter_plan_non_us() throws InterruptedException {
        signuppage.getStarter();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @When("user selects Premier plan non us")
    public void user_selects_premier_plan_non_us() throws InterruptedException {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.getPremier();
        Thread.sleep(8000);
    }
    @When("user selects VIP plan non us")
    public void user_selects_vip_plan_non_us() throws InterruptedException {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(10);
            signuppage.getVip();

        Thread.sleep(2000);
    }

    @When("user selects Chairman plan non us")
    public void user_selects_chairman_plan_non_us() throws InterruptedException {
        user_inputs_email_non_us();
        clicks_continue();
        user_inputs_personal_details_for_non_us_members();
        clicks_continue();
        subscription_page_will_appear();
        smartWait.waitUntilPageIsLoaded(5);
            signuppage.getChairman();

        Thread.sleep(2000);
    }


    @And("user checks card design")
    public void user_checks_card_design() throws InterruptedException {
        signuppage = new SignUp_Page(driver);
        smartWait.waitUntilPageIsLoaded(5);
        Assert.assertTrue("Card Image didn't appear", signuppage.cardImageCheck());
    }
    @And("Clicks Continue again")
    public void clicks_continue_again() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        signuppage.cntc();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user selects payment method card")
    public void user_selects_payment_method_card() throws InterruptedException {
        //signuppage = new SignUp_Page(driver);
        signuppage.cardPayment();
        smartWait.waitUntilPageIsLoaded(5);

    }

    @And("checks payment confirmation message")
    public void checks_payment_confirmation_message() throws InterruptedException {
        signuppage = new SignUp_Page(driver);
        Assert.assertTrue("Payment not sucesfull",signuppage.confirmatonCheck());
        Thread.sleep(3000);
    }

    @Then("user press OK")
    public void user_press_ok() {
        signuppage = new SignUp_Page(driver);
        signuppage.okBtnClick();
        driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
        smartWait.waitUntilPageIsLoaded(5);

    }

}
