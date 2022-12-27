package StepDefinations;

import Pages.Accounts_Page;
import Pages.Settings_Page;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.OutputType.BYTES;

public class Settings_Step {
    public WebDriver driver;
    Settings_Page settingsPage;
    SmartWait smartWait = new SmartWait();


    public Settings_Step(){
        this.driver= Hooks.getDriver();
        settingsPage= new Settings_Page(driver);
    }

    @After
    public void takeScraenshotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }

    }


    @When("user clicks on settings button")
    public void user_clicks_on_settings_button() {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        try {
            if (settingsPage.IsShoppingPopup()) {
                settingsPage.buttonCancel();
                settingsPage.settingsBtnClick();
            }
        }
        catch(Exception e) {
            settingsPage.settingsBtnClick();
        }
          smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user clicks on change password")
    public void user_clicks_on_change_password() {
       smartWait.waitUntilPageIsLoaded(5);
       settingsPage.changePassClick();
    }
    @And("user inputs current password")
    public void user_inputs_current_password() {
        smartWait.waitUntilPageIsLoaded(5);
        settingsPage.inputCurrentPass();
    }
    @And("user inputs new password")
    public void user_inputs_new_password() throws InterruptedException {
        settingsPage.inputNewPass();
    }
    @And("user clicks on change password button")
    public void user_clicks_on_change_password_button() throws InterruptedException {
        settingsPage.changePassBtnClick();
        Thread.sleep(3000);
    }
    @And("user inputs otp and clicks on confirm button")
    public void user_inputs_otp_and_clicks_on_confirm_button() throws InterruptedException {

        settingsPage.inputOtp();
        Thread.sleep(500);
        settingsPage.confirmBtnClick();
        Thread.sleep(3000);
    }
    @And("success message should appear")
    public void success_message_should_appear() {
        System.out.println("Pass Change Sucess");
    }
    @And("user should be able to login using new password")
    public void user_should_be_able_to_login_using_new_password() throws InterruptedException {
        settingsPage.logoutandLogin();
        smartWait.waitUntilPageIsLoaded(5);

    }
    @Then("user will change password again")
    public void user_will_change_password_again() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        Thread.sleep(2000);
        settingsPage.backtoPrevious();
        success_message_should_appear();
        Thread.sleep(3000);
    }

    //++++++++++++++++++++++++++++++++++++++++++++++Change Billing Method++++++++++++++++++++++++++++++++++++++++++++++
    @When("user is on settings page")
    public void user_is_on_settings_page() {
        user_clicks_on_settings_button();
        smartWait.waitUntilPageIsLoaded(5);
    }
    @And("user clicks on change billing method")
    public void user_clicks_on_change_billing_method() {
        smartWait.waitUntilPageIsLoaded(5);
        settingsPage.changeBillingMethod();
    }
    @And("user selects automatic from method dropdown")
    public void user_selects_automatic_from_method_dropdown() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(5);
        settingsPage.methodDropdown();
        Thread.sleep(500);
        settingsPage.automaticClick();
        Thread.sleep(2000);
        Assert.assertTrue("Warning message didn't appear", settingsPage.automaticWarningMsgCheck());
    }
    @And("user selects accounts from method dropdown")
    public void user_selects_accounts_from_method_dropdown() throws InterruptedException {
        settingsPage.methodDropdown();
        Thread.sleep(500);
        settingsPage.accountsClick();
        Thread.sleep(2000);
    }

    @And("user clicks first wallet")
    public void user_clicks_first_wallet(){
        settingsPage.firstWalletClick();
    }
    @And("user selects debit or credit card from method dropdown")
    public void user_selects_debit_or_credit_card_from_method_dropdown() throws InterruptedException {
        settingsPage.methodDropdown();
        Thread.sleep(500);
        settingsPage.card();
        Thread.sleep(2000);
    }
    @And("clicks on add new card")
    public void clicks_on_add_new_card(){
        settingsPage.addNewCardClick();
    }
    @And("user selects first debit card")
    public void user_selects_first_debit_card(){
        settingsPage.cardClick();
    }


    @And("clicks on save button")
    public void clicks_on_save_button() throws InterruptedException {
        settingsPage.saveBtnClick();
        Thread.sleep(2000);
    }
    @Then("automatic should show in settings page")
    public void automatic_should_show_in_settings_page() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("Automatic didn't saved as billing method",settingsPage.savedAutomaticCheck());
    }

    @Then("selected wallet should show in settings page")
    public void selected_wallet_should_show_in_settings_page(){
        smartWait.waitUntilPageIsLoaded(5);
        Assert.assertTrue("Wallet didn't saved as billing method",settingsPage.savedWalletCheck());

       if (!settingsPage.getSavedWalletNum().contains("XXX") ||!settingsPage.getSavedWalletNum().contains("automatic") ||!settingsPage.getSavedWalletNum().contains("**")){

            System.out.println("Selected Wallet saved as billing method");
        }
        else{
            System.out.println("Error");
        }

    }
    @Then("selected card should show in settings page")
    public void selected_card_should_show_in_settings_page(){
        //driver.navigate().refresh();
        smartWait.waitUntilPageIsLoaded(5);

        Assert.assertTrue("Card didn't saved as billing method",settingsPage.savedWalletCheck());

        if (settingsPage.getSavedWalletNum().contains("XXX") ||settingsPage.getSavedWalletNum().contains("**")){

            System.out.println("Selected card saved as billing method");
        }
        else{
            System.out.println("Error");
        }
    }

    @When("user clicks on Phone change of marketing")
    public void user_clicks_on_phone_change_of_marketing() throws InterruptedException {
        settingsPage.phoneChangeBtnClick();
        System.out.println("Phone Change button clicked");
        smartWait.waitUntilPageIsLoaded(1);
    }
    @When("user clicks on Fax change of marketing")
    public void user_clicks_on_fax_change_of_marketing() {
        settingsPage.faxChangeBtnClick();
        System.out.println("Fax Change button clicked");
        smartWait.waitUntilPageIsLoaded(1);
    }
    @When("user clicks on Email change of marketing")
    public void user_clicks_on_email_change_of_marketing() throws InterruptedException {
        settingsPage.emailChangeBtnClick();
        System.out.println("Email Change button clicked");
        smartWait.waitUntilPageIsLoaded(1);
    }
    @And("user clicks on postalmail change of marketing")
    public void user_clicks_on_postalmail_change_of_marketing() throws InterruptedException {
        settingsPage.postalmailChangeBtnClick();
        System.out.println("Postalmail Change button clicked");
        smartWait.waitUntilPageIsLoaded(1);
    }
    @Then("user should see message")
    public void user_should_see_message() {
        Assert.assertTrue("Marketing consent has successfully updated.\n",settingsPage.sucessMessageCheck());
        System.out.println("Marketing consent has successfully updated.");
        smartWait.waitUntilPageIsLoaded(1);
    }

    @When("user clicks on preferred currency change button")
    public void user_clicks_on_preferred_currency_change_button() {
        settingsPage.Change5();
        System.out.println("Preferred Currency Change button clicked");
        smartWait.waitUntilPageIsLoaded(1);
    }
    @And("user clicks dropdown and saves any currency")
    public void user_clicks_dropdown_saves_any_currency() throws InterruptedException {
        try{
            settingsPage.Dropdown();
            Thread.sleep(500);
            settingsPage.firstCurrencyClick();
            System.out.println("Dropdown clicked 1");
            Thread.sleep(1000);
            settingsPage.saveBtnClick();
            Thread.sleep(2000);
        }
        catch (ElementClickInterceptedException e1){
            settingsPage.Dropdown();
            Thread.sleep(500);
            settingsPage.secondCurrencyClick();
            System.out.println("Dropdown clicked 2");
            Thread.sleep(500);
            settingsPage.saveBtnClick();
            Thread.sleep(2000);
        }
        catch (Exception e2){
            settingsPage.Dropdown();
            Thread.sleep(500);
            settingsPage.thirdCurrencyClick();
            System.out.println("Dropdown clicked 2");
            Thread.sleep(500);
            settingsPage.saveBtnClick();
            Thread.sleep(2000);
        }

    }
