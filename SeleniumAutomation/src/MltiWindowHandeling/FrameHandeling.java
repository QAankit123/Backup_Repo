package MltiWindowHandeling;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandeling {

	public static void main(String[] args) throws InterruptedException {
		// //input[@name='password']


		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElementByXPath("//input[@name='username']").sendKeys("Ankitsrv");
		
		Thread.sleep(2000);
		
		//**NotWorking   driver.findElementByXPath("xpath=(//input[@class='form-control'])[2]").sendKeys("admin@123");
		
		driver.findElementByXPath("//input[@name='password']").sendKeys("admin@123");
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//a[contains(text(),'Contacts')]").click();
		
		
		
		
		
		
		
		
		
		
	}

}
