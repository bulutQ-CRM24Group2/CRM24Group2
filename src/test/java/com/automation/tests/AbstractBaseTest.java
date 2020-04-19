package com.automation.tests;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class AbstractBaseTest {

    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait;
    protected Actions actions;



    @BeforeTest
    @Parameters("reportName")
    public void setupTest(@Optional String reportName) {
        System.out.println("Report name: " + reportName);
        reportName = reportName == null ? "report.html" : reportName+".html";

        extentReports = new ExtentReports();

        String reportPath = "";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            reportPath = System.getProperty("user.dir") + "\\test-output\\" + reportName;
        } else {
            reportPath = System.getProperty("user.dir") + "/test-output/" + reportName;
        }
        extentHtmlReporter = new ExtentHtmlReporter(reportPath);
        extentReports.attachReporter(extentHtmlReporter);
        extentHtmlReporter.config().setReportName("NextBase CRM Test Automation Results");
    }

    @AfterTest
    public void afterTest() {
        extentReports.flush();
    }

    @BeforeMethod
    public void setup() {
        String URL = ConfigurationReader.getProperty("environment");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        wait = new WebDriverWait(Driver.getDriver(), 25);
        actions = new Actions(Driver.getDriver());

   
    }


   @AfterMethod
    public void teardown(ITestResult testResult){
        if (testResult.getStatus() == ITestResult.FAILURE){
            String screenshotLocation = BrowserUtils.getScreenshot(testResult.getName());
            try {
                extentTest.fail(testResult.getName());
                extentTest.addScreenCaptureFromPath(screenshotLocation);
                extentTest.fail(testResult.getThrowable());
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to attach screenshot");
            }
        }else if (testResult.getStatus() == ITestResult.SUCCESS){
            extentTest.pass(testResult.getName());
        }else if (testResult.getStatus() == ITestResult.SKIP){
            extentTest.skip(testResult.getName());
        }
        BrowserUtils.wait(3);
        Driver.closeDriver();
    }

}



