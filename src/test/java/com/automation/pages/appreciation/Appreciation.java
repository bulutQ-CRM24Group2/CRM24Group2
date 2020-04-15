package com.automation.pages.appreciation;

import com.automation.pages.AbstractBasePage;
import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Appreciation extends AbstractBasePage {

    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    private WebElement visualEditor;


    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    private WebElement upladFilesIcon;


    @FindBy(name = "bxu_files[]")
    private WebElement uploadFilesandImgbtn;

    @FindBy(id = "lhe_button_title_blogPostForm")
    private WebElement topicIcon;

    @FindBy(css = "[name='POST_TITLE']")
    private WebElement topicTextBox;


    @FindBy(className = "bx-editor-iframe")
    private WebElement messageBox;

    @FindBy(css = "[class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    private WebElement insVidBtn;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    private WebElement videoSource;

    @FindBy(xpath = "//input[@id='undefined']")
    private WebElement saveBtn;

    @FindBy(id = "blog-submit-button-save")
    private WebElement sendBtn;

    @FindBy(css = "[class='bxhtmled-dialog-tbl bxhtmled-video-dialog-tbl']")
    private WebElement vscreen;

    @FindBy(xpath = "//*[@id='bx-b-tag-input-blogPostForm']")
    private WebElement addTagbtn;

    @FindBy(id = "TAGS_blogPostForm67abSn")
    private WebElement tagEntr;

    @FindBy(xpath = "//div[@id='TAGS_blogPostForm67abSn_div_0_NAME' and contains (text(),'Advice')]")
    private WebElement tagShrt;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    private WebElement addBtn;

    @FindBy(id = "post-tags-add-new-blogPostForm")
    private WebElement addMoreBtn;

    @FindBy(xpath = "//body[@contenteditable='true']")
    private WebElement textEntr;


    @FindBy(css = "[class='feed-add-post-form-but-cnt feed-add-videomessage']")
    private WebElement recordVidBtn;


    @FindBy(xpath = "//*[@id='bx-popup-videomessage-popup']/div[3]/span[1]")
    private WebElement allowBtn;

    @FindBy(xpath = "//*[@id='bx-popup-videomessage-popup']/div[3]/span")
    private WebElement closeBtn;

    @FindBy(id = "popup-window-content-bx-popup-videomessage-popup")
    private WebElement errorMsg;

    @FindBy(id = "feed-add-post-form-link-text")
    private WebElement moreBtn;

    @FindBy(xpath = "//span[text()='Appreciation']")
    private WebElement apprecBtn;

    @FindBy(id = "lhe_button_editor_blogPostForm")
    private WebElement visualEditorBtn;

    @FindBy(css = "[class='bxhtmled-top-bar-btn bxhtmled-button-smile']")
    private WebElement smileyBtn;

    @FindBy(id = "bx-b-mention-blogPostForm")
    private WebElement addMentionBtn;

    @FindBy(css = "[id^='destDepartmentTab_mention']")
    private WebElement employeeLstbtn;

    @FindBy(css = "[title='Quote text']")
    private WebElement commaIcon;

    @FindBy(css = "[class='bx-editor-iframe']")
    private WebElement iframequote;

    @FindBy(css = "[class='bxhtmled-quote']")
    private WebElement iframEnter;

    @FindBy(css = "span[class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    private WebElement attachLinkBtn;

    @FindBy(id="linkidPostFormLHE_blogPostForm-text")
    private WebElement linkText;

    @FindBy(id="linkidPostFormLHE_blogPostForm-href")
    private WebElement linkUrl;

   @FindBy(id="bx-destination-tag")
    private WebElement addMoreUsrBtn;

    @FindBy(id="bx-destination-tag")
    private WebElement emailUsersBtn;

    @FindBy(id="bx-destination-tag")
    private WebElement employeesAnndDepBtn;

    @FindBy(linkText = "Select document from Bitrix24")
    private WebElement bitrixAddDocBtn;

    @FindBy(linkText = "Sales and marketing")
    private WebElement salesMrkBtn;

    @FindBy(linkText = "Marketing and advertising")
    private WebElement mrketingAdvsubBtn;

    @FindBy(linkText = "Logo.gif")
    private WebElement logo_Gif;

    @FindBy(id = "Select document")
    private WebElement selecDocBtn;

    @FindBy(linkText = "Insert in text")
    private WebElement insertInTextBtn;




    public void navigateToAppreciation() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk27@cybertekschool.com", "UserUser");
        //BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
        moreBtn.click();
        BrowserUtils.wait(2);
        apprecBtn.click();
        //  BrowserUtils.wait(2);
    }

    public void navigateToVisualEditor() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk27@cybertekschool.com", "UserUser");

        wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
        moreBtn.click();
        BrowserUtils.wait(2);
        apprecBtn.click();
        visualEditorBtn.click();
    }

    public void uploadFileSendImg() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk27@cybertekschool.com", "UserUser");

        wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
        moreBtn.click();
        BrowserUtils.wait(2);
        apprecBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(upladFilesIcon));
        upladFilesIcon.click();
        BrowserUtils.wait(2);
        uploadFilesandImgbtn.sendKeys(System.getProperty("user.dir") + "/Test.txt");
        BrowserUtils.wait(2);
    }
    public void selectDocFromBitrix() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk27@cybertekschool.com", "UserUser");

        wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
        moreBtn.click();
        BrowserUtils.wait(2);
        apprecBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(upladFilesIcon));
        upladFilesIcon.click();
        BrowserUtils.wait(2);
        uploadFilesandImgbtn.sendKeys(System.getProperty("user.dir") + "/Test.txt");
        BrowserUtils.wait(2);
        bitrixAddDocBtn.click();
        BrowserUtils.wait(2);
        salesMrkBtn.click();
        BrowserUtils.wait(1);
        mrketingAdvsubBtn.click();
        BrowserUtils.wait(1);
        logo_Gif.click();
        BrowserUtils.wait(1);
        selecDocBtn.click();
        BrowserUtils.wait(3);
        insertInTextBtn.click();
    }



       public boolean topicbox() {
        wait.until(ExpectedConditions.elementToBeClickable(topicIcon));
        topicIcon.click();
        wait.until(ExpectedConditions.elementToBeClickable(topicTextBox));

        if (topicTextBox.isDisplayed()) {
            return true;
        }
        return false;
    }

    public void insertVid() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk27@cybertekschool.com", "UserUser");
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
        moreBtn.click();
        BrowserUtils.wait(2);
        apprecBtn.click();
        wait.until(ExpectedConditions.visibilityOf(insVidBtn));
        insVidBtn.click();

        String videoUrl = " http://www.youtube.com/watch?v=rUWxSEwctFU ";
        videoSource.sendKeys(videoUrl);
        BrowserUtils.wait(10);
        wait.until(ExpectedConditions.visibilityOf(vscreen));

        vscreen.click();
        BrowserUtils.wait(2);
        Select vsize = new Select(driver.findElement(By.id("video_idPostFormLHE_blogPostForm-size")));
        vsize.selectByIndex(1);
        BrowserUtils.wait(3);

        saveBtn.click();

        BrowserUtils.wait(4);
        sendBtn.click();


    }

    public void sendTags() {
        wait.until(ExpectedConditions.elementToBeClickable(addTagbtn));
        addTagbtn.click();

        BrowserUtils.wait(2);
        tagEntr.sendKeys("a");
        BrowserUtils.wait(2);
        tagShrt.click();
        addBtn.click();
        BrowserUtils.wait(2);
        addMoreBtn.click();
        tagEntr.sendKeys("test", Keys.ENTER);

    }

    public boolean recordVideo() {
        wait.until(ExpectedConditions.elementToBeClickable(recordVidBtn));
        recordVidBtn.click();
        BrowserUtils.wait(2);
        allowBtn.click();
        BrowserUtils.wait(3);

        if (errorMsg.getText().equals("Cannot access your camera and microphone.")) {
            return false;
        }
        return true;
    }

    public void emojiTst() {
        wait.until(ExpectedConditions.elementToBeClickable(visualEditorBtn));
        visualEditorBtn.click();
        BrowserUtils.wait(2);
        smileyBtn.click();
        BrowserUtils.wait(2);

    }

    public void addMention() {
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk27@cybertekschool.com", "UserUser");
        //BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
        moreBtn.click();
        BrowserUtils.wait(2);
        apprecBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(addMentionBtn));

        addMentionBtn.click();
        BrowserUtils.wait(2);
        employeeLstbtn.click();
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name' and contains(text(),'hr37')]")).click();
        addMentionBtn.click();
        BrowserUtils.wait(1);
        employeeLstbtn.click();
        driver.findElement(By.xpath("//div[ @class='bx-finder-company-department-employee-name' and contains(text(),'hr76')]")).click();
        addMentionBtn.click();
        BrowserUtils.wait(1);
        employeeLstbtn.click();
        driver.findElement(By.xpath("//div[ @class='bx-finder-company-department-employee-name' and contains(text(),'hr51')]")).click();

    }



    public void addQuote (){
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk27@cybertekschool.com", "UserUser");
        //BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
        moreBtn.click();
        BrowserUtils.wait(2);
        apprecBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(commaIcon));
        commaIcon.click();
        BrowserUtils.wait(2);
        driver.switchTo().frame(iframequote);
        iframEnter.sendKeys("Hello World!");
        driver.switchTo().defaultContent();
        sendBtn.click();

    }

    public void sendLink () {
        LoginPage loginPage = new LoginPage();
        loginPage.login("helpdesk27@cybertekschool.com", "UserUser");
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
        moreBtn.click();
        BrowserUtils.wait(2);
        apprecBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(attachLinkBtn));
        attachLinkBtn.click();
        BrowserUtils.wait(2);
        linkText.sendKeys("Please click here to watch videos!");
        linkUrl.sendKeys("https/www.youtube.com", Keys.ENTER);
        BrowserUtils.wait(1);
        sendBtn.click();
        BrowserUtils.wait(2);

    }

public void addUsers (){
    LoginPage loginPage = new LoginPage();
    loginPage.login("helpdesk27@cybertekschool.com", "UserUser");
    wait.until(ExpectedConditions.elementToBeClickable(moreBtn));
    moreBtn.click();
    BrowserUtils.wait(2);
    apprecBtn.click();

    addMoreUsrBtn.click();
    BrowserUtils.wait(2);
    emailUsersBtn.click();



}
        }














