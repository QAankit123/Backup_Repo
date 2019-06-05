package AssertionConcepts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BooleanAssert {

	      @Test
          private void VerfyElement() {
	        SoftAssert s = new SoftAssert();
	    	System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	  		Boolean result =false;
	  		
	  		ChromeDriver driver= new ChromeDriver();
	  		
	  		driver.get("https://www.google.com");  	
	  		
	  		WebElement element =driver.findElementByXPath("//input[@title='Search']");
	  		result=element.isDisplayed();
	  		result =false;
	  		//s.assertEquals(true, false);
	  		s.assertTrue(result);
	  		
	  		s.assertAll();
	  		System.out.println("Assertion done");
            	  
            	  
	
	
}
}