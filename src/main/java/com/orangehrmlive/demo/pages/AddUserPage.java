package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By verifyAddUserText = By.xpath("//h6[normalize-space()='Add User']");

    By userRoleDropDown = By.xpath("((//div[contains(text(),'-- Select --')])[1]");
    By selectRole = By.xpath("//div[@class='oxd-select-text-input'][normalize-space()='Admin']");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By userName = By.cssSelector("div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.orangehrm-background-container div.orangehrm-card-container form.oxd-form div.oxd-form-row:nth-child(1) div.oxd-grid-2.orangehrm-full-width-grid div.oxd-grid-item.oxd-grid-item--gutters:nth-child(4) div.oxd-input-group.oxd-input-field-bottom-space div:nth-child(2) > input.oxd-input.oxd-input--active");
    By status = By.xpath("//div[contains(text(),'-- Select --')]");

    By statusDropDown = By.xpath("//font[contains(text(),'Disabled')]");
    By password = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By confirmPassword = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");

    By saveButton = By.xpath("//button[normalize-space()='Save']");


    public void checkAddUserText() {
        verifyText(verifyAddUserText, "Add User", "Add User text not found");
    }

    public void clickOnUserRoleDropDown() {
        clickOnElement(userRoleDropDown);
    }

    public void selectUserRoleDropDown() {
        selectByVisibleTextFromDropDown(selectRole, "Admin");
    }

    public void enterEmployeeName() {
        sendTextToElement(employeeName, "Ananya Dash");
    }

    public void enterUserName() {
        sendTextToElement(userName, "Ananya");
    }

    public void clickOnStatus() {
        clickOnElement(status);
    }

    public void selectDropDownDisabled() {
        selectByVisibleTextFromDropDown(statusDropDown, "Disabled");
    }

    public void enterThePassword() {
        sendTextToElement(password, "Rain1234!$");
    }

    public void enterTheConformPassword() {
        sendTextToElement(confirmPassword, "Rain1234!$");
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
    }


}
