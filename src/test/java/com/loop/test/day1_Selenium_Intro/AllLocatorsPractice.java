package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // Create driver object
        WebDriver driver = new ChromeDriver();

        // Navigate to Google page
        driver.get("https://demoqa.com/automation-practice-form/");

        // Maximize the window
        driver.manage().window().maximize();

        /**
         * Locate by attribute ID
         * Firstmname
         */

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Nazarii");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Duvanov");
        WebElement identifyGender = driver.findElement(By.linkText("Gender"));
        identifyGender.click();

    }
}
