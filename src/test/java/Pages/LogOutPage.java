package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    public static WebDriver driver;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement LogoutBtn;

    public LogOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void logoutBtnClick() {
        LogoutBtn.click();
    }
}
