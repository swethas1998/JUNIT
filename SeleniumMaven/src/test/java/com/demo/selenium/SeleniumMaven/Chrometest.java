package com.demo.selenium.SeleniumMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Chrometest {
WebDriver driver;

Properties properties = new Properties();
FileInputStream fileinputstream;

    @Before
    public void setUp() throws IOException {
    fileinputstream = new FileInputStream("src/test/java/application.properties");
    properties.load(fileinputstream);
   
      System.setProperty(properties.getProperty("driverName"),properties.getProperty("driverPath"));
    driver=new ChromeDriver();
   
    }
   
    @Test
    public void launch() {
   
    driver.get(properties.getProperty("url"));
    driver.manage().window().maximize();
        //String title = driver.getTitle();
        //System.out.println(title);
        //Assert.assertEquals(title,"WordPress � Installation");
       
   
    String text = driver.findElement(By.xpath("//*[text()='Welcome']")).getText(); // Welcome
    System.out.println(text);
    //Assert.assertEquals(text,"Welcome");
    Assert.assertEquals(text, "Welcome");
   
    String head = driver.findElement(By.xpath("//*[text()='Information needed']")).getText(); // Information
    System.out.println(head);
    Assert.assertEquals(head,"Information needed");
           
        driver.findElement(By.id("weblog_title")).sendKeys("Mr");
       
        boolean value = driver.findElement(By.xpath("//label[text()='Site Title']")).isDisplayed();
       Assert.assertEquals(true,driver.findElement(By.xpath("//label[text()='Site Title']")).isDisplayed());
        driver.findElement(By.xpath("//label[text()='Site Title']")).isDisplayed();
        System.out.println(value);
       
       driver.findElement(By.id("user_login")).sendKeys("Selenuim");
        String uname = driver.findElement(By.xpath("//label[text()='Username']")).getText();
        System.out.println(uname);
        Assert.assertEquals(uname,"Username");
       
        driver.findElement(By.id("pass1")).clear();
        driver.findElement(By.id("pass1")).sendKeys("1234");
        String pass = driver.findElement(By.xpath("//label[@for='pass1']")).getText();
        System.out.println(pass);
        Assert.assertEquals(pass,"Password");
       
        driver.findElement(By.name("pw_weak")).click();
       
        driver.findElement(By.id("admin_email")).sendKeys("abc@gmail.com");
        String email = driver.findElement(By.xpath("//label[text()='Your Email']")).getText();
        System.out.println(email);
        Assert.assertEquals(email,"Your Email");
       
       
        driver.findElement(By.id("blog_public")).click();
       
        driver.findElement(By.id("submit")).click();
       
        }

    @After
    public void close() {
    driver.close();
   
    }

   
    }


