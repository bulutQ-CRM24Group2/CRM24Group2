package com.automation.pages;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class US_8_Page extends LoginPage {

    @FindBy(css = "#feed-add-post-form-link-more")
    protected WebElement middleMore;

    public WebElement getMiddleMore() {
        return middleMore;

    }


    public void clickOnSubTabs(String subTabName){
        BrowserUtils.wait(3);
        String subTabXpath = "//span[@class='menu-popup-item-text' and contains (text(),'"+subTabName+"')]";
        WebElement subTabElement = Driver.getDriver().findElement(By.xpath(subTabXpath));
        subTabElement.click();
    }


    @FindBy(xpath = "//span[@class='menu-popup-item-text'])[7]")
    protected WebElement g_Request;



    @FindBy(xpath="//input[@name='NAME']")
    protected WebElement title;

   public WebElement getTitle(){
      BrowserUtils.wait(3);
       return title;
     //  title.sendKeys("KT Session", Keys.ENTER);
      // BrowserUtils.wait(3);
   }

    @FindBy(xpath="//textarea[contains(@name,'PREVIEW_TEXT')]")
    private WebElement desc_box;

    public void get_desc_box(){

       desc_box.sendKeys("I want to learn about new policy");
        BrowserUtils.wait(3);
    }
    @FindBy(name="PROPERTY_84")
    private WebElement Priority;

    public void get_priority() {

        Select select = new Select(Priority);

        select.selectByVisibleText("Medium");
        BrowserUtils.wait(1);
    }
    @FindBy(xpath="//a[contains(@id,'single-user-choiceSingle')]")
        private WebElement select;

    public void click_select() {
        select.click();
    }


@FindBy(xpath="(//div[@class='finder-box-item-text'])[1]")
private WebElement email;
    public void  click_email() {

        email.click();
    }
@FindBy(id="blog-submit-button-save")

    private WebElement send_button;

    public void click_send(){


        send_button.click();

    }

    }

