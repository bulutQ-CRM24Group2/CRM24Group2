package com.automation.tests;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public abstract class AbstractBaseTest {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait;
    protected Actions actions;

    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    @BeforeTest
    public void beforeTest(){
        extentReports = new ExtentReports();

        String reportPath = "";

        if (System.getProperty("os.name").toLowerCase().contains("win")){
            reportPath = System.getProperty("user.dir")+"\\test-output\\report.html";
        }else {
            reportPath = System.getProperty("user.dir")+"/test-output/report.html";
        }

        extentHtmlReporter = new ExtentHtmlReporter(reportPath);
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setReportName("Bitrix24 Automation");

    }

    @AfterTest
    public void afterTest(){
        extentReports.flush();
    }


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("environment"));
        driver.manage().window().maximize();
        BrowserUtils.waitForPageToLoad(10);
    }


    @AfterMethod

    public void after(ITestResult iTestResult) {
        if (iTestResult.getStatus() == ITestResult.FAILURE) {
            String screenshortResult = BrowserUtils.getScreenshot(iTestResult.getName());
        }
        BrowserUtils.wait(3);
        Driver.closeDriver();

    }
}




