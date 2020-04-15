package com.automation.tests.us_6_tests;

import com.automation.pages.appreciation.Appreciation;
import com.automation.tests.AbstractBaseTest;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC7_VisualEditor_Test extends AbstractBaseTest {

    @Test
    public void visualEditor() {
        extentTest = extentReports.createTest("Verify Editor Text Bar");

        Appreciation appreciation = new Appreciation();
        appreciation.navigateToVisualEditor();
        BrowserUtils.wait(1);
        WebElement  editorTextBar =driver.findElement(By.id("bx-html-editor-tlbr-idPostFormLHE_blogPostForm"));
        Assert.assertTrue(editorTextBar.isDisplayed());
        extentTest.pass("Editor Text Bar Displayed");
    }
}







