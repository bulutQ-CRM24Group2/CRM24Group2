package com.automation.crm24.tests;

import com.automation.crm24.pages.LoginPage;
import com.automation.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void login(){
        extentTest=extentReports.createTest("Verify login as HR user");

        LoginPage loginPage=new LoginPage();
        loginPage.loginAs("hr");

        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
        extentTest.pass("Login succeed");
    }
}
