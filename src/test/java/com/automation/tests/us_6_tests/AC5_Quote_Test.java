package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import org.testng.annotations.Test;

public class AC5_Quote_Test extends AbstractBaseTest {

    @Test
    public void addMention() {
        extentTest = extentReports.createTest("Verify Creating a Quote By Pressing Comma Icon");
        Appreciation appreciation = new Appreciation();
        appreciation.addQuote();
        extentTest.pass("Creating a quote is successful");
    }



}
