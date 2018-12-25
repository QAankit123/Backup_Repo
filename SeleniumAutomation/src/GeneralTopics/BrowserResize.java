package GeneralTopics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserResize {    

	
	@Test
	public void Custamization() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	
		ChromeDriver driver= new ChromeDriver();
	
	   Dimension d = new Dimension(480,620);
	
	   driver.manage().window().setSize(d);
	   
	   driver.get("https://www.facebook.com");

	
	}
}
