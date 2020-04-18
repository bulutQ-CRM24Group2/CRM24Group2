package com.automation.tests.us3_tests;


import com.automation.pages.ActivitySPage.ActivityStreamPage;
import com.automation.pages.LoginPage;
import com.automation.tests.AbstractBaseTest;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC_2_5_Tests extends AbstractBaseTest {


    //US 3_2  US:As a user, I should be able to create
    //events by clicking on Event tab under Activity Stream.
    @Test(description = " User should be able to attach link by clicking on the link icon.")
    public void attachLink() throws InterruptedException {
        extentTest = extentReports.createTest("attachLink");
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActivityStreamPage activityStrPage = new ActivityStreamPage();
        activityStrPage.sendMessageInput.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(activityStrPage.linkIcon));
        wait.until(ExpectedConditions.elementToBeClickable(activityStrPage.linkIcon));
        activityStrPage.linkIcon.click();
        wait.until(ExpectedConditions.visibilityOf(activityStrPage.linkText));

        activityStrPage.linkText.click();
        activityStrPage.linkText.sendKeys("please click here");
        activityStrPage.linkUrl.sendKeys("https://login1.nextbasecrm.com/company/vis_structure.php");
        activityStrPage.linkSaveBtn.click();
        wait.until(ExpectedConditions.visibilityOf(activityStrPage.sendBtn));
        wait.until(ExpectedConditions.elementToBeClickable(activityStrPage.sendBtn));
        activityStrPage.sendBtn.click();

        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("(//a[text()='please click here'])[1]")).getAttribute("href"), "https://login1.nextbasecrm.com/company/vis_structure.php");
        extentTest.pass("attach link is verified");
    }

    //US 3_5
    @Test(description = "User should be able to create a quote by clicking on the Comma icon.")
    public void createAQuote() throws InterruptedException {

        extentTest = extentReports.createTest("Create a quote" );
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        ActivityStreamPage activityStrPage = new ActivityStreamPage();
        activityStrPage.sendMessageInput.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(activityStrPage.quoteIcon));
        wait.until(ExpectedConditions.elementToBeClickable(activityStrPage.quoteIcon));
        activityStrPage.quoteIcon.click();
        Driver.getDriver().switchTo().frame(activityStrPage.frame);
        wait.until(ExpectedConditions.visibilityOf(activityStrPage.quoteInputText));

        activityStrPage.quoteInputText.sendKeys("abc");
        Driver.getDriver().switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(activityStrPage.sendBtn));
        wait.until(ExpectedConditions.elementToBeClickable(activityStrPage.sendBtn));
        BrowserUtils.wait(3);

        activityStrPage.sendBtn.click();
        String expected="abc";
        BrowserUtils.wait(8);
        String actual= Driver.getDriver().findElement(By.xpath("//td[text()='abc']")).getText();
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertEquals(actual,expected );
        extentTest.pass("Qote message displayed");
    }




}

