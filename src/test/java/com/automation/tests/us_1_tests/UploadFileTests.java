/**
 * Test: User should be able to click on upload files icon to upload files and pictures
 *
 * * @auhor Omer Faruk Sanlialp
 * @version 1.0
 * @since 2020-04-14
 */
package com.automation.tests.us_1_tests;


import com.automation.pages.LoginPage;
import com.automation.pages.Message;
import com.automation.pages.activityStream.ActivitySteamPageTop;
import com.automation.tests.AbstractBaseTest;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTests extends AbstractBaseTest {

    /**
     * General login functionality for repeated test.
     */
    public static void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs("hr");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Portal");
    }

    /**
     * User should be able to click on upload files icon to upload files and pictures from local disks
     */
    @Test(description = "US-1")
    public void uploadFileFromLocalDisk(){

        extentTest = extentReports.createTest("Upload image from local drive");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        Message msTest=new Message();

        msTest.uploadFileFromLocal("Downloads/CRM24/testDocument/1.jpg");

        msTest.typeMessage("Online Group - 2 Upload File from Local File");
        BrowserUtils.wait(5);
        extentTest.pass("Upload Succeed");
        test.send();

    }

    /**
     * User should be able to click on upload files icon to download from external drive.
     */
    @Test(description = "US-1")
    public void downloadFileFromExtarnal(){
        extentTest = extentReports.createTest("Upload image from extarnal drive");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        Message msTest=new Message();
        msTest.uploadFileFromExtarnalDrive();

        BrowserUtils.wait(5);
        msTest.typeMessage("Online Group - 2 Upload File from Extarnal");
        extentTest.pass("Upload Succeed");
        test.send();

    }


    /**
     * User should be able to click on upload files icon to select documents from bixtrix24,
     * and create files to upload.
     */
    @Test(description = "US-1")
    public void selectDocumentFromBitrix24(){
        extentTest = extentReports.createTest("Upload image from Bitrix24");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        Message msTest=new Message();
        msTest.uploadFileFromBitrix24("1 (15).jpg");

        BrowserUtils.wait(5);
        msTest.typeMessage("Online Group - 2 Upload File From Bitrix24");

        extentTest.pass("Upload Succeed");
        test.send();

    }

    /**
     * User should be able to click on upload files icon to create files to upload. From Document
     */
    @Test(description = "US-1")
    public void createFileToUploadFromDocument(){

        extentTest = extentReports.createTest("Upload image from Office365");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        Message msTest=new Message();
        msTest.createUploadFileOffice365("Document");
        BrowserUtils.wait(5);
        msTest.typeMessage("Online Group - 2 Upload File From Bitrix24");

        extentTest.pass("Upload Succeed");
        test.send();

    }
    /**
     * User should be able to click on upload files icon to create files to upload. From Spreadsheet
     */
    @Test(description = "US-1")
    public void createFileToUploadSpreadsheet(){

        extentTest = extentReports.createTest("Upload image from Office365");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        Message msTest=new Message();
        msTest.createUploadFileOffice365("Spreadsheet");
        BrowserUtils.wait(5);
        msTest.typeMessage("Online Group - 2 Upload File From Bitrix24");

        extentTest.pass("Upload Succeed");
        test.send();

    }
    /**
     * User should be able to click on upload files icon to create files to upload. From Presentation
     */
    @Test(description = "US-1")
    public void createFileToUploadPresentation(){

        extentTest = extentReports.createTest("Upload image from Office365");
        login();
        ActivitySteamPageTop test=new ActivitySteamPageTop();
        test.navigateTo("message");
        Message msTest=new Message();
        msTest.createUploadFileOffice365("Presentation");
        BrowserUtils.wait(5);
        msTest.typeMessage("Online Group - 2 Upload File From Bitrix24");

        extentTest.pass("Upload Succeed");
        test.send();

    }
}
