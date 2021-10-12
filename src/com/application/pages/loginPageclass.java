package com.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageclass {
	WebDriver driver;
	public loginPageclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
private WebElement email;
@FindBy(id="passwd")
private WebElement pswd;
@FindBy(id="SubmitLogin")
private WebElement Submit;
public void login(String un,String pwd) 
{
	driver.findElement(By.xpath("//a[@class='logout']")).click();
	email.sendKeys(un);
	pswd.sendKeys(pwd);
	Submit.click();
}
}
