package GeneralTopics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Overlay {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
        ChromeDriver driver= new ChromeDriver();
		
		
		
        driver.get("https://www.naukri.com/");
        
        driver.findElementByXPath("//a[@title='Jobseeker Login']").click();
        
        
        driver.switchTo().activeElement();
         Thread.sleep(30000);
         
         driver.findElementByXPath("//input[@name='email']").sendKeys("an=bcd");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
