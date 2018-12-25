package FailedRunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TryThis {

	public static void main(String[] args) {
		
     TestNG runner = new TestNG();
		
		
     
     List<String> list= new ArrayList<String>();
     
        list.add("E:\\Ss\\player\\GIT reprosetry\\SeleniumAutomation\\test-output\\testng-failed.xml");
     
		runner.setTestSuites(list);
		runner.run();
		
	}

}
