package bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPopup {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"ContentPlaceHolderForTop_ContentPlaceHolderQuickLinkForTop_Button1\"]")
    WebElement searchBtn;

    public SearchPopup(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSearchBtn(){

        searchBtn.click();
    }
}
