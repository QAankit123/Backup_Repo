package TestNGLearning;

import org.testng.annotations.Test;

public class GroupTestCaseExecution {

	  @Test(groups={"sanity"})
	  public void Test1() {
		System.out.println("sanity test cases hs executed");

	}
	  @Test(groups={"smoke"})
	  public void Test2() {
		System.out.println("smoke test cases has executed");
	}
	
	
	
}
