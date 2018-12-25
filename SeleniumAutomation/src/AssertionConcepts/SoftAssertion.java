package AssertionConcepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
            @Test
	        public void Verify() {
				

			SoftAssert assertion = new SoftAssert();
	
			 assertion.assertEquals(13, 12);
	
	         System.out.println("done");
	
	        }
}
