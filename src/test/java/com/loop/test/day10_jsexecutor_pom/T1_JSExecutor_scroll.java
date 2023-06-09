package com.loop.test.day10_jsexecutor_pom;

import com.loop.test.utilities.Driver;
import com.loop.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class T1_JSExecutor_scroll{
     /*
    1. Go to https://www.etsy.com
    2. Scroll down
    3. Generate random email and enter into subscribe box
    4. Click on Subscribe
    5. Verify "Great! We've sent you an email to confirm your subscription." is displayed
     */

    @Test
    public void etsy_scroll_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));
        WebElement emailBox = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        // how to scroll to element
        // #1 use actions move to element
        Actions actions = new Actions(Driver.getDriver());
        // actions.moveToElement(emailBox).perform();
        // actions.scrollToElement(emailBox).perform();

        // #2 just use Key press
        //actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        // #3 move horizontally or vertically
        // js.executeScript("window.scrollBy(0, 5000)");

        // #4
        js.executeScript("arguments[0].scrollIntoView(true)", emailBox);
        js.executeScript("arguments[0].click", emailBox);

    }
}
