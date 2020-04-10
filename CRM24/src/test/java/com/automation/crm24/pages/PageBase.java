package com.automation.crm24.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {

    protected WebDriver driver= Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,20);

    @FindBy(id="user-block")
    protected WebElement currentUser;

    @FindBy(id="search-textbox-input")
    protected WebElement searchbox;

    @FindBy(className = "timeman-wrap")
    protected WebElement clockBox;

    @FindBy(className = "time-hours")
    protected WebElement clockHour;
    @FindBy(className = "time-minutes")
    protected WebElement clockMinutes;
    @FindBy(className = "time-am-pm")
    protected WebElement clockAmPm;
    @FindBy(id="sitemap-menu")
    protected WebElement siteMapBtn;



    public PageBase(){
        PageFactory.initElements(driver,this);
    }



    /**
     * This method will navigate to user specified module
     * @param module user will enter module name. Case sensitive
     */
    public void topNavigation(String module){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(siteMapBtn));
        siteMapBtn.click();
        String path="//a[@class='sitemap-section-title' and contains(text(),'"+module+"')]";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(path)))).click();
    }

    /**
     * This method will navigate to user specified module
     * @param subModule user will enter module name. Case sensitive
     */
    public void topNavigationSubModule(String subModule){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(siteMapBtn));
        siteMapBtn.click();
        String path="//a[@class='sitemap-section-item' and contains(text(),'"+subModule+"')]";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(path)))).click();
    }

//    /**
//     * This method will navigate to user specified module
//     * @param subModule user will enter module name. Case sensitive
//     */
//    public void topNavigationSubModule(String module,String subModule){
//        BrowserUtils.waitForPageLoad(10);
//        wait.until(ExpectedConditions.visibilityOf(siteMapBtn));
//        siteMapBtn.click();
//        String path="//a[@class='sitemap-section-title' and contains(text(),'"+subModule+"')]";
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(path)))).click();
//    }

    /**
     * This method will return time in different format from user specified
     * @param format accepts format as
     *               HH:MM for fulltime
     *               or HH for only hour
     *               or MM for only minute
     *               or PERIOD only for day period (AM or PM)
     * @return time as String value
     */
    public String getCurrentTime(String format){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(clockBox));
        format=format.toLowerCase();
        switch (format){
            case "HH:MM":
                return clockHour.getText()+":"+clockMinutes.getText()+" "+clockAmPm.getText();
            case "HH":
                return clockHour.getText();
            case "MM":
                return clockMinutes.getText();
            case "Period":
                return clockAmPm.getText();
            default:
                return "invalid time format selection";
        }
    }

    /**
     * This method returns Current user Name
     * @return username as String value
     */
    public String getCurrentUserName(){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return currentUser.getText().trim();
    }

    public void search_value(String value){
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(searchbox));
        searchbox.sendKeys(value, Keys.ENTER);
    }

}
