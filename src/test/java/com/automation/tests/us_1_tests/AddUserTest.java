/**
 * Test: User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
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

public class AddUserTest extends AbstractBaseTest {
    /**
     * General login functionality for repeated test.
     */
    public static void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("hr");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
    }


    /**
     * User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
     */
    @Test(description = "US-1")
    public void addContactFromGroupTest(){
        String department= "My Groups";
        String email="Soccer team";
        extentTest = extentReports.createTest("Add contact to message from "+department+"-"+email);
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        BrowserUtils.wait(3);
        sendMessageFromTo(department,email);
        extentTest.pass("Test Succeed");
        test.send();
    }

    /**
     * User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
     */
    @Test(description = "US-1")
    public void addContactFromEmployees(){
        String department= "Employees and departments";
        String email="helpdesk28@cybertekschool.com";
        extentTest = extentReports.createTest("Add contact to message from "+department+"-"+email);
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        BrowserUtils.wait(3);
        sendMessageFromTo(department,email);
        extentTest.pass("Test Succeed");
        test.send();
    }
    /**
     * User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
     */
    @Test(description = "US-1")
    public void addContactFromEmail(){
        String department= "E-mail users";
        String email="helpdesk28@cybertekschool.com";
        extentTest = extentReports.createTest("Add contact to message from "+department+"-"+email);
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        BrowserUtils.wait(3);
        sendMessageFromTo(department,email);
        extentTest.pass("Test Succeed");
        test.send();
    }

    public void sendMessageFromTo(String department,String email){
        Message msTest=new Message();
        msTest.typeMessage("Online Group - 2 add contact from "+department+" - "+ email);
        msTest.addPersonFrom(department,email);
        BrowserUtils.wait(3);
    }
}
