package JSExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExecutorOnFacebook {
    
    public ChromeDriver driver;
    @Test
	public void JSEtest() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
	     driver= new ChromeDriver();
		
	    driver.get("https://www.google.com/?safe=active&ssui=on");
	    
	    //WebElement Email = driver.findElementByXPath("//input[@type='email']");
	    
	    //JavascriptExecutor js = (JavascriptExecutor)driver;
	
	    //((JavascriptExecutor)driver).executeAsyncScript("Argument[0].send().value='9717189836'",Email);
	
	    ((JavascriptExecutor)driver).executeScript("document.getElementById('lst-ib').values='9717189836'");
	    
	System.out.println("done");
	
	
	
	
	
	}
	
	
	
}
