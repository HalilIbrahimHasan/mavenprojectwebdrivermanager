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
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;



public class FirstTest {


        
        
     @Test
    public void get01(){

        //1.set the url
        String url = "https://restful-booker.herokuapp.com/booking/3";

        //2.Set the expected data


        //3.Send the request and get the response
        Response response  = given().when().get(url);

        response.prettyPrint();



        //Do assertions / Do validations
        //we are making "Hard Assertion"
        response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");






    }

        
        
        
        
        
        

        @Test
        public void OpenBrowser()  {
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            options.addArguments("disable-gpu");
            driver = new ChromeDriver(options);
            driver.get("https://www.google.com");
            System.out.println("Title of the page is: " + driver.getTitle());
            Assert.assertTrue("This page is unexpected!",driver.getTitle().equals("Google"));
            System.out.println("we have a successful path that will allow executions");
            System.out.println("Medunna project was nice with you");

        }



}

