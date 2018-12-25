package SeleniumIQ;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GttAllLinkOfThePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =  new ChromeDriver();
	    driver.get("https://www.facebook.com");
	     List<WebElement> linklist        = driver.findElementsByTagName("a");
	      
	     System.out.println(linklist.size());
	     
	     for(int i = 0;i<linklist.size();i++)
	     {
	     
	    String s =	linklist.get(i).getText();
	    	 
	    	 System.out.println(s);
	     }
	}

}
