package com.automation.pages.ActivitySPage;

import com.automation.pages.AbstractBasePage;
import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage extends AbstractBasePage {


        public ActivityStreamPage() {
                PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
        public WebElement sendMessageInput;
        @FindBy(css = "span[title='Link']")
        public WebElement linkIcon;
        @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
        public WebElement linkText;
        @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
        public WebElement linkUrl;
        @FindBy(css = "[value='Save']")
        public WebElement linkSaveBtn;
        @FindBy(id = "blog-submit-button-save")
        public WebElement sendBtn;


        @FindBy(xpath = "//span[@title='Quote text']")

        public WebElement quoteIcon;
        @FindBy(className = "bx-editor-iframe")
        public WebElement frame;
        @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
        public WebElement quoteInputText;

}

