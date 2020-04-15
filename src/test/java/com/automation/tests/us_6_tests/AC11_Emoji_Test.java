package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;

public class AC11_Emoji_Test extends AbstractBaseTest {
    @Test
    public void emojis() {
        extentTest = extentReports.createTest("Verify Emojis");

        Appreciation appreciation = new Appreciation();
        appreciation.navigateToAppreciation();
        BrowserUtils.wait(1);
        appreciation.emojiTst();
        List<WebElement> emojis = driver.findElements(By.cssSelector("img[class^='bxhtmled']"));
        for (WebElement eachemoji : emojis) {
        Assert.assertTrue(eachemoji.isDisplayed());

        }
    }
}