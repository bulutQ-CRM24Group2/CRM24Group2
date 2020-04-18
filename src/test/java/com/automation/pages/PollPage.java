package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PollPage extends AbstractBasePage {
    public PollPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Poll']")
    public WebElement poll;
    @FindBy(css = "[class='bxhtmled-top-bar-btn bxhtmled-button-link'] ")
    public WebElement link;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement text;

    @FindBy(xpath = "(//div/input[@name='undefined'])[1]")
    public WebElement save;
    @FindBy(xpath = "//span[@title='Insert video']  ")
    public WebElement video;
    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSource;
    @FindBy(className = "adm-btn-save")
    public WebElement saveforVedio;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quote;


    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMention;

    @FindBy(className = "bxhtmled-quote")
    public WebElement textbox;


    @FindBy(xpath = "(//span[@title='Visual editor'])[1]")
    public WebElement visualStudio;


    @FindBy(xpath = "//span[@title='Topic']")
    public WebElement topicIcon;


   @FindBy(id="POST_TITLE")
    public WebElement topic;
@FindBy(className = "feed-add-post-form-but-cnt feed-add-videomessage")
public WebElement recordVideo;

    public void clickingUpload() {
        driver.findElement(By.id("bx-b-uploadfile-blogPostForm")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.name("bxu_files[]")).sendKeys(("/Users/ABC/Desktop/Screen Shot 2020-04-14 at 11.59.34 PM.png"));
        BrowserUtils.wait(2);

    }

    public void switchingToTextBox() {

        driver.switchTo().frame(driver.findElement(By.className("bx-editor-iframe")));

    }

    public void visualEditor() {
        List<WebElement> editor = driver.findElements(By.id("bx-html-editor-tlbr-idPostFormLHE_blogPostForm"));
        for (WebElement ele : editor) {
            if (ele.isDisplayed()) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
    }
}