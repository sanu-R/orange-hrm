package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By storeUsername = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");

    By logo = By.xpath("//div[@class='orangehrm-login-slot-wrapper']");
    By porFileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']");

    By logOut = By.xpath("//a[normalize-space()='Logout']");
    By textLogin = By.xpath("//h5[normalize-space()='Login']");

    public void enterTheUserName() {
        sendTextToElement(storeUsername, "Admin");
    }

    public void enterThePassword() {
        sendTextToElement(password, "admin123");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }


    public void logoIsDisPlay() {
        verifyText(logo, "Login", "Login text not found");
    }

    public void profileBox() {
        clickOnElement(porFileLogo);
    }

    public void mouseHoverAndClick() {
        mouseHoverToElementAndClick(logOut);
    }

    public String checkTheLoginText() {
       return getTextFromElement(textLogin);
    }


}
