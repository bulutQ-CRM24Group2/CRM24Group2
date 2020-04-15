/**
 * Test: User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
 *
 * * @auhor Omer Faruk Sanlialp
 * @version 1.0
 * @since 2020-04-14
 */
package com.automation.tests.us_1_tests;

import com.automation.pages.LoginPage;
import com.automation.pages.Message;
import com.automation.pages.activityStream.ActivitySteamPageTop;
import com.automation.tests.AbstractBaseTest;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisualEditorTest extends AbstractBaseTest {

    /**
     * General login functionality for repeated test.
     */
    public static void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("hr");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
    }

    /**
     * User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
     */
    @Test(description = "US-1")
    public void visualEditorTest(){
        extentTest = extentReports.createTest("Add Mention Test");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        BrowserUtils.wait(3);
        Message msTest=new Message();
        msTest.typeMessage("Online Group - 2 Visual Editor Tested ");
        Assert.assertTrue(msTest.isVisualEditorDisplayed());
        BrowserUtils.wait(3);
        extentTest.pass("Test Succeed");
       test.send();

    }
}
