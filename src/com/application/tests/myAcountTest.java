package com.application.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.application.pages.myAccountpage;

public class myAcountTest extends BaseClass {
	@Test
	public void myAccount()
	{
	myAccountpage pp=new myAccountpage(driver);
	
	pp.pageheading();
	pp.logo();
	pp.searchtextbox();
	pp.cart();
	Boolean value=pp.pageheadingtextexists();
	Assert.assertTrue(value);
	System.out.println("The boolean value is : " +value);
	}
}
