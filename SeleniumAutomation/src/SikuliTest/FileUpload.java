package SikuliTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws FindFailed {
		
		boolean result = false;
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
			
		 ChromeDriver driver= new ChromeDriver();
		 
		 driver.get("http://demo.automationtesting.in/Register.html");
		 
		 driver.findElementByXPath("//input[@id='imagesrc']").click();
		 
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
		 Screen scr =new Screen();
		 
		 Pattern screen1 = new Pattern("E:\\Ss\\sikulimages\\uploadpath.PNG");		
		
		 Pattern screen2 = new Pattern("E:\\Ss\\sikulimages\\clickOpen.PNG");
		 
		  scr.type(screen1, "E:\\Ss\\CVs\\Add-in002.jpg");
		 
		 scr.click(screen2);
		 
		 
		 WebDriverWait wait = new WebDriverWait (driver,15);
		
		 
		 WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='imagesrc']")));
 
		  result =element.isDisplayed();
		 
		 if(result){
			 System.out.println("uloaded");
		 }
		 else{
			 System.out.println("not uploaded");
			
		 }
	}

}
