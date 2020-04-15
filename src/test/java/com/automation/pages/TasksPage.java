package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TasksPage extends AbstractBasePage {

    @FindBy(css = "#tasks-buttonAdd")
    private WebElement newTaskBtn;

    @FindBy(css = "#tasks-task-priority-cb")
    private WebElement highPriorityCheckBox;

    @FindBy(css = "#bx-panel-toggle-indicator")
    private WebElement editIcon;


    public TasksPage(){
        PageFactory.initElements(driver,this);
    }

    public void clickOnNewTaskBtn(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(newTaskBtn)).click();
    }

    public void clickOnHighPriorityCheckBox(){
        BrowserUtils.waitForPageToLoad(10);
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class=\"side-panel-content-container\"]//iframe")));
        BrowserUtils.wait(2);
//        driver.findElement(By.xpath("//div[@class=\"task-info-panel-title\"]//input[@type='text']")).sendKeys("hi there");
        wait.until(ExpectedConditions.visibilityOf(highPriorityCheckBox)).click();
        driver.switchTo().defaultContent();
        BrowserUtils.wait(2);
    }

    public void clickOnEditIcon(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(editIcon)).click();
    }

//    public void writeSth(){
//        BrowserUtils.waitForPageToLoad(10);
//        driver.switchTo().frame(driver.findElement(By.cssSelector("bx-editor-iframe")));
//        driver.findElement(By.xpath("//body[@contenteditable=\"true\"]")).sendKeys("hi there !!");
//    }
}
