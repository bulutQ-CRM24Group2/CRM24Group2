package com.automation.tests;

import com.automation.pages.LoginPage;
import com.automation.pages.US_8_Page;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.Test;


public class US_8_Test extends AbstractBaseTest {
private String getbutton;
private String generalRequest;
private String title;

    @Test
    public void workflow() {
        extentTest = extentReports.createTest("work flow");
        LoginPage loginPage = new LoginPage();
        loginPage.login("hr28@cybertekschool.com", "UserUser");
        BrowserUtils.waitForPageToLoad(10);


        US_8_Page workflow=new US_8_Page();

        workflow.getMiddleMore().click();

        workflow.clickOnSubTabs("Workflow");

        workflow.clickOnSubTabs("General Request");

        workflow.getTitle().sendKeys("KT session");

        workflow.get_desc_box();

        workflow.get_priority();

        workflow.click_select();

        workflow.click_email();

        workflow.click_send();



extentTest.pass("workflow test passed");











    }
}