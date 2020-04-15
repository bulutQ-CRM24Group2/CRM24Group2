package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import org.testng.annotations.Test;

public class AC3_AttachLink_Test extends AbstractBaseTest {

    @Test
    public void insertVideo () {
        extentTest = extentReports.createTest("Verify Link Insertion By Entering URL");
        Appreciation appreciation = new Appreciation();
        appreciation.sendLink();
        extentTest.pass("Link insertion is successful");
    }






}
