package com.loop.test.day05_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T000_testNG_with_selenium {

    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDowm() {
        driver.close();
    }

 @Test
 public void googleTitle(){

     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.google.com/");

     expected = "Google";
     actual = driver.getTitle();

     Assert.assertEquals(actual, expected, "Go to break");
 }
    @Test
    public void docuportTitle() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://beta.docuport.app/");

        expected = "Docuport";
        actual = driver.getTitle();

        Assert.assertTrue(actual.contains(expected));

    }
}
