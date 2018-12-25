package TableHandeling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFromCalander {

	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
	
		
		driver.get("http://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement e = driver.findElementByXPath("//input[@id='ctl00_mainContent_view_date1']");
		
		String value = "14-08-2018";
		
		SelectDateByJS(driver, e , value);
		
	}
		
		
		
		public static void SelectDateByJS(ChromeDriver driver,WebElement element, String dateval) {
			
			
			JavascriptExecutor js= ((JavascriptExecutor)driver);//casting driver in to java script executer 
			
			js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
			
			

		}
		
	
	
	
	
	
	
	

}
