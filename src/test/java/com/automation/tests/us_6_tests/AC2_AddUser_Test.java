package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import org.testng.annotations.Test;

public class AC2_AddUser_Test extends AbstractBaseTest {

    @Test
    public void insertVideo () {
        extentTest = extentReports.createTest("Verify Link Insertion By Entering URL");
        Appreciation appreciation = new Appreciation();
        appreciation.addUsers();
        extentTest.pass("Link insertion is successful");
    }







}
