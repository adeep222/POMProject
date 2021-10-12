package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountpage {
	WebDriver driver;
	public myAccountpage(WebDriver driver)
	{
   this.driver=driver;
   PageFactory.initElements(driver, this);
}
	@FindBy(xpath ="//h1[contains(text(),'My account')]")
	private WebElement pageheading;
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement logo;
	@FindBy(id="search_query_top")
	private WebElement search;
	@FindBy(xpath="//b[contains(text(),'Cart')]")
	private WebElement cart;
	
	
	public void pageheading()
	{
try
{
	pageheading.isDisplayed();
	System.out.println("The page heading exists");
	String headingtext=pageheading.getText();
	System.out.println("The page heading text is : "+headingtext);
	}
catch(Exception e)
{
	System.out.println("The element doesnot exist");
}
}
	public void logo()
	{
		try
		{
			logo.isDisplayed();
			System.out.println("The logo is displayed in tha page");
		}
		catch(Exception e)
		{
			System.out.println("The logo does not exist");
		}

	}
	public void searchtextbox()
	{
		try
		{
			search.isDisplayed();
			System.out.println("The Search textbox exists in the page");
		}
		catch(Exception e)
		{
			System.out.println("The Search textbox does not exist");
		}
	}
		
		public void cart()
		{
			try
			{
			cart.isDisplayed();
			System.out.println("The Cart option is displayed");
		}
			catch (Exception e) 
			{
System.out.println("The cart option does not exist");
}
		}
	

public boolean pageheadingtextexists()
{
	return pageheading.getText().toString().contains("MY ACCOUNT");
}
}
