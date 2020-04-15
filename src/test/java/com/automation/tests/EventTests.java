package com.automation.tests;

import com.automation.pages.activity_stream.ActivityStream;
import com.automation.pages.activity_stream.EventPage;
import com.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EventTests extends AbstractBaseTest {

    @Test
    public void verifyLinkSaved() {
        extentTest = extentReports.createTest("Verify link saved");
        LoginPage loginPage = new LoginPage();
        ActivityStream activityStream = new ActivityStream();
        EventPage eventPage = new EventPage();
        loginPage.login();

        String text = "Presentation about project";
        String link = "https://dzone.com/articles/types-of-meetings-in-scrum-and-agile";


        activityStream.navigateTo("Event");
        eventPage.putEventName("Grooming Meeting");

        eventPage.clickLink(text,link);

        eventPage.clickSend();

        Assert.assertTrue(eventPage.getSavedInfo(text).isDisplayed());


    }

    @Test
    public void verifyFileUploaded() {
        extentTest = extentReports.createTest("Verify file uploaded");
        LoginPage loginPage = new LoginPage();
        ActivityStream activityStream = new ActivityStream();
        EventPage eventPage = new EventPage();
        loginPage.login();


        activityStream.navigateTo("Event");
        eventPage.putEventName("Grooming Meeting");
        eventPage.uploadFile();
        eventPage.chooseMembers("marketing1@cybertekschool.com");
        eventPage.clickSend();

        Assert.assertTrue(eventPage.getSavedFile().isDisplayed());
    }


    @Test
    public void verifyDateAndTimeSetted() {
        extentTest = extentReports.createTest("Verify date and time setted");
        LoginPage loginPage = new LoginPage();
        EventPage eventPage = new EventPage();
        ActivityStream activityStream = new ActivityStream();
        loginPage.login();

        activityStream.navigateTo("Event");
        eventPage.putEventName("Grooming Meeting");

        eventPage.clickStartDate();
        eventPage.selectMonth("June");
        //eventPage.selectYear("2020");
        eventPage.selectDay("21");

        //set time for meeting
        eventPage.clickStartTime();
        eventPage.setHour("2");
        eventPage.setMinutes("35");
        eventPage.getPm_am("pm");
        eventPage.clickSetTime();



        String startDate = eventPage.getStartDate();
        Assert.assertEquals(startDate, "06/21/2020");

        String startTime = eventPage.getStartTime();
        Assert.assertEquals(startTime, "2:35 pm" );

    }

    @Test
    public void verifyReminderSelected() {
        extentTest = extentReports.createTest("Verify set reminder button is selected");
        LoginPage loginPage = new LoginPage();
        ActivityStream activityStream = new ActivityStream();
        EventPage eventPage = new EventPage();
        loginPage.login();

        activityStream.navigateTo("Event");
        eventPage.putEventName("Grooming Meeting");
        //eventPage.selectReminder();
        Assert.assertTrue(eventPage.selectReminder().isSelected());
    }


    @Test
    public void verifyEvent(){
        extentTest = extentReports.createTest("Verify link saved");
        LoginPage loginPage = new LoginPage();
        ActivityStream activityStream = new ActivityStream();
        EventPage eventPage = new EventPage();

        String text = "Presentation about party";
        String link = "https://happybirthdaycakepic.com/Asiya/47/red-white-heart-happy-birthday-cake";

        String commandText = " Hi everybody, next month our friend Asiya's birthday. I am planning to make her to surprise birthday party. " +
                "If you can join it would be very nice. I attached video, file, and link. You can check it out. Thank you!";

        loginPage.login();
        activityStream.navigateTo("Event");
        eventPage.putEventName("Birthday Party");

        eventPage.putCommands(commandText);

        eventPage.clickLink(text,link);

        eventPage.uploadFile();


        eventPage.clickStartDate();
        eventPage.selectMonth("May");
        eventPage.selectYear("2020");
        eventPage.selectDay("9");

        //set time for meeting
        eventPage.clickStartTime();
        eventPage.setHour("2");
        eventPage.setMinutes("35");
        eventPage.getPm_am("pm");
        eventPage.clickSetTime();

        eventPage.selectReminder();
        eventPage.chooseMembers("To all employees");

        eventPage.clickSend();
        Assert.assertTrue(eventPage.getSavedInfo(text).isDisplayed());
    }

}
