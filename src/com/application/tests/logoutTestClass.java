package com.application.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.application.pages.logoutpageclass;

public class logoutTestClass extends BaseClass{
@Test
public void logout()
{
	logoutpageclass ll=new logoutpageclass(driver);
	ll.logout();
}

}
