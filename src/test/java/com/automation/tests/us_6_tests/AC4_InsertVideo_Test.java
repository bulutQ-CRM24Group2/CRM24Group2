package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import org.testng.annotations.Test;

public class AC4_InsertVideo_Test extends AbstractBaseTest {



        @Test
        public void insertVideo () {
            extentTest = extentReports.createTest("Verify Video Insertion By Entering URL");
            Appreciation appreciation = new Appreciation();
            appreciation.insertVid();
            extentTest.pass("Video insertion is successful");
        }


    }
