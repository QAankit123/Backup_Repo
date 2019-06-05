package SeleniumIQ;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class GetAllElementOFPage {
   
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =  new ChromeDriver();
	    driver.get("https://www.facebook.com");
	     
	    List<WebElement>  list=driver.findElementsByXPath("//*");
	    System.out.println(list.size());
        for(WebElement e: list ){
        	
        System.out.println("done");	 
        {
        	System.out.println(e.getTagName()+ "   "+e.getText());
        }
        	
        }
	}

}
