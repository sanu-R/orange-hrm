package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {
    By systemUserName = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By systemUserRole = By.xpath("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By choseRole = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='Admin'])[1]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By selectStatus = By.xpath("//div[contains(text(),'-- Select --')]");
    By pickDisable = By.xpath("//div[contains(text(),'-- Select --')]");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By userVerify = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]");
    By checkBox = By.xpath("//div[@class='orangehrm-container']//div[3]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]");
    By deleteButton = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[6]/div[1]/button[1]");
    By noRecords = By.xpath("//span[normalize-space()='No Records Found']");

    public void enterSystemUserName() {
        sendTextToElement(systemUserName, "Ananya");
    }

    public void enterSystemUserRole() {
        clickOnElement(systemUserRole);
    }

    public void choseSystemUserRoleFromDrop() {
        selectByVisibleTextFromDropDown(choseRole, "Admin");
    }

    public void writeEmployeeName() {
        sendTextToElement(employeeName, "Linda Anderson");
    }

    public void clickOnSelectStatus() {
        clickOnElement(selectStatus);
    }

    public void pickDisableFormTheDropDown() {
        selectByVisibleTextFromDropDown(pickDisable, "Disabled");
    }


    public void ClickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public void verifyTheUserName() {
        verifyText(userVerify, "Ananya", "Text not found");
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }

    public void clickOnDelete() {
        clickOnElement(deleteButton);
    }

    public void clickOkToPopUp() {
        acceptAlert();
    }

    public void noRecordsFound() {
        verifyText(noRecords, "No Records Found", "No Records Found text not display");


    }
}