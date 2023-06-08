package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        // Set up the driver
        WebDriverManager.chromedriver().setup();

        // Create driver object
        WebDriver driver = new ChromeDriver();

        // Navigate to Google page
        driver.get("https://www.google.com");

        // Maximize the window
        driver.manage().window().maximize();

        // Locate the element
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        // aboutLink.click();
        // Create a String what you want to search
        String textToSearch = "Loop Academy";
        // searchBoxWithID.sendKeys(textToSearch + Keys.ENTER);
        searchBoxWithID.sendKeys(textToSearch);
        searchBoxWithID.clear();

    }

}
