package GeneralTopics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class NewExtentReporting {
     
	ChromeDriver driver ;
	@Test
	public void VerifyTitle() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./REPORT");
		
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(reporter);
		ExtentTest logger=ext.createTest("Login_test");
		
		driver= new ChromeDriver();
		logger.log(Status.INFO, "login to flipkart");
		logger.log(Status.PASS, "login to Google");
		ext.flush();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
