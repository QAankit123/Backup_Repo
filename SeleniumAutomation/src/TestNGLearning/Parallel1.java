package TestNGLearning;

import org.testng.annotations.Test;

public class Parallel1 {

	@Test
	public void Login() {
		System.out.println("I am in Parallel 1 *****Method 1");
		
	}
	@Test
	public void Registration() {
		System.out.println("I am in Parallel 1 *****Method 2");
	
}
}