package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossTestingBrowser {

	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void Verifytitle(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")){
			
			
			driver = new FirefoxDriver();
		}

		else if(browserName.equalsIgnoreCase("chrome")){
			
			driver=new ChromeDriver();
			
			System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
			
		       driver= new ChromeDriver();
		       driver.get("https://www.facebook.com");
			
		}
		
		else if (browserName.equalsIgnoreCase("ie")){
			
			driver = new InternetExplorerDriver();
		}
	}
	
	
	
	
}
