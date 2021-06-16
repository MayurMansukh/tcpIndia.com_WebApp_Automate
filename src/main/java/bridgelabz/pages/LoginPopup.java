package bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPopup {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[8]/a")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    WebElement signIn;

    public LoginPopup(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginPopup(){
        loginBtn.click();
        signIn.click();
    }
}
