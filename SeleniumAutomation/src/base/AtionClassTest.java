package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;

public class AtionClassTest {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.thetestingworld.com/");
		
		Actions act = new Actions(driver);
		
		//act.click(driver.findElementByXPath("//input[@type='submit']")).perform();
		
	 act.moveToElement(driver.findElementByXPath("//span[text()='TRAINING']")).perform();
		
		
		
		
		
		
		
		

	}

}
