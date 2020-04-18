package com.automation.tests;

import com.automation.pages.LoginPage;
import com.automation.pages.PollPage;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class PollTest extends AbstractBaseTest {
    @Test
    public void test1() {//done
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtils.wait(4);
        PollPage pollPage = new PollPage();
        pollPage.poll.click();
        BrowserUtils.wait(5);
        pollPage.clickingUpload();

    }
        @Test
        public void test3() {//done
            LoginPage loginPage = new LoginPage();
            loginPage.login();
            BrowserUtils.wait(4);
            PollPage pollPage = new PollPage();
            BrowserUtils.wait(6);
            pollPage.poll.click();
           BrowserUtils.wait(7);
            pollPage.link.click();
            BrowserUtils.wait(4);
            pollPage.text.sendKeys("https://github.com/raksanao/Homework5");
            BrowserUtils.wait(8);
            pollPage.save.click();
            BrowserUtils.wait(3);
        }
@Test
        public void test4() {//done

    LoginPage loginPage = new LoginPage();
    loginPage.login();
    BrowserUtils.wait(4);
    PollPage pollPage = new PollPage();
    BrowserUtils.wait(3);
    pollPage.poll.click();
    BrowserUtils.wait(7);
    pollPage.video.click();
    BrowserUtils.wait(6);
    pollPage.videoSource.sendKeys("https://www.youtube.com/watch?v=2rBvTqao1RE", Keys.ENTER);
    BrowserUtils.wait(10);
}
@Test
        public  void test5() {//done
    LoginPage loginPage = new LoginPage();
    loginPage.login();
    BrowserUtils.wait(4);
    PollPage pollPage = new PollPage();
    BrowserUtils.wait(6);
    pollPage.poll.click();
    BrowserUtils.wait(9);
    pollPage.quote.click();
    BrowserUtils.wait(10);
    pollPage.switchingToTextBox();
    BrowserUtils.wait(6);
    pollPage.textbox.sendKeys("Welcome to Batch 15 online ");
    driver.switchTo().defaultContent();
}
@Test
        public void test6() {//not finished
    LoginPage loginPage = new LoginPage();
    loginPage.login();
    BrowserUtils.wait(8);
    PollPage pollPage = new PollPage();
    BrowserUtils.wait(9);
    pollPage.poll.click();
BrowserUtils.wait(9);
    pollPage.addMention.click();
    BrowserUtils.wait(4);
}
@Test
public void test7() {//done
    LoginPage loginPage = new LoginPage();
    loginPage.login();
    BrowserUtils.wait(4);
    PollPage pollPage = new PollPage();
    pollPage.poll.click();
    BrowserUtils.wait(7);
    pollPage.visualStudio.click();
    BrowserUtils.wait(9);
    pollPage.switchingToTextBox();

    BrowserUtils.wait(9);
    pollPage.visualEditor();
}
@Test
public void testCase8(){//done

    LoginPage loginPage = new LoginPage();
    loginPage.login();
    BrowserUtils.wait(4);
    PollPage pollPage = new PollPage();
    BrowserUtils.wait(5);
    pollPage.poll.click();
BrowserUtils.wait(6);
pollPage.topicIcon.click();
BrowserUtils.wait(7);
pollPage.topic.getText();
Assert.assertTrue(pollPage.topic.isDisplayed());



    }
    @Test
    public void testCase9(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BrowserUtils.wait(4);
        PollPage pollPage = new PollPage();
        BrowserUtils.wait(5);
        pollPage.poll.click();
        pollPage.recordVideo.click();//failed







    }
}
/*"1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
2. User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
3. User should be able to attach link by clicking on the link icon.
4. User should be able to insert videos by clicking on the video icon and entering the video URL.
5. User should be able to create a quote by clicking on the Comma icon.
6. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
8. User should be able to click on the Topic icon to see the poll Topic text box displays on top of the message box.
9. User should be able to click on ""Record Video"" tab to record a video and attach it with the message.
10. User should be able to Add questions and multiple answers; user can provide multiple choice to attendees by selecting the Allow multiple choice checkbox."					*/