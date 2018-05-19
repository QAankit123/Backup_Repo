package testcases;

import org.testng.annotations.Test;

import base.CreateDriver;

public class TC_002 extends CreateDriver{

	@Test
	public void tc_002()
	{
		driver.findElementById("email").sendKeys("hello");
	}
	
}
