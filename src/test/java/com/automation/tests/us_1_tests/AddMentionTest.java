/**
 * Test: User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown
 * @auhor Omer Faruk Sanlialp
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

public class AddMentionTest extends AbstractBaseTest {

    /**
     * General login functionality for repeated test.
     */
    public static void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("hr");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
    }

    /**
     * User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown
     */
    @Test(description = "US-1")
    public void addMentionTest(){
        extentTest = extentReports.createTest("Add Mention Test");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        BrowserUtils.wait(3);
        Message msTest=new Message();
        msTest.typeMessage("Online Group - 2 Mention Added: ");
        msTest.addMention("Help");
        BrowserUtils.wait(3);
        extentTest.pass("Test Succeed");
        test.send();
    }

}
