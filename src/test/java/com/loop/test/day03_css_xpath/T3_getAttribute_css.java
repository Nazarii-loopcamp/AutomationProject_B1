package com.loop.test.day03_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {

    public static void main(String[] args) {
        // Go to URL
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");

        // Identify logo with css
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuport = logo.getAttribute("alt");

        if (DocuportConstants.LOGO_DOCUPORT.equalsIgnoreCase(docuport)) {
            System.out.println("Expected logo text: " + DocuportConstants.LOGO_DOCUPORT + ", matches actual logo text: " + docuport);
        } else {
            System.err.println("Expected logo text: " + DocuportConstants.LOGO_DOCUPORT + ", DOES NOT match actual logo text: " + docuport);
        }

        WebElement userName = driver.findElement(By.cssSelector("input[id='input-14']"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        WebElement loginButton = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
        loginButton.click();
        WebElement homeButton = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-home theme--light']"));

        if (homeButton.isDisplayed()) {
            System.out.println("Login was successful");
        } else {
            System.err.println("Login failed");
        }



        driver.quit();
    }
}
