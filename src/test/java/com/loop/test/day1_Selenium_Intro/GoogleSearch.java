package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        /**
         * Navigate to Google search
         * Maximize the page
         * Get title of the page
         * Get url of the page
         * Validate the title, expected title is "Google"
         * Validate the url of the page,
         */

        // Set up the driver
        WebDriverManager.chromedriver().setup();

        // Create driver object
        WebDriver driver = new ChromeDriver();

        // Navigate to Google page
        driver.get("https://www.google.com");

        // Maximize the window
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String expectedUrl = "https://www.google.com/";

        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", matched expected title: " + expectedTitle + ", = TEST PASS");
        } else {
            System.out.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ", = TEST FAIL");
        }

        String actualUrl = driver.getCurrentUrl();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual URL: " + actualUrl + ", matched expected URL: " + expectedUrl + ", = TEST PASS");
        } else {
            System.err.println("Actual URL: " + actualUrl + ", DOES NOT match expected URL: " + expectedUrl + ", = TEST FAIL");
        }



        // Quit the browser
        driver.quit();



    }

}
