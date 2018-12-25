package MltiWindowHandeling;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTabSwitching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		String current_window="";
		driver.get("https://www.naukri.com/");
		
		
		Set <String> s1=driver.getWindowHandles();
		
		
		
		
		driver.findElementByXPath("//a[@id='login_Layer']").click();
           Thread.sleep(4000);
		driver.switchTo().activeElement();
		Thread.sleep(4000);
		driver.findElementByXPath("//input[@id='eLoginNew']").sendKeys("1234");
		

		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}


