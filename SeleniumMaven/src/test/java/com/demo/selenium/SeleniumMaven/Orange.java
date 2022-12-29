package com.demo.selenium.SeleniumMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Orange {
static WebDriver driver;

private TakesScreenshot screenshot;
private File file;
private static int increement=0;
    @BeforeClass
    public static void setUp() {
     System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");

    }
   
   
    @Before
    public void launch() throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    Thread.sleep(5000);
    }
   
   
    @Test
    public void execute() throws InterruptedException {
    boolean titleImage = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
    Assert.assertEquals(true, titleImage);
    System.out.println(titleImage);
   
    String headerName = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
    Assert.assertEquals("Login", headerName);
    System.out.println(headerName);
   
    String usernameHeader = driver.findElement(By.xpath("//label[text()='Username']")).getText();
    Assert.assertEquals("Username", usernameHeader);
    System.out.println(usernameHeader);
   
    String passwordHeader = driver.findElement(By.xpath("//label[text()='Password']")).getText();
    Assert.assertEquals("Password", passwordHeader);
    System.out.println(passwordHeader);
   
    String forgetHeader = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).getText();
    Assert.assertEquals("Forgot your password?", forgetHeader);
    System.out.println(forgetHeader);
   
    boolean img = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img")).isDisplayed();
    Assert.assertEquals(true, img);
    System.out.println(img);
   
        boolean linkedHeader =driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[1]")).isDisplayed();
        Assert.assertEquals(true, linkedHeader);
        System.out.print(linkedHeader);
       
        boolean fbHeader =driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[2]")).isDisplayed();
        Assert.assertEquals(true, fbHeader);
        System.out.print(fbHeader);
       
        boolean twitterHeader =driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[3]")).isDisplayed();
        Assert.assertEquals(true, twitterHeader);
        System.out.print(twitterHeader);
       
        boolean utubeHeader =driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[4]")).isDisplayed();
        Assert.assertEquals(true, utubeHeader);
        System.out.print(utubeHeader);
   
    boolean orangeHeader = driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//p[1]")).isDisplayed();
    Assert.assertEquals(true, orangeHeader);
    System.out.println(orangeHeader);
   
    boolean orangeHeader2 = driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//p[2]")).isDisplayed();
    Assert.assertEquals(true, orangeHeader2);
    System.out.println(orangeHeader2);
   
    
    }
    
  @Test
  public void passingValue() throws InterruptedException {
	
  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
   @After
   public void close() throws IOException {
//    driver.close();
	  screenshot = ((TakesScreenshot)driver);
	  file = screenshot.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File("C:\\Users\\91965\\OneDrive\\Desktop\\TakesScreenshot\\screenshot"+ ++increement+".png")); 
	  
    }
    
   
    @AfterClass
  public static void quit() {
    driver.quit();
    }

}
