package WaitKnowledge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Wait1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =  new ChromeDriver();
		
	    
	    
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    
	    
	    
	    
	    driver.get("https://www.facebook.com");
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
