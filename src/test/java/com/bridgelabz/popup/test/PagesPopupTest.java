package com.bridgelabz.popup.test;

import bridgelabz.base.Base;
import bridgelabz.pages.LoginPopup;
import bridgelabz.pages.SearchPopup;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PagesPopupTest extends Base {

    @Test
    public void loginPopupTest() throws InterruptedException {
        LoginPopup loginPopup = new LoginPopup(driver);
        loginPopup.clickLoginPopup();
        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        Thread.sleep(5000);
        alert.accept();
        Assert.assertEquals(alertMessage,"Authentication Failed, Please use registered mobile recieved password.");

    }

     @Test
     public void searchPopupTest() throws InterruptedException {
         SearchPopup searchPopup = new SearchPopup(driver);
         searchPopup.clickSearchBtn();
         Thread.sleep(5000);

         Alert alert = driver.switchTo().alert();
         String alertMessage= driver.switchTo().alert().getText();
         System.out.println(alertMessage);
         Thread.sleep(5000);
         alert.accept();
         Assert.assertEquals(alertMessage,"Dear Patron!  Please contact the professional couriers booking office.");

    }
}
