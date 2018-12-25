package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAgainCrossBrowser {
	
    WebDriver driver  ;
   
	
	@Test
	@Parameters("browser")
	public void MultipleBrowser(String browser_name) {
	
		if(browser_name.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		else if(browser_name.equalsIgnoreCase("chrome"))
		{
			
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		}
		
		driver.get("https://www.facebook.com");
		
		System.out.println("multiple browser");
		
	}
	
	
	
	
}
