package com.loop.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class DocuportConstants {

    public static final String USERNAME_CLIENT = "b1g1_client@gmail.com";
    public static final String PASSWORD_CLIENT = "Group1";

    public static final String ERROR_MESSAGE_FOR_EMPTY_PASSWORD = "Please enter your password";

    public static final String LOGO_DOCUPORT = "Docuport";

    public static final String RESET_PASSWORD_URL = "reset-password";

    public static final String RESET_PASSWORD_MESSAGE = "Enter the email address associated with your account";

    public static final String EMAIL_FOR_RESET_PASSWORD = "forgotpasswordg1@gmail.com";

    public static final String USERNAME_ADVISOR = "b1g1_advisor@gmail.com";

    public static final String PASSWORD_ADVISOR = "Group1";

    public static final String ADRESS_DOCUPORT = "https://beta.docuport.app/";

    public static final String PASSWORD = "Group1";

    public static final String USERNAME_SUPERVISOR = "b1g1_supervisor@gmail.com";

    public static final String USERNAME_EMPLOYEE = "b1g1_employee@gmail.com";

    public static final String ADVISOR = "advisor";
    public static final String CLIENT = "client";
    public static final String SUPERVISOR = "supervisor";
    public static final String EMPLOYEE = "employee";

    public static void loginDocuport(String role, WebDriver driver) {
        driver.get(DocuportConstants.ADRESS_DOCUPORT);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement userName = driver.findElement(By.cssSelector("input[type='text']"));

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));

        WebElement loginButton = driver.findElement(By.cssSelector("span[class='v-btn__content']"));

        switch (role) {
            case "client":
                userName.sendKeys(DocuportConstants.USERNAME_CLIENT);
                password.sendKeys(DocuportConstants.PASSWORD);
                loginButton.click();
                break;
            case "advisor":
                userName.sendKeys(DocuportConstants.USERNAME_ADVISOR);
                password.sendKeys(DocuportConstants.PASSWORD);
                loginButton.click();
                break;
            case "supervisor":
                userName.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
                password.sendKeys(DocuportConstants.PASSWORD);
                loginButton.click();
                break;
            case "employee":
                userName.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
                password.sendKeys(DocuportConstants.PASSWORD);
                loginButton.click();
                break;
        }
    }
}
