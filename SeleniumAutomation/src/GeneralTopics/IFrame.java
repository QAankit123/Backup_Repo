package GeneralTopics;

import java.io.File;
import java.nio.file.Files;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		
		
         System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
         ChromeDriver driver= new ChromeDriver();
		
		
		
         driver.get("https://accounts.google.com/ServiceLogin/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");
		
        
        driver.findElementByXPath("//input[@type='email']").sendKeys("ankit.ame91");
        
        Thread.sleep(2000);
        driver.findElementByXPath("//span[contains(text(),'Next')]").click();
        Thread.sleep(2000);
        
        
        
        File f =new File("E:\\snp00.png");
       
        f=driver.getScreenshotAs(OutputType.FILE);
        driver.findElementByXPath("//input[@name='password']").sendKeys("#########");
        
        TakesScreenshot ts =(TakesScreenshot)driver;
        
         File  fs=     ts.getScreenshotAs(OutputType.FILE);
        
         
       
        
        
        
         
         
        Thread.sleep(3000);
        
        
        
        driver.findElementByXPath("//span[contains(text(),'Next')]").click();
        
        
        
        
        
        
        
		
		
	}

}
