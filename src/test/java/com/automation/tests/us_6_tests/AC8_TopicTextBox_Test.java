package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC8_TopicTextBox_Test extends AbstractBaseTest {


    @Test
    public void appTopicTextBox() {
        extentTest = extentReports.createTest("Verify Topic Text Box Displayed");

        Appreciation appreciation = new Appreciation();
        appreciation.navigateToAppreciation();
        Assert.assertTrue(appreciation.topicbox());
        extentTest.pass("Topic Text Box Verified");

    }
}