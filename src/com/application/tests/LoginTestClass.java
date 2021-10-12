package com.application.tests;

import org.testng.annotations.Test;

import com.application.pages.loginPageclass;

public class LoginTestClass extends BaseClass{
	@Test
	public void loginmethod()
	{
		loginPageclass pp=new loginPageclass(driver);
		pp.login("jerry22288@gmail.com", "Password$123");
	}

}
