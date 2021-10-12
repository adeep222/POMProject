package com.application.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class contaactUspage{
	
	WebDriver driver;
	public contaactUspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='contact-link']//a[contains(text(),'Contact us')]")
	private WebElement contactus;
	@FindBy(xpath="//h1[@class='page-heading bottom-indent']")
	private WebElement pageHeading; 
	//@FindBy(xpath="//select[@id='id_contact']")
	@FindBy(css ="#id_contact")
	private WebElement SubjectHeading;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email;
	@FindBy(name="id_order")
	private WebElement orderReference;
	@FindBy(xpath="//input[@id='fileUpload']")
	private WebElement fileUpload;
	@FindBy(xpath="//span[contains(text(),'Send')]")
	private WebElement send;
	@FindBy(id="message")
	private WebElement messagetextbox;
	@Test
	public void contactus()
	{
		contactus.click();
	}
@Test
public void pageheading()
{
	Boolean PageHeading=pageHeading.isDisplayed();
	Assert.assertTrue(PageHeading);
}
@Test
public void pagetitlematch()
{
	String actualtext=pageHeading.getText();
	String expectedtext="CUSTOMER SERVICE - CONTACT US";
	Assert.assertEquals(actualtext, expectedtext);
}

@Test
public void Subjectheading()
{
	Boolean subheading=SubjectHeading.isDisplayed();
	Assert.assertTrue(subheading);
	
}
@Test
public void Emailaddress()
{
	Boolean email=Email.isDisplayed();
	Assert.assertTrue(email);
}

@Test
public void Orderreference()
{
	Boolean Orderref=orderReference.isDisplayed();
	Assert.assertTrue(Orderref);
}
@Test
public void Attachfile()
{
	Boolean fileupload=fileUpload.isDisplayed();
	Assert.assertTrue(fileupload);
}
@Test
public void send()
{
	Boolean sendbutt=send.isDisplayed();
	Assert.assertTrue(sendbutt);
	
	
}
@Test
public void message()
{
	Boolean msg=messagetextbox.isDisplayed();
	Assert.assertTrue(msg);
}
@Test
public void sendmessage()
{
}
@Test
public void successmessage()
{
}

}

