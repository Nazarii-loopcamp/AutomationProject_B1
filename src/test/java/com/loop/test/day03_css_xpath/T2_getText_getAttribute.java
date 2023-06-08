package com.loop.test.day03_css_xpath;

/*
 * go to url: https://demoqa.com/automation-practice-form
 * verify header text expected
 * verify placeholder attribute value is expected
 */

import com.loop.test.utilities.DemoQaConstants;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        // Go to the URL
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        // WebElement headerForForm = driver.findElement(By.tagName("h5"));
        String actualHeaderForForm = driver.findElement(By.tagName("h5")).getText();

        if (actualHeaderForForm.equals(DemoQaConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header for form: \"" + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual header for form: \"" + actualHeaderForForm + "\" Test PASSED");
        } else {
            System.err.println("Expected header for form: \"" + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual header for form: \"" + actualHeaderForForm + "\" Test FAILED");
        }

        // Get placeholder
        WebElement firstNamePlaceHolder = driver.findElement(By.id("firstName"));
        String actualPlaceHolder = firstNamePlaceHolder.getAttribute("placeholder");

        if (actualPlaceHolder.equalsIgnoreCase(DemoQaConstants.EXPECTED_PLACE_HOLDER_FIRST_NAME)){
            System.out.println("Expected placeholder: \"" + DemoQaConstants.EXPECTED_PLACE_HOLDER_FIRST_NAME + "\", matches actual placeholder: \"" + actualPlaceHolder + "\" Test PASSED");
        } else {
            System.err.println("Expected placeholder: \"" + DemoQaConstants.EXPECTED_PLACE_HOLDER_FIRST_NAME + "\", DOES NOT match actual placeholder: \"" + actualPlaceHolder + "\" Test FAILED");
        }

        driver.quit();
    }

}
