package com.automation.crm24.tests;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class TestBase {

    protected WebDriver driver;

    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    @BeforeTest
    public void  beforeTest(){
        extentReports=new ExtentReports();
        String reportPath="";
        //this path part is completely depends on the os
        if (System.getProperty("os.name").toLowerCase().contains("win")){
            reportPath=System.getProperty("user.dir") + "\\test-output\\report.html";
        }else{
            reportPath=System.getProperty("user.dir")+"/tes-output/report.html";
        }
        extentHtmlReporter=new ExtentHtmlReporter(reportPath);//where it will be store pass the path
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setReportName("WebOrders Automation");
    }

    @AfterTest
    public void afterTest(){
        extentReports.flush();
    }

    @BeforeMethod
    public void setup(){
        driver= Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("url"));
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown(ITestResult testResult){
        if (testResult.getStatus()==ITestResult.FAILURE){
            String screenShotLocation= BrowserUtils.getScreenshot(testResult.getName());
            try {
                extentTest.fail(testResult.getName());//test name that failed
                extentTest.addScreenCaptureFromPath(screenShotLocation);//screenshot as an evidence
                extentTest.fail(testResult.getThrowable());//error message
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("");
            }
        }else if (testResult.getStatus()==ITestResult.SUCCESS){
            extentTest.pass(testResult.getName());
        }else if (testResult.getStatus()==ITestResult.SKIP){
            extentTest.skip(testResult.getName());
        }
        Driver.closeDriver();
    }
}
