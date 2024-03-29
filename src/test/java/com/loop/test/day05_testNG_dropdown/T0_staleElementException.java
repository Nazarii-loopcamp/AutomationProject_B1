package com.loop.test.day05_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T0_staleElementException {
    public static void main(String[] args) {

        //1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to http://the-internet.herokuapp.com/add_remove_elements/
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // 3. Click to “Add Element” button
        WebElement addButton = driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        addButton.click();

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));

        if (deleteButton.isDisplayed()) {
            System.out.println("Element \"Delete button\" is displayed => PASS");
        } else {
            System.err.println("Element \"Delete button\" is NOT displayed => FAIL");
        }

        // 5. Click to “Delete” button.
        deleteButton.click();

//        // 6. Verify “Delete” button is NOT displayed after clicking.
//        if (deleteButton.isDisplayed()) {
//            System.out.println("Elememt \"Delete button\" is NOT displayed => PASS");
//        } else {
//            System.err.println("Element \"Delete button\" is displayed => FAIL");
//        }

        try {
            deleteButton.isDisplayed();
        } catch (StaleElementReferenceException e) {
            System.out.println("Catching the exception");
        }
    }
}
