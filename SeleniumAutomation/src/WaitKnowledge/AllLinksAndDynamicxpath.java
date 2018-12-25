package WaitKnowledge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksAndDynamicxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =  new ChromeDriver();
		
	    driver.get("https://www.ebay.com/");

//	    driver.findElementByXPath("//input[contains(@class,'gh-tb ui-autocomplete-input')]").sendKeys("java");
//		
//		
//		driver.findElementByXPath("//input[starts-with(@id,'test_')]");
//		
//		driver.findElementByXPath("//input[ends-with(@id,'test-')]");
//		
		
		List <WebElement>  linklist =driver.findElements(By.tagName("a"));
		
		
		System.out.println(linklist.size());
		
		for (int i =0;i<linklist.size();i++)
		{
			String s1=linklist.get(i).getText();
			
			System.out.println(s1);
		}
	}

}
