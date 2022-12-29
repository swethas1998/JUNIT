package com.demo.selenium.SeleniumMaven;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletitle {
	WebDriver driver;
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
	@Test 
	public void launch()
	{
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");	
	driver.manage().window().maximize();
	driver.findElement(By.id("weblog_title")).sendKeys("Mrs");
	
	driver.findElement(By.id("user_login")).sendKeys("Automation");
	driver.findElement(By.id("pass1")).clear();
	
	driver.findElement(By.id("pass1")).sendKeys("Abc@123");
	driver.findElement(By.name("pw_weak")).click();
	
	driver.findElement(By.id("admin_email")).sendKeys("Automation123@gamil.com");
	driver.findElement(By.name("blog_public")).click();
	
	driver.findElement(By.id("submit")).click();
	
	
	
	}

}
