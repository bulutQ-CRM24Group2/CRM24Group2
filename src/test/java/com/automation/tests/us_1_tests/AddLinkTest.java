/**
 * Test : User should be able to attach link by clicking on the link icon.
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

public class AddLinkTest extends AbstractBaseTest {

    /**
     * General login functionality for repeated test.
     */
    public static void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("hr");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
    }

    /**
     * User should be able to attach link by clicking on the link icon.
     */
    @Test(description = "US-1")
    public void addLinkTest(){
        extentTest = extentReports.createTest("Add Link Test");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        BrowserUtils.wait(3);
        Message msTest=new Message();
        msTest.typeMessage("Online Group - 2 Link Added: ");
        msTest.addLink("Google","https://google.com");
        BrowserUtils.wait(3);
        test.send();


    }

}
