package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldLoginSuccessFully() throws InterruptedException {
        //Enter username
        loginPage.enterTheUserName();
        Thread.sleep(1000);
        //Enter password
        loginPage.enterThePassword();
        //Click on Login Button
        loginPage.clickOnLoginButton();
        // Verify "Dashboard" Message
        dashboardPage.verifyDashBoardText();


    }

    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() throws InterruptedException {
        //Launch the application
        homePage.launchUrl();
        //Verify Logo is Displayed
        homePage.logoImage();


    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() throws InterruptedException {
        //Login To The application
        loginPage.enterTheUserName();
        Thread.sleep(1000);
        loginPage.enterThePassword();
        Thread.sleep(1000);
        loginPage.clickOnLoginButton();
        // Click on User Profile logo
        loginPage.profileBox();
        //Mouse hover on "Logout" and click
        loginPage.mouseHoverAndClick();
        // Verify the text "Login Panel" is displayed
        String expectedText = "Login";
        String actualText = loginPage.checkTheLoginText();
        Assert.assertEquals(actualText, expectedText, "Login text not found.");


    }


}
