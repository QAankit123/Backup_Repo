package WaitKnowledge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciateWait {

	public static void main(String[] args) {
		
		
		
        System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Test Link")));
		 
		 Boolean status=element.isDisplayed();
		 if(status){
			 
			 System.out.println("Element found");
			 
		 }
		 else{
			 System.out.println("Element not found");
		 }
		
		
		
		
		
		
	}
}
