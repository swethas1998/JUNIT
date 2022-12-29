package com.demo.selenium.SeleniumMaven;

	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Orange1 {
	static WebDriver driver;

	@Test
	    public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");

	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	   
	   
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	}

	


