/**
 * This class sends, cancel messages and navigate through activities
 * These activities are functionality of Activity Stream Module
 *
 * @auhor Omer Faruk Sanlialp
 * @version 1.0
 * @since 2020-04-14
 */
package com.automation.pages.activityStream;

import com.automation.pages.AbstractBasePage;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivitySteamPageTop extends AbstractBasePage {

    @FindBy(id="feed-add-post-form-tab-message")
    private WebElement message;

    @FindBy(id="feed-add-post-form-tab-tasks")
    private WebElement task;

    @FindBy(id="feed-add-post-form-tab-calendar")
    private WebElement event;

    @FindBy(id="feed-add-post-form-tab-vote")
    private WebElement poll;

    @FindBy(xpath = "//span[@class=\"menu-popup-item-text\" and contains(text(),\"File\")]")
    private WebElement file;

    @FindBy(xpath = "//span[@class=\"menu-popup-item-text\" and contains(text(),\"Appreciation\")]")
    private WebElement appreciation;

    @FindBy(xpath = "//span[@class=\"menu-popup-item-text\" and contains(text(),\"Announcement\")]")
    private WebElement announcement;


    @FindBy(xpath = "//span[@class=\"menu-popup-item-text\" and contains(text(),\"Workflow\")]")
    private WebElement workflow;

    @FindBy(id="blog-submit-button-save")
    private WebElement send;

    @FindBy(id="blog-submit-button-cancel")
    private WebElement cancel;




    /**
     * User will enter proper tab name from Activity Scream Top part
     * @param tabValue it will accept message, task, event, poll, file, appreciation, aanouncement, workflow
     */
    public void navigateTo(String tabValue){
        BrowserUtils.waitForPageToLoad(10);
        tabValue=tabValue.toLowerCase();
        switch (tabValue){
            case "message":
                message.click();
                break;
            case "task":
                task.click();
                break;
            case "event":
                event.click();
                break;
            case "poll":
                poll.click();
                break;
            case "file":
                file.click();
                break;
            case "appreciation":
                appreciation.click();
                break;
            case "announcement":
                announcement.click();
                break;
            case "workflow":
                workflow.click();
                break;
            default:
                throw new RuntimeException("Invalid navigation tab name!!!");

        }

    }


    public void send(){
        BrowserUtils.waitForPageToLoad(10);
        send.click();

    }

    public void cancel(){
        BrowserUtils.waitForPageToLoad(10);
        cancel.click();
    }




}
