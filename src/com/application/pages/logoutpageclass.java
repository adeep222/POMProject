package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class logoutpageclass {
	WebDriver driver;
	public logoutpageclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@class='logout']")
private WebElement signout;
public void logout()
{
	signout.click();
}
}
