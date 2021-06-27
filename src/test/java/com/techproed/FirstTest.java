package com.techproed;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FirstTest {



        @Test
        public void OpenBrowser()  {
            WebDriver driver;
            System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("disable-gpu");
            driver = new ChromeDriver(options);
            driver.get("https://www.google.com");
            System.out.println("Title of the page is: " + driver.getTitle());
            Assert.assertTrue("This page is unexpected!",driver.getTitle().equals("Google"));
            System.out.println("we have a successful path that will allow executions");


        }



}

