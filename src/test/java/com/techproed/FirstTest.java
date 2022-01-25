package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
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
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("disable-gpu");
            driver = new ChromeDriver(options);
            driver.get("https://medunna.com");
            System.out.println("Title of the page is: " + driver.getTitle());
            //Assert.assertTrue("This page is unexpected!",driver.getTitle().equals("Google"));
            System.out.println("we have a successful path that will allow executions");
            System.out.println("Medunna project was nice with you");

        }



}

