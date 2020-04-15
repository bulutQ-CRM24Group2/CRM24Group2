package com.automation.tests;

import com.automation.pages.AnnouncementPage;
import com.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnouncementTest extends AbstractBaseTest {


    LoginPage loginPage = new LoginPage();
    AnnouncementPage announcementPage = new AnnouncementPage();

    @Test
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

    @Test
    public void uploadBitrixFiles() {
        extentTest = extentReports.createTest("Uploading files");

        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        extentTest.info("Login successfully");
        announcementPage.clickAnnouncement();
        extentTest.info("Accessed announcement");
        announcementPage.uploadingBitrix();
    }


    @Test
    public void addUsers(){
        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        announcementPage.clickAnnouncement();
        announcementPage.addingUsers();

    }

    @Test
    public void attachLink(){
        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        announcementPage.clickAnnouncement();
        announcementPage.link();
    }

    @Test
    public void quotaCreating(){
        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        announcementPage.clickAnnouncement();
        announcementPage.quota();
    }

    @Test
    public void visualEditor(){
        LoginPage loginPage = new LoginPage();
        AnnouncementPage announcementPage = new AnnouncementPage();

        loginPage.login();
        announcementPage.visualEditor();

       // Assert.assertTrue;
    }




}
