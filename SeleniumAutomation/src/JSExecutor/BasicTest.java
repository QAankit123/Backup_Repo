package JSExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {
      public static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
	     driver= new ChromeDriver();

		driver.get("https://www.crmpro.com/index.html");
		
		driver.findElementByXPath("//input[@name='username']").sendKeys("ankitadmin");
		
		driver.findElementByXPath("//input[@name='password']").sendKeys("admin@123");
		
		Thread.sleep(3000);
		
		WebElement loginBtn =driver.findElementByXPath("//input[contains(@type,'submit')]");
		
		BasicTest.Get_Element_Color(loginBtn,driver);
		
		
		
		
		
	}

	public static void Get_Element_Color(WebElement element,ChromeDriver driver ) {
		
    JavascriptExecutor js = ((JavascriptExecutor)driver);
		
       String color    =  element.getCssValue("backgroundcolor");
		
		System.out.println(color);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
