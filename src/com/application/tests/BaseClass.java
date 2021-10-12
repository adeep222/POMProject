package com.application.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	String x="adeep";
	@BeforeClass
	public void launch()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Gekodriver\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("jerry22288@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Password$123");
		driver.findElement(By.id("SubmitLogin")).click();
	}
	/*@BeforeMethod
	public void login()
	{
		
	}*/
	/*@AfterMethod
	public void logout() throws InterruptedException
	{
		
		
	}*/
	@AfterClass
	public void quit() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	

}
