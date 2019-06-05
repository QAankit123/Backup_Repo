package TestNGLearning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseExecution {
	@Parameters({"suitlevel"})
    @Test
	public void GetData(String s){
		System.out.println(s);
	}
	
	
}
