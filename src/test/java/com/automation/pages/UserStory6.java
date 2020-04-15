package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class UserStory6 extends AbstractBasePage {
    @FindBy(css="[id='feed-add-post-form-link-more']")
    private WebElement more;
    @FindBy(xpath = "//span[text()='Appreciation']")
    private WebElement appreciation;
    @FindBy(id = "bx-grat-tag")
    private WebElement addEmployee;

    public void clickMore(){
        more.click();
    }
    public void sendAppreciationText(String comments){
        wait.until(ExpectedConditions.elementToBeClickable(appreciation)).click();
        driver.switchTo().frame(driver.findElement(By.className("bx-editor-iframe")));
        driver.findElement(By.cssSelector("[contenteditable='true']")).sendKeys(comments);
        driver.switchTo().defaultContent();
        BrowserUtils.wait(3);
        driver.findElement(By.id("blog-submit-button-save")).click();
    }

    public WebElement setUp(){
     return driver.findElement(By.id("feed-add-post-grat-type-selected"));
    }

    public WebElement up(){
       return driver.findElement(By.className("feed-add-grat-box feed-add-grat-medal-star"));
    }










}
