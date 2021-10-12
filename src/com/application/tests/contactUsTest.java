package com.application.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.application.pages.contaactUspage;

public class contactUsTest extends BaseClass {
	
	
	@Test
	public void contactusmethod() throws InterruptedException
	{
		
		contaactUspage c=new contaactUspage(driver);
		c.contactus();
		Thread.sleep(4000);
	
	}
	
	@Test
	public void pageheading()
	{
		
		contaactUspage c=new contaactUspage(driver);
		c.contactus();
		c.pageheading();
	}
	
	@Test
	public void pagetitle()
	{
		
		contaactUspage c=new contaactUspage(driver);
		c.contactus();
		c.pagetitlematch();
		
	}
	@Test
	public void subheadingfield()
	{
		contaactUspage c=new contaactUspage(driver);
		//c.contactus();
		c.Subjectheading();
	}
	
	@Test
	public void Email()
	{
		
		contaactUspage c=new contaactUspage(driver);
		//c.contactus();
		c.Emailaddress();
		
	}
	@Test
	public void Orderreferncefield() throws InterruptedException
	{
		
		contaactUspage c=new contaactUspage(driver);
		c.contactus();
		Thread.sleep(3000);
		c.Orderreference();
	}
	@Test
	public void fileuploadfield() throws InterruptedException
	{
		contaactUspage c=new contaactUspage(driver);
		c.contactus();
		Thread.sleep(3000);
		c.Attachfile();
		
	}
	
	@Test
	public void sendbutton()
	{
		contaactUspage c=new contaactUspage(driver);
		//c.contactus();
		c.send();
	}
	@Test
	public void messagetextbox() throws InterruptedException
	{
		contaactUspage c=new contaactUspage(driver);
		c.contactus();
		Thread.sleep(3000);
		c.message();
	}
	
	}


