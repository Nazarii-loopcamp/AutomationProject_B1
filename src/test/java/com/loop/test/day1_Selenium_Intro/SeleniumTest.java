package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // setting up the web driver
        WebDriverManager.chromedriver().setup();

        // create an instance of driver
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        //driver.get("https://www.etsy.com/");

        //maximize
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // driver.manage().window().fullscreen();

        // navigate to
        driver.navigate().to("https://www.etsy.com/");
        Thread.sleep(3000);

        // let's slow things a bit in order to be able to see what is going on
        Thread.sleep(3000);

        // navigate.back takes us to previous
        driver.navigate().back();

        // navigate forward
        driver.navigate().forward();

        // navigate refresh
        driver.navigate().refresh();

    }

}
