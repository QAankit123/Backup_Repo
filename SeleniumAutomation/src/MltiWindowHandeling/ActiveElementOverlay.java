package MltiWindowHandeling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementOverlay {

	public static String winHandle;
	public static void main(String[] args) {
		
//xpath=(//div[@class='mTxt'])[6]
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver  driver= new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		
	String get_currentwindow ="";
		driver.get("https://www.naukri.com/");
		
		Set <String> wl=driver.getWindowHandles();
		
//		for(String s :wl)
//		{
//			driver.switchTo().window(s);
//			if(driver.getCurrentUrl().equalsIgnoreCase("https://www.naukri.com/"))
//			{
//				get_currentwindow=s;
//			}
//			else{
//				driver.close();
//			}
//		}
//		
//		driver.switchTo().window("get_currentwindow");
   
		///driver.findElementByXPath("//*[@id='login_Layer']/div").click();
		
		driver.switchTo().activeElement();
		winHandle = driver.getWindowHandle();
		for(String windowsHandle : driver.getWindowHandles()){
			driver.switchTo().window(windowsHandle);
		}
		driver.findElement(By.id("eLoginNew")).sendKeys("fgfg.fggfgh@jjgj.fhf");
		
		
		
		
		
		
		
	}

}
