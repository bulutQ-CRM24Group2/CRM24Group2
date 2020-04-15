package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AnnouncementPage extends AbstractBasePage{

    @FindBy(id = "feed-add-post-form-link-text")
    private WebElement more;

    @FindBy(xpath = "//*[@class='menu-popup-item-text' and contains(text(),'Announcement')]")
    private WebElement announcement;

    @FindBy(id = "POST_TITLE")
    private WebElement announcTitle;

    @FindBy(id ="blog-submit-button-save")
    private WebElement send;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    private WebElement uploadFilesBtn;

    @FindBy(xpath = "(//td[@class='wd-fa-add-file-light-cell'])[1]")
    private WebElement uploadBitrix;

    @FindBy(css = "[onclick='javascript:void(0);']")
    private WebElement bitrixDoc;

    @FindBy(xpath = "//span[text()='Select document']")
    private WebElement sendBitrixDoc;

    @FindBy(id = "bx-destination-tag")
    private WebElement addUsers;

    @FindBy(css = "[id^=destDepartmentTab_mention]")
    private WebElement employsAndDepart;

    @FindBy(css = ".bx-finder-box-tab.bx-lm-tab-last.bx-finder-box-tab-selected")
    private WebElement recent;

    @FindBy(xpath = "//div[text()='marketing1@cybertekschool.com']")
    private WebElement recentPerson;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    private WebElement closeWindow;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    private WebElement link;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    private WebElement linkText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    private WebElement linkURL;

    @FindBy(id = "undefined")
    private WebElement save;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    private WebElement video;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    private WebElement videoSource;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    private WebElement quota;

    @FindBy(css = ".bxhtmled-quote")
    private WebElement quotaText;

    @FindBy(id = "bx-b-mention-blogPostForm")
    private WebElement addMention;

    @FindBy(css = ".bx-finder-company-department-employee-name")
    List <WebElement> listOfContacts;

    @FindBy(xpath = "//span[@id='lhe_button_editor_blogPostForm']")
    private WebElement visualEditor;

    @FindBy(xpath = "//span[@data-bx-type=\"action\"]")
    private List<WebElement> listOfIcon;

    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    private WebElement textBar;

    @FindBy(id = "lhe_button_title_blogPostForm")
    private WebElement topicIcon;

    @FindBy(xpath = "//input[@placeholder=\"Topic\"]")
    private WebElement topicText;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    private WebElement tag;

    @FindBy(id = "TAGS_blogPostForm67abSn")
    private WebElement tagInput;


    public String announcementTitle(){
        return announcTitle.getAttribute("placeholder");
    }

    public void clickAnnouncement(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(more)).click();
        wait.until(ExpectedConditions.elementToBeClickable(announcement)).click();
    }

    public void uploadingBitrixFile(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(uploadFilesBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(uploadBitrix)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bitrixDoc)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sendBitrixDoc)).click();
        wait.until(ExpectedConditions.elementToBeClickable(send)).click();
    }

    public void addingUsers(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(addUsers)).click();
        wait.until(ExpectedConditions.elementToBeClickable(recent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(recentPerson)).click();
        wait.until(ExpectedConditions.elementToBeClickable(closeWindow)).click();
        wait.until(ExpectedConditions.elementToBeClickable(send)).click();
    }

    public void link(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
        wait.until(ExpectedConditions.visibilityOf(linkText)).sendKeys("Link is attached");
        wait.until(ExpectedConditions.visibilityOf(linkURL)).sendKeys("https://www.google.com/");
        wait.until(ExpectedConditions.elementToBeClickable(save)).click();
        wait.until(ExpectedConditions.elementToBeClickable(send)).click();
    }

    public void video(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(video)).click();
        wait.until(ExpectedConditions.visibilityOf(videoSource)).sendKeys("https://www.youtube.com/watch?v=W1xwTqgzQ_g");
        wait.until(ExpectedConditions.elementToBeClickable(save)).click();
        wait.until(ExpectedConditions.elementToBeClickable(send)).click();
    }

    public void quota(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(quota)).click();
        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.visibilityOf(quotaText)).sendKeys("This is an important announcement");
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.elementToBeClickable(send)).click();
    }

    public void addMention(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(addMention)).click();
        wait.until(ExpectedConditions.elementToBeClickable(employsAndDepart)).click();
        for (int i = 0; i <listOfContacts.size(); i++) {
            listOfContacts.get(1).click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(send)).click();
    }

    public void visualEditor(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(visualEditor)).click();
        for (int i = 0; i < listOfIcon.size() ; i++) {
            Assert.assertTrue(listOfIcon.get(i).isDisplayed());
        }
        Assert.assertEquals(listOfIcon.get(0).getAttribute("title"),"Bold");
        Assert.assertEquals(listOfIcon.get(1).getAttribute("title"),"Italic");
        Assert.assertEquals(listOfIcon.get(2).getAttribute("title"),"Underline");
    }

    public void topic(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(topicIcon)).click();

        String actual = topicText.getAttribute("placeholder");
        String expected = "Topic";
        BrowserUtils.wait(3);
        Assert.assertEquals(actual,expected);
    }

    public void tag(){
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(tag)).click();
        wait.until(ExpectedConditions.visibilityOf(tagInput)).sendKeys("holiday");
        wait.until(ExpectedConditions.elementToBeClickable(send)).click();
    }









}
