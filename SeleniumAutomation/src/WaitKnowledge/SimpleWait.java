package WaitKnowledge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =  new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//  *************Implicit Wait********************//
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//  *************Explicit Wait********************//
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		long t1 = System.currentTimeMillis();
		try{
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgotten a")));
			
		}
		catch(Exception e)
	{
			System.out.println("not found");
		}
		long t2 = System.currentTimeMillis();
		
		double timetaken = (t2-t1)/1000;
		System.out.println("Donr"+"   "+ timetaken);
		driver.findElementByLinkText("Forgotten account?").click();
		
		driver.findElementByXPath("//input[@value='Search']").click();
		
		
	}

}
