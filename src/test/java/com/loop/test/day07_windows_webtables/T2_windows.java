package com.loop.test.day07_windows_webtables;

import com.loop.test.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class T2_windows extends TestBase {

     /*

    1. Go to : https://www.amazon.com
    2. Copy paste the lines from below into your class
    3. Create a logic to switch to the tab where Etsy.com is open
    4. Assert: Title contains “Etsy”
    Lines to be pasted:
    ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    These lines will simply open new tabs using something called JavascriptExecutor
    and get those pages. We will learn JavascriptExecutor later as well.

     */

    @Test
    public void test_window_handles(){
        driver.get("https://amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

//        Set<String> windowsHandles = driver.getWindowHandles();
//        for (String each : windowsHandles) {
//            System.out.println(each);
//            driver.switchTo().window(each);
//            if (driver.getCurrentUrl().toLowerCase().contains("etsy")){
//                break;
//            }
//        }
//
//        assertTrue(driver.getTitle().toLowerCase().contains("etsy"));

       // BrowserUtils.switchWindowAndValidate(driver, "https://facebook.com/", "Facebook");
        BrowserUtils.switchToWindow(driver, "Etsy");
    }

}
