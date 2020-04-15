package com.automation.tests;


import com.automation.pages.LoginPage;
import com.automation.pages.Message;
import com.automation.pages.activityStream.ActivitySteamPageTop;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends AbstractBaseTest {


    @Test
    public void login(){
        extentTest = extentReports.createTest("Verify login as HR user");

        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("hr");

        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
        extentTest.pass("Login Succeed");

        extentTest = extentReports.createTest("upload image from local drive");
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        Message msTest=new Message();
        msTest.uploadFileFromLocal("Downloads/CRM24/testDocument/1.jpg");
        BrowserUtils.wait(10);

        msTest.typeMessage("This is for Omer");


        extentTest.pass("Upload Succeed");
        test.send();


    }


}
