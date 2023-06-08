package com.loop.test.day04_xpath_findElements;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

/*
        1- Open a Chrome browser
        2- Go to: https://www.nba.com
        3- Locate all the links in the page.
        4- Print out the number of the links on the page.
        5- Print out the texts of the links.
        6- Print out the HREF attribute values of the links

         */

public class T1_findElements {
    public static void main(String[] args) {

        // 1 - Open a Chrome browser
        // 2 - Go to: https://www.nba.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.nba.com");
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Old version
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List < WebElement> nbaLinks = driver.findElements(By.tagName("a"));
        System.out.println(nbaLinks.size());

        List<WebElement> nbaLinksXpath = driver.findElements(By.xpath("//a"));
        System.out.println("nbaLinksXpath = " + nbaLinksXpath);

        for (WebElement nbaLink : nbaLinks) {
            if(!nbaLink.getText().equals("")) {
                System.out.println("NBA Link: " + nbaLink.getText());
                System.out.println("NBA Link: " + nbaLink.getAttribute("href"));
            }
        }

        for (int i = 0; i < nbaLinks.size(); i++) {
            if (!nbaLinks.get(i).getText().equals("")) {
                System.out.println("NBA Link: " + nbaLinks.get(i));
                System.out.println("NBA Link: " + nbaLinks.get(i).getAttribute("href"));
            }
        }

        driver.quit();
    }
}
