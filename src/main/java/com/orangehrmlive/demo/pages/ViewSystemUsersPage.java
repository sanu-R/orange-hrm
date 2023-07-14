package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {

    By systemUsers = By.xpath("//h5[normalize-space()='System Users']");

    public void verifySystemUser() {
        verifyText(systemUsers, "System Users", "System Users is not found");
    }


}
