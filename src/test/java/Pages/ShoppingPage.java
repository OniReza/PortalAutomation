package Pages;

import Utility.CommonPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends CommonPageMethods {

    @FindBy(xpath = "//span[text()='Shopping']")
    public WebElement btnShopping;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/span[1]")
    public WebElement popup;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div/div/div/button[1]")
    public WebElement btnCancel;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement inputDescription;
    @FindBy(xpath = "//input[@name='brand']")
    public WebElement inputBrand;
    @FindBy(xpath = "//input[@name='style']")
    public WebElement inputStyle;
    @FindBy(xpath = "//input[@name='colour']")
    public WebElement inputColor;
    @FindBy(xpath = "//input[@name='weblink']")
    public WebElement inputWebLink;

    @FindBy(xpath = "(//i[@class='dropdown icon'])[1]")
    public WebElement searchReq;

    @FindBy(xpath = "//span[text()='All']")
    public WebElement allReq;

    @FindBy(xpath = "(//i[@class='dropdown icon'])[2]")
    public WebElement reqStatus;

    @FindBy(xpath = "//span[text()='In Progress']")
    public WebElement inProgressStatus;
    @FindBy(xpath = "//button[@class='ui primary button offset-top-10']")
    public WebElement buttonRequest;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div[2]/div/div[2]/div[2]/div")
    public WebElement shoppingAssertPage;
    public ShoppingPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void ShoppingBtn(){
        click(btnShopping);
    }
    public void DescriptionInput(){
        inputDescription.sendKeys("This is a test description");
    }
    public void BrandInput(){
        inputBrand.sendKeys("Nike");
    }
    public void StyleInput(){
        inputStyle.sendKeys("Test style");
    }
    public void ColorInput(){
        inputColor.sendKeys("Green");
    }
    public void WebLinkInput(){
        inputWebLink.sendKeys("www.test.com");
    }


    public void searchReqClick(){click(searchReq);}
    public void allReqClick(){click(allReq);}
    public void reqStatusClick(){click(reqStatus);}
    public void inProgressStatusClick(){click(inProgressStatus);}

    public void RequestButton(){
        click(buttonRequest);
    }

    public Boolean IsPopup()
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
