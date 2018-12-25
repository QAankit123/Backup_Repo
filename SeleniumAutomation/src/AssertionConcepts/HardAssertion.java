package AssertionConcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void Verifytitle() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		Boolean result =false;
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String Actual_title= driver.getTitle();
	    
	    System.out.println(Actual_title);
	    
	    String Expected_title="Facebook – log in or sign utp";
	    
	    Assert.assertEquals(Actual_title, Expected_title );
	
	    if (Actual_title.equalsIgnoreCase(Expected_title))
	    {
	    	result=true;
	    	
	    }
	      System.out.println(result);
	
	}
}
