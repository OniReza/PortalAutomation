package Pages;
import Utility.BaseData;
import Utility.CommonPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.security.PublicKey;

public class LoginPage extends CommonPageMethods {
    @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement Email;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement Submit;
    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement Password;
    @FindBy(xpath = "//input[@id=\"code\"]")
    WebElement Totp;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/div[2]/p[1]")
    WebElement AssertLandingPage;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/header/div/div/div[2]/div[1]/div/span[2]")
    WebElement AssertBoardRegisterPage;

    @FindBy(xpath = " //span[text()=\"Dashboard\"]")
    WebElement AssertPage;

    @FindBy(xpath = "//h5[text()='Additional Information']")
    WebElement additionalInfo;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public  void emailAddress(String email){
    Email.sendKeys(email);
    }
    public void Password(String pass){
        Password.sendKeys(pass);
    }
    public void Totp(String otp) {
            Totp.sendKeys(otp);
    }

    public void Submit(){
        Submit.click();
    }

    public void PageClass()throws InterruptedException
    {
        String Email = BaseData.BaseEmail();
        String Pass=BaseData.BasePassword();
        String Otp = BaseData.BaseOtp();
        emailAddress(Email);
        Thread.sleep(1000);
        Submit();
        Thread.sleep(3000);
        Password(Pass);
        Thread.sleep(1000);
        Submit();
        Thread.sleep(3000);
        Totp(Otp);
        Thread.sleep(1000);
        Submit();
        Thread.sleep(5000);
    }

    public Boolean isBoardRegisterAvailable() {
        return AssertBoardRegisterPage.isDisplayed();
    }
    public Boolean isLandingPageAvailable() {
        return AssertLandingPage.isDisplayed();
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++Resub+++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @FindBy(xpath = "//button[text()='Make Payment']")
    WebElement makepayment;

   @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div[3]/div/div")
   WebElement CardDropdown;

   @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[2]")
   WebElement accounts;
   @FindBy (xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div[4]/table/tbody/tr[1]")
   WebElement firstWallet;
   @FindBy(xpath = "//li[@role='option' and contains(text(),'Card')]")
   WebElement debitCard;
   @FindBy(xpath = "//button[@role='button' and text()='PAY']")
   WebElement PAYBtn;
   @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div[2]/div")
   WebElement loader;
   @FindBy(xpath = "//span[text()='Dashboard']")
   WebElement dashBoard;
    public boolean makePaymentChcek(){
        return makepayment.isDisplayed();
    }
    public void Payment() throws InterruptedException {
        makepayment.click();
        Thread.sleep(1000);
        CardDropdown.click();
        Thread.sleep(2000);

    }
    public void payByWallet() throws InterruptedException {
        accounts.click();
        Thread.sleep(1000);
        firstWallet.click();
        Thread.sleep(1000);
        PAYBtn.click();
        Thread.sleep(1000);
    }
    public void payByCard() throws InterruptedException {
        debitCard.click();
        Thread.sleep(500);
        PAYBtn.click();
        Thread.sleep(2000);
    }
    public boolean loadingCheck(){
        return loader.isDisplayed();
    }
    public boolean dashBoardCheck(){
        return dashBoard.isDisplayed();

    }
}