//    @And("saved currency should show in settings page")
//    public void saved_currency_should_show_in_settings_page(){
//        Assert.assertTrue("Currency save unsucessfull", settingsPage.savedCurrencyCheck());
//    }


    @When("user clicks on preferred language change button")
    public void user_clicks_on_preferred_language_change_button() throws InterruptedException {
        settingsPage.prefLanguageBtnCLik();
        System.out.println("Preferred Language Change button clicked");
        Thread.sleep(2000);
    }
    @And("user clicks dropdown and saves any Language")
    public void user_clicks_dropdown_and_saves_any_language() throws InterruptedException {
        try{
            settingsPage.Dropdown();
            Thread.sleep(500);
            settingsPage.firstLanguageClick();
            System.out.println("Dropdown clicked 1");
            Thread.sleep(1000);
            settingsPage.saveBtnClick();
            Thread.sleep(2000);
        }
        catch (ElementClickInterceptedException e1){
            settingsPage.Dropdown();
            Thread.sleep(500);
            settingsPage.secondLanguageClick();
            System.out.println("Dropdown clicked 2");
            Thread.sleep(500);
            settingsPage.saveBtnClick();
            Thread.sleep(2000);
        }
        catch (Exception e2){
            settingsPage.Dropdown();
            Thread.sleep(500);
            settingsPage.thirdLanguageClick();
            System.out.println("Dropdown clicked 3");
            Thread.sleep(500);
            settingsPage.saveBtnClick();
            Thread.sleep(2000);
        }
    }
    @Then("saved currency and language should show in settings page")
    public void saved_currency_and_language_should_show_in_settings_page(){
        Assert.assertTrue("Currency save unsucessfull", settingsPage.savedSettingsCheck());
    }

    @And("check newly added card")
    public void check_newly_added_card() {
        //smartWait.waitUntilPageIsLoaded(5);
        //Assert.assertTrue("New card doesn't add in list", settingpage.verifyNewCard());
    }
    @And("user selects new added card")
    public void user_selects_new_added_card() {
        settingsPage.selectNewAddedCard();
    }
    @Then("verify payment method change in setting page")
    public void verify_payment_method_change_in_setting_page() {
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("Saved card number doesn't match", settingsPage.verifySavedCard());

    }


}
