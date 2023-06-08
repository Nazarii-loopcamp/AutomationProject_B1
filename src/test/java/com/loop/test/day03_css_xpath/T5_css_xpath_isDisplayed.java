package com.loop.test.day03_css_xpath;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_css_xpath_isDisplayed {
    /* go to http://the-internet.herokuapp.com/forgot_password
     *  locate 5 elements, forgot password, email, email input, retrieve password, powered selenium
     *  css
     * verify those elements are displayed
     */
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");

        WebElement forgetPassHead = driver.findElement(By.cssSelector("div[class='example']>h2"));
        if (forgetPassHead.isDisplayed()) {
            System.out.println("Forget password heading is displayed");
        } else {
            System.err.println("Forget password heading is NOT displayed");
        }

        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));
        if (email.isDisplayed()) {
            System.out.println("E-mail heading is displayed");
        } else {
            System.err.println("E-mail heading is NOT displayed");
        }

        WebElement emailBox = driver.findElement(By.cssSelector("input[type='text']"));
        if (emailBox.isDisplayed()) {
            System.out.println("E-mail input box is displayed");
        } else {
            System.err.println("E-mail input box is NOT displayed");
        }

    driver.quit();

    }
}
