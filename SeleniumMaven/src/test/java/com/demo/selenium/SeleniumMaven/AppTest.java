package com.demo.selenium.SeleniumMaven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test  
    public void dispay() {
    System.out.println("print from test class");
    
    System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    
    String url = driver.getCurrentUrl();
    System.out.println(driver.getCurrentUrl());// URL
    System.out.println(driver.getTitle());//Title

driver.findElement(By.name ("j_idt106:j_idt122")).sendKeys("amazon");
    }
}

