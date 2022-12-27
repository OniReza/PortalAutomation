package Pages;

import Utility.BaseData;
import Utility.CommonPageMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Settings_Page extends CommonPageMethods {
    public static WebDriver driver;
    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingsBtn;
    @FindBy(xpath = "//span[contains(text(),'password')]")
    public WebElement changePass;
    @FindBy(id = "current-password")
    public WebElement currentPass;
    @FindBy(id = "new-password")
    public WebElement newPass;
    @FindBy(id = "confirm-new-password")
    public WebElement confirmNewPass;
    @FindBy(xpath = "(//span[contains(text(),'Change Password')])[2]")
    public WebElement changePassBtn;
    @FindBy(xpath = "//span[contains(text(),'change billing method')]")
    public WebElement changeBillingMethodBtn;
    @FindBy(xpath = "//div[@class=\"MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input\"]")
    public WebElement dropdown;
    @FindBy(xpath = "//li[4]")
    public WebElement automatic;
    @FindBy(xpath = "//span[text()='SAVE']")
    public WebElement saveBtn;
    @FindBy(xpath = "//li[3]")
    public WebElement crypto;
    @FindBy(xpath = "//tr[@class=\"MuiTableRow-root tableRow \"][1]")
    public WebElement cryptocurrency;
    @FindBy(xpath = "(//tr[@class='MuiTableRow-root tableRow ']//child::td)[2]")
    public WebElement wallet;
    @FindBy(xpath = "//li[1]")
    public WebElement card;
    @FindBy(xpath = "//td[contains(text(),' new card')]")
    public WebElement addNewCard;
    @FindBy(xpath = "(//tr[@class=\"MuiTableRow-root tableRow \"])[1]")
    public WebElement cardselect;
    @FindBy(xpath = "(//span[contains(text(),'change')]//parent::button[@type='button'])[5]")
    public WebElement phoneChange;
    @FindBy(xpath = "(//span[contains(text(),'change')]//parent::button[@type='button'])[6]")
    public WebElement faxChange;
    @FindBy(xpath = "(//span[contains(text(),'change')]//parent::button[@type='button'])[7]")
    public WebElement emialChange;
    @FindBy(xpath = "(//span[contains(text(),'change')]//parent::button[@type='button'])[8]")
    public WebElement postalmail;
    @FindBy(xpath = "(//span[contains(text(),'change')])[9]")
    public WebElement change5;
    @FindBy(xpath = "(//span[contains(text(),'change')])[10]")
    public WebElement preferredLanguage;
    @FindBy(xpath = "//li[5]")
    public WebElement firstLanguage;
    @FindBy(xpath = "//li[6]")
    public WebElement secondLanguage;
    @FindBy(xpath = "//li[8]")
    public WebElement thirdLanguage;
    @FindBy(xpath = "//p[contains(text(),'Language')]")
    public WebElement savedLanguage;
    @FindBy(xpath = "//span[contains(text(),'Marketing consent has successfully updated.')]")
    public WebElement message;
    @FindBy(xpath = "//li[2]")
    public WebElement firstCurrency;
    @FindBy(xpath = "//li[3]")
    public WebElement secondCurrency;
    @FindBy(xpath = "//li[4]")
    public WebElement thirdCurrency;
    @FindBy(xpath = "//p[contains(text(),'Currency')]")
    public WebElement savedCurrency;
    @FindAll({@FindBy(xpath = "//tr[@class='MuiTableRow-root tableRow ']")})
    public List<WebElement> countDebtorCreditCard;
    @FindBy(xpath = "(//tr[@class='MuiTableRow-root tableRow '])[\"'+newCardNum-1+'\"]")
    public WebElement selectCard;
    @FindBy(xpath = "(//span[@class='MuiButton-label'])[2]")
    public WebElement saveCardNumber;
    int addedCardNum;
    int newCardNum;
    String selCardNum;
    @FindBy(id = "secret_code")
    WebElement otp;
    @FindBy(xpath = "//span[text()='CONFIRM']")
    WebElement otpConfirmBtn;
    @FindBy(xpath = "//span[text()=\"Logout\"]")
    WebElement logoutBtn;
    @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//input[@id=\"code\"]")
    WebElement loginOtp;
    @FindBy(xpath = "//div[contains(text(),'selecting automatic')]")
    WebElement automaticWarningMsg;
    @FindBy(xpath = "//li[2]")
    WebElement accounts;
    @FindBy(xpath = "//span[contains(text(),'Automatic') or contains(text(),'automatic') ]")
    WebElement savedAutomaticMethod;
    @FindBy(xpath = "//span[@class='section-body-image-text-value'][2]")
    WebElement savedWallet;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/span[1]")
    public WebElement popup;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/button[1]")
    public WebElement btnCancel;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[2]/div/div[2]/div[2]/div")
    public WebElement shoppingAssertPage;

    public Settings_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void settingsBtnClick() {
        settingsBtn.click();
    }

    public void changePassClick() {
        changePass.click();
    }

    public void inputCurrentPass() {
        currentPass.sendKeys("Tt123#123#");
    }

    public void inputNewPass() throws InterruptedException {
        newPass.sendKeys("Tt123#123");
        Thread.sleep(200);
        confirmNewPass.sendKeys("Tt123#123");
        Thread.sleep(300);
    }

    public void changePassBtnClick() throws InterruptedException {
        changePassBtn.click();
        Thread.sleep(2000);
    }

    public void inputOtp() {
        otp.sendKeys(BaseData.BaseOtp());
    }

    public void confirmBtnClick() {
        otpConfirmBtn.click();
    }

    public void logoutandLogin() throws InterruptedException {
        logoutBtn.click();
        Thread.sleep(3000);
        email.sendKeys(BaseData.BaseEmail());
        Thread.sleep(1000);
        submit.click();
        Thread.sleep(3000);
        password.sendKeys("Tt123#123");
        Thread.sleep(1000);
        submit.click();
        Thread.sleep(3000);
        loginOtp.sendKeys(BaseData.BaseOtp());
        Thread.sleep(1000);
        submit.click();
    }

    public void backtoPrevious() throws InterruptedException {
        click(settingsBtn);
        Thread.sleep(2000);
        changePass.click();
        Thread.sleep(2000);
        currentPass.sendKeys("Tt123#123");
        Thread.sleep(200);
        newPass.sendKeys("Tt123#123#");
        Thread.sleep(200);
        confirmNewPass.sendKeys("Tt123#123#");
        Thread.sleep(1000);
        changePassBtn.click();
        Thread.sleep(500);
        otp.sendKeys(BaseData.BaseOtp());
        Thread.sleep(200);
        otpConfirmBtn.click();
    }

    public void changeBillingMethod() {
        changeBillingMethodBtn.click();
    }

    public void methodDropdown() {
        dropdown.click();
    }

    public void automaticClick() {
        automatic.click();
    }

    public boolean automaticWarningMsgCheck() {
        return automaticWarningMsg.isDisplayed();
    }

    public void saveBtnClick() {
        saveBtn.click();
    }

    public boolean savedAutomaticCheck() {
        return savedAutomaticMethod.isDisplayed();
    }

    public void crypto() {
        crypto.click();
    }

    public void cryptoCurrency() {
        cryptocurrency.click();
    }

    public void accountsClick() {
        accounts.click();
    }

    public void firstWalletClick() {
        wallet.click();
    }

    public String getSavedWalletNum() {
        String number = savedWallet.getText();
        return number;
    }

    public boolean savedWalletCheck() {
        return savedWallet.isDisplayed();
    }

    public void card() {
        card.click();
    }

    public void addNewCardClick() {
        addNewCard.click();
    }

    public void cardClick() {
        cardselect.click();
    }

    public void phoneChangeBtnClick() throws InterruptedException {
        emialChange.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(5000);
        phoneChange.click();
    }

    public void faxChangeBtnClick() {
        faxChange.click();
    }

    public void emailChangeBtnClick() {
        emialChange.click();
    }

    public void postalmailChangeBtnClick() throws InterruptedException {
        postalmail.click();
    }

    public boolean sucessMessageCheck() {
        return message.isDisplayed();
    }

    public void Change5() {
        change5.click();
    }

    public void prefLanguageBtnCLik() {
        preferredLanguage.click();
    }

    public void Dropdown() throws InterruptedException {
        dropdown.click();
    }

    public void firstCurrencyClick() {
        firstCurrency.click();
    }

    public void secondCurrencyClick() {
        secondCurrency.click();
    }

    public void thirdCurrencyClick() {
        thirdCurrency.click();
    }

    public boolean savedSettingsCheck() {
        String currency = savedCurrency.getText();
        String language = savedLanguage.getText();
        if ((currency.contains("USD") || currency.contains("EUR") || currency.contains("GBP")) && (language.contains("English")
                || language.contains("Español") || language.contains("German"))) {
            return savedCurrency.isDisplayed();
        }
        return false;
    }

    public void firstLanguageClick() {
        firstLanguage.click();
    }

    public void secondLanguageClick() {
        secondLanguage.click();
    }

    public void thirdLanguageClick() {
        thirdLanguage.click();
    }

    public void countDebtorCreditCard() {
       // String cardList=List<WebElement> countDebtorCreditCard;
        //int cardList=countDebtorCreditCard.size();
        addedCardNum = countDebtorCreditCard.size();
        //System.out.println("This the card id : "+cardList);

    }

    public boolean verifyNewCard() {

        boolean result;
        newCardNum = countDebtorCreditCard.size();
        if (newCardNum > addedCardNum) result = true;
        else result = false;
        return result;

    }

    public void selectNewAddedCard() {
        click(selectCard);
        selCardNum = selectCard.getText();
    }

    public boolean verifySavedCard() {
        boolean result;
        if (selCardNum.equals(saveCardNumber.getText())) result = true;
        else result = false;
        return result;
    }

    public Boolean IsShoppingPopup()
    {
        return popup.isDisplayed();
    }

    public void buttonCancel()
    {
        click(btnCancel);
    }

    public Boolean isRequestPageAvailable() {
        return shoppingAssertPage.isDisplayed();
    }

}

