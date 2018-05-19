package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CreateDriver;
import pages.LoginPage;

public class TC_001 extends CreateDriver{
	
	@Test
	public void tcase1() throws InterruptedException
	{
	    LoginPage login = new LoginPage(driver);
	    login.enterUsername("hello");
	    login.enterPassword("abcd");
	    login.clickSignin();
	    
	   System.out.println("only for testing.....");
	}
	
	
}
