package MltiWindowHandeling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		ArrayList <String> Arr = new ArrayList();
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		 
		Thread.sleep(3000);
		driver.findElementByLinkText("Good PopUp #1").click();
		Thread.sleep(3000);
		
		
		    Set <String> WinHdl=driver.getWindowHandles();
		
		   for(String s1 :WinHdl)
		   {
			   driver.switchTo().window(s1);
			   
			    Arr.add(s1);
			   
		   }
		
		     
		
		
		
		
		
		
		

	}

}
