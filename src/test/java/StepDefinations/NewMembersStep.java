package StepDefinations;

import Pages.NewMembersPage;
import Utility.Hooks;
import Utility.SmartWait;

import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NewMembersStep {
    public WebDriver driver;
    NewMembersPage newAccountsPage;

    SmartWait smartWait = new SmartWait();

    public NewMembersStep()
    {
        this.driver= Hooks.getDriver();
        newAccountsPage=new NewMembersPage(driver);

    }

    @When("topup popup appears")
    public void topup_popup_appears() {
        smartWait.waitUntilPageIsLoaded(5);
        Assert.assertTrue("No popup apeared ", newAccountsPage.topupPopupCheck());
    }
    @And("user inputs topup amount")
    public void user_inputs_topup_amount() throws InterruptedException {
        newAccountsPage.entertopupAmount();
        Thread.sleep(3000);
    }
    @And("user click on checkbox")
    public void user_click_on_checkbox() {
        newAccountsPage.checkBoxClick();
    }
    @And("click proceed button")
    public void click_proceed_button() {
        newAccountsPage.ProceedBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user checks sucess message and press Ok")
    public void user_checks_topup_sucess_message_and_press_ok() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(15);
        Assert.assertTrue("Topup unsucessful", newAccountsPage.sucessMsgCheck());
        Thread.sleep(2000);
        newAccountsPage.okBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }

    @Then("user should see the Home page")
    public void user_should_see_the_home_page () throws InterruptedException {
        Assert.assertTrue("Dashboard didn't appeard",newAccountsPage.dashboardCheck());
        Thread.sleep(2000);
        }

    @And("user clicks on virtual cards tab")
    public void user_clicks_on_virtual_cards_tab() throws InterruptedException {
        newAccountsPage.virtualCardsTabClick();
        Thread.sleep(3000);
    }
    @And("user clicks on create virtual card button")
    public void user_clicks_on_create_virtual_card_button(){

        if(newAccountsPage.IsCreateBtn())
        {
            newAccountsPage.createVcardBtnClick();
        }
        else
        {

        }


        smartWait.waitUntilPageIsLoaded(5);
    }

    @And("user selects first card")
    public void user_selects_first_card(){
        newAccountsPage.firstVcardCreation();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user selects debit card for topup for activation")
    public void user_selects_debit_card_for_topup_for_activation() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        newAccountsPage.methodSelect();
    }

    @And("user enters sending amount and click checkBox")
    public void user_enters_sending_amount_and_click_checkbox() throws InterruptedException {
        newAccountsPage.enterAmout();
        Thread.sleep(1000);
        newAccountsPage.topupcheckBoxClick();
        Thread.sleep(2000);

    }
    @And("user click on continue button")
    public void user_click_on_continue_button(){
        newAccountsPage.continueBtnClick();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user checks summary and press confirm")
    public void user_checks_summary_and_press_confirm() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        Assert.assertTrue("No summary",newAccountsPage.summaryCheck());
        Thread.sleep(1000);
        newAccountsPage.confirmBtnClick();
    }

    @And("user enter otp and click activate button")
    public void user_enter_otp_and_click_activate_button() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        newAccountsPage.enterOtp();
        Thread.sleep(1000);
        newAccountsPage.activateBtnClick();
    }
}
