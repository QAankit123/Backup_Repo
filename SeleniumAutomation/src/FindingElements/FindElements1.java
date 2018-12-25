package FindingElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		    List <WebElement> WL = driver.findElementsByClassName("inputtext")	;
		
		  for(WebElement e :WL)
		  {
			  e.sendKeys("Hello");
		  }
		
		
		
		
	}

}
