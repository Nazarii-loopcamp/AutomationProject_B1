package com.loop.test.day03_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_forget_password {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");

        WebElement forgotPassword = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        forgotPassword.click();

        WebElement forgetPassHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));

        if (forgetPassHeading.isDisplayed()) {
            System.out.println("Login was successful");
        } else {
            System.err.println("Login failed");
        }


    }
}
