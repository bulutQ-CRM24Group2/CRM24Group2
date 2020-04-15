package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC9_RecordVideo_Test extends AbstractBaseTest {


    @Test
    public void recordVideo() {
        extentTest = extentReports.createTest("Verify Video Recording and Attaching");

        Appreciation appreciation = new Appreciation();
        appreciation.navigateToAppreciation();
        appreciation.recordVideo();
        Assert.assertFalse(appreciation.recordVideo());
        extentTest.pass("Recording and Attaching Video Verified");


    }
}