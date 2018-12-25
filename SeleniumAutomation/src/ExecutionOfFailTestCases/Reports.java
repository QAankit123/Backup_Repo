package ExecutionOfFailTestCases;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public void CreateReport() {
		

	ExtentHtmlReporter reporter  = new ExtentHtmlReporter("./REPORT/ASSERTION.html");
	
	ExtentReports r = new ExtentReports();
	
	r.attachReporter(reporter);
	
	ExtentTest test = r.createTest("Login Logout");
	
	
      test.log(Status.INFO, "Assertion has executed");
	
	  r.flush();
	
	}
}
