package AssertionConcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B {

	@Test
public  void Compare() {
		
		
		SoftAssert verify = new SoftAssert();
		
		
         System.out.println("Open Browser");
         
         Assert.assertEquals(true, true);
         
         System.out.println("Enter Username");
         
         
         
         System.out.println("Enter Password");
         
         
         System.out.println("Click on Login");
         
         
         System.out.println("Validate HomePage");
         
         verify.assertTrue(false, "homepage title is missing");
         
         System.out.println("Create A deal");
         
         System.out.println("Add to the cart");
         
         verify.assertAll();
         
	}
	
	
	
	
	
	
	
	
	
	
	
}
