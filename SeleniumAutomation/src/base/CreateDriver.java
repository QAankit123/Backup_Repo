package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateDriver {
	
	
	public ChromeDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		 driver.close();
		 
		 
		 
	}
	
		 

}
