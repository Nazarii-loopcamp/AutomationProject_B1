package com.loop.test.day04_xpath_findElements;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_testNG_Intro{
    @Test
    public void test1 () {
        System.out.println("TestNG is running");
        String actual = "Feyruz";
        String expected = "Nadir";

        Assert.assertEquals(actual, expected);
    }
}
