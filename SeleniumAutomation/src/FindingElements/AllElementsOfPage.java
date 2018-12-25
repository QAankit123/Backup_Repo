package FindingElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllElementsOfPage {

	public static void main(String[] args) {
		 
        System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
	    ChromeDriver driver= new ChromeDriver();
	    
	    
//	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Postman Button")));
//	    boolean status=element.isDisplayed();
		
		 
		driver.get("https://www.facebook.com/");
		
		      Boolean result;
	         List<WebElement> list  =  driver.findElementsByXPath("//*");	
	       System.out.println(list.size());
	       WebElement element;
		     for(WebElement e :list){
		    	 
		    	 if(e.isEnabled()==true){
		    		 
		    		 System.out.println(e.getTagName()+" : " + e.getText());
		    	 }
		    	 
		     }
		
		
		
		
		

	}

}
