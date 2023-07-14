package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By admin = By.xpath("//li[1]//a[1]//span[1]");

    By addUser = By.xpath("//button[normalize-space()='Add']");

    By logoVerify = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");

    public void clickOnAdmin() {
        clickOnElement(admin);
    }

    public void addUserInTheSystem() {
        clickOnElement(addUser);
    }

    public void logoImage() {
        driver.findElement(logoVerify).isDisplayed();


    }

    public void launchUrl() {
        driver.get(driver.getCurrentUrl());
    }

}
