package com.loop.test.day06_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class T2_iframe extends TestBase {
    @Test
    public void iFrameTest(){
        driver.get("http://the-internet.herokuapp.com/iframe");
        // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        // driver.switchTo().frame(iframe); // switching to iframe
        // driver.switchTo().frame(0);
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Loop Academy");

        driver.switchTo().defaultContent(); // it will take us directly to main frame
        driver.switchTo().parentFrame(); // it will take us to parent frame

        WebElement headText = driver.findElement(By.xpath("//h3[contains(text(),'An iFrame containing')]"));
        String actual = headText.getText();
        String expected = "An iFrame containing the TinyMCE WYSIWYG Editor";
        assertEquals(expected, actual, "Actual does not match actual");
    }

    @Test
    public void amazonIframe(){
        driver.get("https://www.amazon.com/");
        List<WebElement> iframes = new ArrayList<>();
        iframes = driver.findElements(By.tagName("iframe"));
        System.out.println(iframes.size());
    }

}
