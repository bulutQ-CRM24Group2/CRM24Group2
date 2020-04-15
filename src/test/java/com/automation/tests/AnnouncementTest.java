package com.automation.tests;

import com.automation.pages.AnnouncementPage;
import com.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnouncementTest extends AbstractBaseTest {

    LoginPage loginPage = new LoginPage();
    AnnouncementPage announcementPage = new AnnouncementPage();

    @Test(priority = 0)
    public void sendAnnouncement() {
        extentTest = extentReports.createTest("Navigate to announcement");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();

        Assert.assertTrue(announcementPage.announcementTitle().equals("Topic"));
        extentTest.pass("Accessed to announcement tab");
    }

    @Test(priority = 1)
    public void uploadBitrixFiles() {
        extentTest = extentReports.createTest("Uploading files from Bitrix");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.uploadingBitrixFile();
        extentTest.pass("Uploaded files from Bitrix");
    }


    @Test(priority = 2)
    public void addUsers(){
        extentTest = extentReports.createTest("Adding recent users");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.addingUsers();
        extentTest.pass("User added from recent contacts");
    }

    @Test(priority = 3)
    public void attachLink(){
        extentTest = extentReports.createTest("Attaching link");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.link();
        extentTest.pass("Link attached by clicking link icon");
    }

    @Test(priority = 4)
    public void videoUploading(){
        extentTest = extentReports.createTest("Uploading video");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.video();
        extentTest.pass("Video uploaded by clicking on video icon");
    }

    @Test(priority = 5)
    public void quotaCreating(){
        extentTest = extentReports.createTest("Create a quota");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.quota();
        extentTest.pass("Quota created by clicking by comma icon");
    }

    @Test(priority = 6)
    public void addMention(){
        extentTest = extentReports.createTest("Add mention");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.addMention();
        extentTest.pass("Added mention by clicking Add mention icon");
    }


    @Test(priority = 7)
    public void visualEditor(){
        extentTest = extentReports.createTest("Visual Editor");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.visualEditor();
        extentTest.pass("Visual editor clicked and text-bar displays");
    }

    @Test(priority = 8)
    public void topic(){
        extentTest = extentReports.createTest("Topic text displaying");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.topic();
        extentTest.pass("Topic icon clicked and topic text-bar displays");
    }

    @Test(priority = 8)
    public void tag(){
        extentTest = extentReports.createTest("Adding tags");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.tag();
        extentTest.pass("Tags added by clicking # icon");
    }
}
