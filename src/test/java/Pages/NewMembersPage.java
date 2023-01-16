package Pages;

import Utility.BaseData;
import Utility.CommonPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMembersPage extends CommonPageMethods {
    public static WebDriver driver;

    @FindBy(xpath = "//div[contains(text(),'low')]")
    public WebElement topupPopup;
    @FindBy(xpath = "//input[@name='amount']")
    public  WebElement topupAmount;
    @FindBy(xpath = "//input[@name='terms'and @type='checkbox']")
    public  WebElement checkBox;
    @FindBy(xpath = "//span[text()='PROCEED']")
    public  WebElement proceedBtn;
    @FindBy(xpath = "//b[contains(text(),'Congratulations')]")
    public  WebElement sucessMsg;
    @FindBy(xpath = "//button[@role='button' and text()='OK']")
    public  WebElement okBtn;
    @FindBy(xpath = "//span[contains(text(),'Quick links')]")
    public WebElement quicklinks;
    @FindBy(xpath = "//span[contains(text(),'Virtual Cards')]")
    public WebElement virtualCardsTab;
    @FindBy(xpath = "//span[contains(text(),'Create Virtual Card')]")
    public WebElement createVcardBtn;
    @FindBy(xpath = "(//p[contains(text(),'US') or contains(text(),'Euro') or contains(text(),'Pound')])[1]")
    public WebElement firstCurrencyCard;
    @FindBy(xpath = "//div[@role='button' and text()='Selected']")
    public WebElement topupMethodDropdown;

    @FindBy(xpath = "//li[@data-value='card']")
    public WebElement debitCard;

    @FindBy(xpath = "//input[@id='standard-number']")
    public WebElement amountBox;
  // @FindBy(xpath = "//input[@type='checkbox']")
    @FindBy(xpath = "//div[@class=\"ui fitted checkbox Checkbox\"]")
    public WebElement topupCheckBox;

    @FindBy(xpath = "//span[text()='Continue']")
    public WebElement contunueBtn;
    @FindBy(xpath = "//span[text()='Summary']")
    public WebElement summary;
    @FindBy(xpath = "//button[text()='Confirm']")
    public WebElement confirmBtn;

    @FindBy(xpath = "(//input[@id='standard-number'])[2]")
    public WebElement otp;

    @FindBy(xpath = "(//span[text()='Activate'])")
    public WebElement activateBtn;


public boolean topupPopupCheck(){
    return topupPopup.isDisplayed();
}

    public void entertopupAmount () throws InterruptedException {
        topupAmount.clear();
        Thread.sleep(2000);
        topupAmount.sendKeys("00");
    }

    public void checkBoxClick (){
        checkBox.click();
    }
    public void ProceedBtnClick(){
        click(proceedBtn);
    }
    public boolean sucessMsgCheck(){
        return sucessMsg.isDisplayed();
    }
    public void okBtnClick(){
        click(okBtn);
    }
    public NewMembersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public boolean dashboardCheck(){
    return quicklinks.isDisplayed();
    }

    public void virtualCardsTabClick(){
        click(virtualCardsTab);
    }
    public void createVcardBtnClick(){
        click(createVcardBtn);
    }

    public void firstVcardCreation(){
        click(firstCurrencyCard);
    }

    public void methodSelect() throws InterruptedException {
        topupMethodDropdown.click();
        Thread.sleep(2000);
        debitCard.click();
    }
    public void enterAmout(){
        amountBox.sendKeys("32");
    }
    public void topupcheckBoxClick(){

        topupCheckBox.click();
    }
    public void continueBtnClick(){
        click(contunueBtn);
    }

    public boolean summaryCheck(){
    return summary.isDisplayed();
    }
    public void confirmBtnClick(){
        click(confirmBtn);
    }
    public void enterOtp(){
    otp.sendKeys(BaseData.BaseOtp());
    }
    public void activateBtnClick (){
    click(activateBtn);
    }

    public boolean IsCreateBtn(){
        return createVcardBtn.isDisplayed();
    }

}
