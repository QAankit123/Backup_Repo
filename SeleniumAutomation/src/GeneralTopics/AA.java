package GeneralTopics;

import org.openqa.selenium.chrome.ChromeDriver;

public class AA {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		boolean q =ValidateTitle("https://www.facebook.com/",driver);
		System.out.println(q);
		
    		
	}
	public static boolean ValidateTitle(String ExpectedTitle, ChromeDriver driver) {
		
		boolean result = false;
		if(driver.getTitle().equalsIgnoreCase(ExpectedTitle))
		{
			result=true;
			
			
		}
		
		
		return result;
	   
	}	
		
}
		
		
		
		
		
		
		
		
		
		


	


