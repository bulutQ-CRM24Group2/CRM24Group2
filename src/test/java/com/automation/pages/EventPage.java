package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class EventPage extends AbstractBasePage {

    @FindBy(name = "EVENT_NAME")
    private WebElement eventName;

    @FindBy(xpath = "//body[@contenteditable='true']")
    private WebElement commands;

    //upload files
    @FindBy(id = "bx-b-uploadfile-blogPostForm_calendar")
    private WebElement uploadFile;
    @FindBy(xpath = "(//span[text()='Select document from Bitrix24'])[3]")
    private WebElement documentFrom;
    @FindBy(name = "bxu_files[]")
    private WebElement upload;
    @FindBy(xpath = "(//span[@class='bx-file-dialog-column-row bx-file-dialog-column-name'])[4]")
    private WebElement file;
    @FindBy(css = "[id^=feed-event-view-link]")
    private WebElement savedFile;
    @FindBy(xpath = "//span[text()='Select document']")
    private WebElement selectDoc;

    //link
    @FindBy(xpath = "(//span[@title='Link'])[2]//i")
    private WebElement link;
    @FindBy(id = "linkoCalEditorcal_3Jcl-href")
    private WebElement linkURL;
    @FindBy(id = "linkoCalEditorcal_3Jcl-text")
    private WebElement linkText;
    @FindBy(id = "undefined")
    private WebElement saveLink;

    //insert video
    @FindBy(xpath = "(//span[@title='Insert video'])[2]")
    private WebElement insertVideo;
    @FindBy(id = "video_oCalEditorcal_3Jcl-source")
    private WebElement videoURL;
    @FindBy(xpath = "(//input[@id='undefined'])[1]")
    private WebElement saveVideo;

    //quote
    @FindBy(xpath = "(//span[@title='Quote text'])[2]")
    private WebElement quote;
    @FindBy(className = "bxhtmled-quote")
    private WebElement quoteText;
    @FindBy(xpath = "//table[@class='quote']//td")
    private WebElement savedQuote;

    //date, time stuff
    @FindBy(name = "DATE_FROM")
    private WebElement startDate;
    @FindBy(name = "DATE_TO")
    private WebElement endDate;

    @FindBy(className = "bx-calendar-top-month")
    private WebElement month;
    @FindBy(className = "bx-calendar-top-year")
    private WebElement year;



    @FindBy(xpath = "//input[@title='Hours']")
    private WebElement hour;

    @FindBy(xpath = "//input[@title='Minutes']")
    private WebElement minutes;

    @FindBy(name = "TIME_FROM_")
    private WebElement timeFrom;

    @FindBy(name = "TIME_TO_")
    private WebElement timeTo;

    @FindBy(css = "[value='Set Time']")
    private WebElement setTime;

    @FindBy(xpath = "(//td[@title='Increase (Up)'])[1]")
    private WebElement increaseHour;

    @FindBy(xpath = "(//td[@title='Increase (Up)'])[2]")
    private WebElement increaseMinutes;

    @FindBy(className = "bxc-am-pm")
    private WebElement am_pm;

    @FindBy(css = "[name='EVENT_REMIND']")
    private WebElement setReminder;

    @FindBy(name = "EVENT_LOCATION")
    private WebElement eventLocation;

    @FindBy(id = "feed-event-dest-add-link")
    private WebElement members;


    @FindBy(id = "blog-submit-button-save")
    private WebElement send;





    public EventPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Puts event name
     * @param name event name to put
     */
    public void putEventName(String name) {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(eventName));
        eventName.sendKeys(name);
        driver.switchTo().defaultContent();
    }

    /**
     * Switches to frame and puts command
     * @param command
     */
    public void putCommands(String command) {
        BrowserUtils.waitForPageToLoad(20);
        driver.switchTo().frame(driver.findElement(By.className("bx-editor-iframe")));
        wait.until(ExpectedConditions.visibilityOf(commands));
        commands.sendKeys(command);
        BrowserUtils.wait(3);
        driver.switchTo().defaultContent();
    }


    /**
     * Fill link info and saves it
     * @param text text to put inside linkText box
     * @param URL URL to put inside URL box
     */
    public void clickLink(String text, String URL) {
        BrowserUtils.waitForPageToLoad(20);

        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
        BrowserUtils.wait(2);

        wait.until(ExpectedConditions.visibilityOf(linkText));
        linkText.sendKeys(text);
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.visibilityOf(linkURL));
        linkURL.sendKeys(URL);
        BrowserUtils.wait(3);
        saveLink.click();
        BrowserUtils.wait(2);
    }

    /**
     *
     * @param linkText checks info with linkText
     * @return returns saved info as a WebElement
     */
    public WebElement getSavedInfo(String linkText){
        BrowserUtils.waitForPageToLoad(20);

        WebElement saved = driver.findElement(By.xpath("//a[text()='"+linkText+"']"));
        wait.until(ExpectedConditions.visibilityOf(saved));

        return saved;
    }


    /**
     * Increases hour until number that we put
     * @param number hour number. If hour<10 put without 0
     */
    public void setHour(String number){
       BrowserUtils.waitForPageToLoad(20);
       wait.until(ExpectedConditions.visibilityOf(increaseHour));
        for (int i = 0; i < 12 ; i++) {
            if(!hour.getAttribute("value").equals(number)){
                increaseHour.click();
            }

        }
        BrowserUtils.wait(2);
    }


    /**
     * Increases hour until number that we put
     * @param number minutes number
     */
    public void setMinutes(String number){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(increaseMinutes));
        for (int i = 0; i < 12 ; i++) {
            if(!minutes.getAttribute("value").equals(number)){
                increaseMinutes.click();
            }

        }
        BrowserUtils.wait(2);
    }

    /**
     * Sets am and pm
     */
    public void getPm_am(String am_or_pm){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(am_pm));
        if(!(am_pm.getText().equals(am_or_pm))){
            am_pm.click();
            BrowserUtils.wait(2);
        }
    }



    //selects file
    public void uploadFile(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(uploadFile)).click();
        wait.until(ExpectedConditions.elementToBeClickable(documentFrom)).click();
        wait.until(ExpectedConditions.elementToBeClickable(file)).click();
        selectDoc.click();
        BrowserUtils.wait(2);
    }

    public WebElement getSavedFile(){
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.wait(3);
        return savedFile;
    }

    /**
     * Chooses file from bitrix
     * @return
     */
    public WebElement getUploadedFile(){
        BrowserUtils.waitForPageToLoad(20);
        WebElement uploadedFile = driver.findElement(By.xpath("//span[text()='pom.xml']"));
        wait.until(ExpectedConditions.visibilityOf(uploadedFile));
        BrowserUtils.wait(2);
        return uploadedFile;
    }


    /**
     * D=Selects day of month
     * @param day selects day. If day<10 don't put 0
     */
    public void selectDay(String day) {
        BrowserUtils.waitForPageToLoad(20);
        WebElement days = driver.findElement(By.xpath("//a[text()='" + day + "']"));
        BrowserUtils.wait(2);
        days.click();
    }

    public WebElement getSavedQuote(){
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.wait(3);
        return savedQuote;
    }

    public void clickEndDate() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(endDate)).click();
    }

    public void clickStartDate(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(startDate)).click();
        BrowserUtils.wait(3);
    }

    /**
     * Gets start date as a whole
     * @return start date as a String
     */
    public String getStartDate(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(startDate));
        BrowserUtils.scrollTo(startDate);
        return startDate.getAttribute("value");
    }

    public void clickStartTime() {
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.scrollTo(timeFrom);
        wait.until(ExpectedConditions.visibilityOf(timeFrom)).click();

    }

    public String getStartTime(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(timeFrom));
        return timeFrom.getAttribute("value");
    }


    //selects reminder
    public WebElement selectReminder() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(setReminder));
        if (!setReminder.isSelected()) {
            setReminder.click();
        }
        BrowserUtils.wait(2);
        return setReminder;

    }

    /**
     * Selects month that we put
     * @param monthName month name to choose
     */
    public void selectMonth(String monthName){
        BrowserUtils.waitForPageToLoad(25);
        wait.until(ExpectedConditions.visibilityOf(month)).click();
        BrowserUtils.wait(2);
        WebElement monthSelect = driver.findElement(By.xpath("//span[text()='"+monthName+"']"));
        wait.until(ExpectedConditions.visibilityOf(monthSelect));
        monthSelect.click();
        BrowserUtils.wait(2);
    }


    /**
     * Selects year that we put
     * @param yearNumber year to select
     */
    public void selectYear(String yearNumber){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(year)).click();
        BrowserUtils.wait(2);
        WebElement yearSelect = driver.findElement(By.xpath("//span[text()='"+yearNumber+"']"));
        wait.until(ExpectedConditions.visibilityOf(yearSelect));
        yearSelect.click();
        BrowserUtils.wait(2);
    }

    public void clickSetTime(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(setTime)).click();
        BrowserUtils.wait(2);
    }

    public void clickEventLocation(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(eventLocation)).click();

    }

    /**
     * Selects group that we put
     * @param group group name inside members
     */
    public void chooseMembers(String group){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(members)).click();
        WebElement people = driver.findElement(By.xpath("//div[text()='"+group+"']"));
        wait.until(ExpectedConditions.visibilityOf(people)).click();
        BrowserUtils.wait(2);
    }

    public void clickSend(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(send)).click();
        BrowserUtils.wait(2);
    }


}
