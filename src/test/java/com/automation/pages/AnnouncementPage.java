package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

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

    @FindBy(xpath = "(//div[@class='diskuf-uploader'])[1]")
    private WebElement uploadFileBox;

    @FindBy(xpath = "(//td[@class='wd-fa-add-file-light-cell'])[1]")
    private WebElement uploadBitrix;

    @FindBy(css = "[onclick='javascript:void(0);']")
    private WebElement bitrixDoc;

    @FindBy(xpath = "//span[text()='Select document']")
    private WebElement sendDocBitrix;

    @FindBy(id = "bx-destination-tag")
    private WebElement addUsers;

    @FindBy(id = "destEmailTab_destination6511583")
    private WebElement emailUser;

    @FindBy(id = "destDepartmentTab_destination6511583")
    private WebElement employsAndDepart;

    @FindBy(id = "destLastTab_destination6511583")
    private WebElement recent;

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

    @FindBy(id = "bx-b-mention-blogPostForm")
    private WebElement addMention;

    @FindBy(id = "//span[@id='lhe_button_editor_blogPostForm']")
    private WebElement visualEditor;

    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    private WebElement textBar;


    /**
     * Test Case:
     * Login
     * Go to More --> click
     * Go to Announcement -->click
     */


    public String announcementTitle(){

        return announcTitle.getAttribute("placeholder");
    }

    public void clickAnnouncement(){
        BrowserUtils.wait(3);
        more.click();
        BrowserUtils.wait(3);
        announcement.click();

    }


    public void uploadingFiles(){
        BrowserUtils.wait(3);
        uploadFilesBtn.click();
        uploadFileBox.click();
        BrowserUtils.wait(3);
        //Driver.getDriver().switchTo().window("Open").sendKeys("C:\\Users\\kenwe\\Desktop\\Class notes.docx");
        Driver.getDriver().switchTo().defaultContent();
        BrowserUtils.wait(3);
        send.click();
    }

    public void uploadingBitrix(){
        BrowserUtils.wait(3);
        uploadFilesBtn.click();
        uploadBitrix.click();
        BrowserUtils.wait(3);
        bitrixDoc.click();
        sendDocBitrix.click();
        BrowserUtils.wait(3);
        send.click();
    }

    public void addingUsers(){
        BrowserUtils.wait(3);
        addUsers.click();
        emailUser.click();
        employsAndDepart.click();
        recent.click();
        send.click();
    }

    public void link(){
        BrowserUtils.wait(3);
        link.click();
        BrowserUtils.wait(3);
        linkText.sendKeys("Link is attached");
        BrowserUtils.wait(3);
        linkURL.sendKeys("https://www.google.com/");//how to put url
        BrowserUtils.wait(3);
        save.click();
        send.click();
    }

    public void video(){
        video.click();
        videoSource.sendKeys("https://www.youtube.com/");
        send.click();
    }

    public void quota(){
        BrowserUtils.wait(3);
        quota.click();
        BrowserUtils.wait(3);
        send.click();
    }

    public void addMention(){
        BrowserUtils.wait(3);
        addMention.click();
        BrowserUtils.wait(3);
        employsAndDepart.click();
        send.click();
    }

    public void visualEditor(){
        BrowserUtils.wait(3);
        visualEditor.click();
        BrowserUtils.wait(3);
    }









}
