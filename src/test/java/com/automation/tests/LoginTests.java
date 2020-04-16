package com.automation.tests;

import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends  AbstractBaseTest {
    /**
     * Login and verify that page title is a "Portal"
     */
    @Test
    public void verifyPageTitle() {
        //test --> ExtentTest object
        //we must add to every test at the beginning
        //test = report.createTest("Test name");
        extentTest = extentReports.createTest("Verify page title");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        //like system.out, but it goes to report as well
        extentTest.info("Login as user");//log some steps
        BrowserUtils.wait(2);
        Assert.assertEquals(Driver.getDriver().getTitle(), "Portal");
        //if assertion passed, it will set test status in report to passed


        extentTest.pass("Page title Portal was verified");
    }

    /**
     * Enter wrong credentials and verify warning message
     */

    @Test
    public void verifyWarningMessage() {
        extentTest = extentReports.createTest("Verify warning message");

        LoginPage loginPage = new LoginPage();
        loginPage.login("wrong", "wrong");
        Assert.assertEquals(loginPage.getWarningMessageText(), "Incorrect login or password");
        //take a screenshot
        BrowserUtils.getScreenshot("warning_message");

        extentTest.pass("Warning message is displayed");
    }

//    @Test
//    public void verifyUserName(){
//        extentTest = extentReports.createTest("Verify user name");
//        LoginPage loginPage = new LoginPage();
//        loginPage.login();
//        Assert.assertEquals(loginPage.getCurrentUserName(), ConfigurationReader.getProperty("hr"));
//        extentTest.pass("Username verified");
//    }

}
