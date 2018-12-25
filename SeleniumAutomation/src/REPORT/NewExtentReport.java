package REPORT;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class NewExtentReport {

	@Test
	public void Login() {
		
	System.out.println("login to flipcart");	
	
	ExtentHtmlReporter 	reporter = new ExtentHtmlReporter("./REPORT/BasicReportTEST1.html");
		
	ExtentReports ext = new ExtentReports();	
		
	ext.attachReporter(reporter);
	
	ExtentTest logger = ext.createTest("My Login");
	
	logger.log(Status.INFO,"Login in to system");	
	
	logger.log(Status.PASS,"Login in to GOOGLE");	
	
	
	
	
	ext.flush();
	
	
        
	}
	
	@Test
	public void Logout() {
		
        System.out.println("logout to flipcart");
        
        ExtentReports ext2 = new ExtentReports();	
        ExtentTest logger2 = ext2.createTest("My Logout");
    	
    	logger2.log(Status.INFO,"Logout in to system");	
    	logger2.log(Status.FAIL,"Logout in to GOOGLE");
    	
        
        
	}

	
	
	
	
	
}
