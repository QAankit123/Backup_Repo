package MltiWindowHandeling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		
		    String s1 =driver.getCurrentUrl();
		    
		    
		    driver.get("https://www.facebook.com/");
		    
		    String s2=driver.getCurrentUrl();
		    
		    driver.get(s1);
		    
		    Thread.sleep(3000);
		    
		    driver.findElementByXPath("//a[@id='login_Layer']").click();
           
		     
		    Thread.sleep(3000);
		    
		    driver.switchTo().activeElement();
			Thread.sleep(4000);
			driver.findElementByXPath("//input[@id='eLoginNew']").sendKeys("1234");
			
		
		
		
		
		
	}

}
