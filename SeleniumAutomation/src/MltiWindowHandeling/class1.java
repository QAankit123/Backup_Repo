package MltiWindowHandeling;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com/");

		     Set<String> allwin   =    driver.getWindowHandles();
		     
		     for(String s : allwin)
		     {
		    	 driver.switchTo().window(s);
		    	 System.out.println(driver.getCurrentUrl());
		     
		
		 
		     if(driver.getCurrentUrl().equalsIgnoreCase("https://www.naukri.com/"))
		     {
		    	  System.out.println("URL matches");
		     }
		        
		     else{
		    	 driver.close();
		     }
		
		     }
	}

}
