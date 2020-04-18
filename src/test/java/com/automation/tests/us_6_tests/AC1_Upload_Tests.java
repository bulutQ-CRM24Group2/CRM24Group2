package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import org.testng.annotations.Test;

public class AC1_Upload_Tests extends AbstractBaseTest {


    @Test
       public void addDocFromBitrix () {
        extentTest = extentReports.createTest("Verify Link Insertion By Entering URL");
        Appreciation appreciation = new Appreciation();
        appreciation.selectDocFromBitrix();
        extentTest.pass("Link insertion is successful");
    }















}
