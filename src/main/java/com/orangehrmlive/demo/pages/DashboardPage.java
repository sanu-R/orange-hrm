package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By verifyText = By.tagName("//h6[normalize-space()='Dashboard']");

    public void verifyDashBoardText() {
        verifyText(verifyText, "Dashboard", "Dashboard text not found");
    }

}
