package GeneralTopics;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	@Test
	public void LoginTest() {
		
		System.out.println("Login to Flipkart");
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./REPORT/AUTOMATION2.html");
	
	ExtentReports extent = new ExtentReports ();

	
	extent.attachReporter(reporter);
	  
	
	   ExtentTest logger =extent.createTest("Login Test");
	   
	   logger.log(Status.INFO, "Login to Flipkart");
	   logger.log(Status.PASS, "Login to GMAIL");
	System.out.println("Login to Flipkart");
	
	
	
	   ExtentTest logger2 =extent.createTest("Login Test");
	   logger2.log(Status.FAIL, "Fail it ");
	extent.flush();
	
	}
}
