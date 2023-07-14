package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        //  Login to Application
        loginPage.enterTheUserName();
        Thread.sleep(1000);
        loginPage.enterThePassword();
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        Thread.sleep(1000);
        //	Verify "System Users" Text
        viewSystemUsersPage.verifySystemUser();
        Thread.sleep(1000);
        //	click On "Add" button
        homePage.addUserInTheSystem();
        Thread.sleep(1000);
        //	Verify "Add User" Text
        addUserPage.checkAddUserText();
        Thread.sleep(1000);

        //	Select User Role "Admin"
        addUserPage.clickOnUserRoleDropDown();
        Thread.sleep(1000);
        addUserPage.selectUserRoleDropDown();
        //	enter Employee Name "Ananya Dash"
        Thread.sleep(1000);
        addUserPage.enterEmployeeName();
        Thread.sleep(2000);
        //	enter Username
        addUserPage.enterUserName();
        Thread.sleep(2000);
        //	Select status "Disable"
        addUserPage.clickOnStatus();
        Thread.sleep(2000);
        addUserPage.selectDropDownDisabled();
        Thread.sleep(2000);
        //	enter password
        addUserPage.enterThePassword();
        Thread.sleep(2000);
        //	enter Confirm Password
        addUserPage.enterTheConformPassword();
        Thread.sleep(2000);
        //	click On "Save" Button
        addUserPage.clickOnSaveButton();
        //	verify message "Successfully Saved"


    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        // Login to Application
        loginPage.enterTheUserName();
        Thread.sleep(1000);
        loginPage.enterThePassword();
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        Thread.sleep(1000);
        //	Verify "System Users" Text
        viewSystemUsersPage.verifySystemUser();
        Thread.sleep(1000);
        //	Enter Username
        adminPage.enterSystemUserName();
        Thread.sleep(1000);
        //	Select User Role
        adminPage.enterSystemUserRole();
        adminPage.choseSystemUserRoleFromDrop();
        Thread.sleep(1000);
        adminPage.writeEmployeeName();
        //	Select Status
        adminPage.clickOnSelectStatus();
        Thread.sleep(1000);
        adminPage.pickDisableFormTheDropDown();
        Thread.sleep(1000);
        //	Click on "Search" Button
        adminPage.ClickOnSearchButton();
        Thread.sleep(1000);
        //	Verify the User should be in Result list.
        adminPage.verifyTheUserName();

    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        //Login to Application
        loginPage.enterTheUserName();
        Thread.sleep(1000);
        loginPage.enterThePassword();
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        Thread.sleep(1000);
        //	Verify "System Users" Text
        viewSystemUsersPage.verifySystemUser();
        Thread.sleep(1000);
        //	Enter Username
        adminPage.enterSystemUserName();
        Thread.sleep(1000);
        //	Select User Role
        adminPage.enterSystemUserRole();
        Thread.sleep(1000);
        adminPage.choseSystemUserRoleFromDrop();
        //	Select Status
        adminPage.clickOnSelectStatus();
        Thread.sleep(1000);
        adminPage.pickDisableFormTheDropDown();
        //	Click on "Search" Button
        adminPage.ClickOnSearchButton();
        Thread.sleep(1000);
        //	Verify the User should be in Result list.
        adminPage.verifyTheUserName();
        Thread.sleep(1000);
        //	Click on Check box
        adminPage.clickOnCheckBox();
        Thread.sleep(1000);
        //	Click on Delete Button
        adminPage.clickOnDelete();
        Thread.sleep(1000);
        //	Popup will display
        //	Click on Ok Button on Popup
        adminPage.acceptAlert();
        Thread.sleep(1000);
        //	verify message "Successfully Deleted"


    }
@Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        //Login to Application
        loginPage.enterTheUserName();
        Thread.sleep(1000);
        loginPage.enterThePassword();
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        Thread.sleep(1000);
        //	Verify "System Users" Text
        viewSystemUsersPage.verifySystemUser();
        Thread.sleep(1000);
        //	Enter Username
        adminPage.enterSystemUserName();
        Thread.sleep(1000);
        //	Select User Role
        adminPage.enterSystemUserRole();
        Thread.sleep(1000);
        adminPage.choseSystemUserRoleFromDrop();
        //	Select Status
        adminPage.clickOnSelectStatus();
        Thread.sleep(1000);
        adminPage.pickDisableFormTheDropDown();
        //	Click on "Search" Button
        adminPage.ClickOnSearchButton();
        Thread.sleep(1000);
        //	verify message "No Records Found"
        adminPage.noRecordsFound();
    }

}
