package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import org.testng.annotations.Test;

public class AC6_AddMention_Test extends AbstractBaseTest {

    @Test
    public void addMention() {
        extentTest = extentReports.createTest("Verify Adding Users By Mention Button");
        Appreciation appreciation = new Appreciation();
        appreciation.addMention();
        extentTest.pass("Adding users by mention button is successful");
    }
}


