package AssertionConcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		Boolean result =false;
		SoftAssert s = new SoftAssert();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String Actual_title= driver.getTitle();
	    
	    System.out.println(Actual_title);
	    
	    String Expected_title="1Google"; 
	    
	    s.assertEquals(Actual_title, Expected_title, "titles are not same please check again" );
	    s.assertTrue(false);
	    
	
	    if (Actual_title.equalsIgnoreCase(Expected_title))
	    {
	    	result=true; 
	    	
	    }
	      System.out.println(result);
	  s.assertAll();
	}	

	}


