package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import com.automation.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class AC10_AddTags_Test extends AbstractBaseTest {

    @Test
    public void addTags() {
        extentTest = extentReports.createTest("Verify Adding Tags");

        Appreciation appreciation = new Appreciation();
        appreciation.navigateToAppreciation();
        BrowserUtils.wait(2);
        appreciation.sendTags();
        extentTest.pass("Adding And Selecting Tags Verified");
    }
}