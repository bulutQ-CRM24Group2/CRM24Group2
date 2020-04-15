package com.automation.tests;

import com.automation.pages.LoginPage;
import com.automation.pages.TasksPage;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class UserStory_02 extends AbstractBaseTest {

    @Test
    public void AC_01(){
        extentTest = extentReports.createTest("user story 2");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        TasksPage t = new TasksPage();
        t.leftNavigation("Tasks");
        t.clickOnNewTaskBtn();
        t.clickOnHighPriorityCheckBox();
        extentTest.pass("test pass");
    }

    @Test
    public void AC_02(){
        extentTest = extentReports.createTest("user story 2");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        TasksPage t = new TasksPage();
        t.leftNavigation("Tasks");
        t.clickOnEditIcon();
        extentTest.pass("test pass");
    }


}
