package MltiWindowHandeling;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.chrome.ChromeDriver;

public class MultiPopUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		Thread.sleep(3000);
		
		//driver.findElementByXPath("//a[@class='blu']").click();
		driver.findElementByLinkText("Good PopUp #1").click();
		Thread.sleep(3000);
		
	               Set <String>   winHandl =       driver.getWindowHandles();
		
	               Iterator  <String> it   =       winHandl.iterator();    
		
		           String  ParentWindow     =                it.next();
		           
		           System.out.println("Parent window Url is :"  +ParentWindow );
		           
		           String  ChildWindow          =           it.next();  
		           
		           System.out.println("Child window Url is :"  +ChildWindow );
		           
		           
		           
		  
		            
		          driver.switchTo().window(ChildWindow);
		            
		         System.out.println("Child Win" + driver.getTitle()); 
		         
		         
		         driver.close();
		         
		         driver.switchTo().window(ParentWindow);
		            
		         System.out.println("Parent Win" + driver.getTitle()); 
		         
		         
		
	}

}
