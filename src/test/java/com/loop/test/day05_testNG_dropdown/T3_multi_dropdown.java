package com.loop.test.day05_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class T3_multi_dropdown {

    /*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
     */
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void multiSelect() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        // If this dropdown allows multiple selection
        Assert.assertTrue(dropdown.isMultiple());

        // Select by index
//        dropdown.selectByIndex(0);
//        Thread.sleep(3000);
//        dropdown.selectByValue("saab");
//        Thread.sleep(3000);
//        dropdown.selectByVisibleText("Opel");
//        Thread.sleep(3000);
//        dropdown.selectByIndex(3);

        List<WebElement> options = new ArrayList<>();
        options = dropdown.getOptions();
        options.forEach(option-> {
                    option.click();
                    System.out.println("Option = " + option.getText());
                });

        for (WebElement option : options) {
            option.click();
            System.out.println("Option = "+option.getText());
        }

        // Deselect all method
        dropdown.deselectAll();


    }
}
