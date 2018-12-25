package GeneralTopics;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAA {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
	    ChromeDriver driver= new ChromeDriver();
		
	    driver.get("https://www.facebook.com");
	    
//	    List <WebElement> list=driver.findElementsByXPath("//*");
//		
//		System.out.println("No of element in page are"+"  "+list.size());
//		
//		for(WebElement e :list){
//			
//			if(e.isDisplayed()==true){
//				
//				System.out.println(e.getText()+"   "+e.getTagName());
//				
//			}
//			
//			
//		}
		
	    
	    List<WebElement> list= driver.findElementsByTagName("a");
	    
	    
	    for(WebElement e :list){
	    	
	    	String s = e.getText();
	    	
	    	if(e.isDisplayed()==true){
	    		System.out.println(s);
	    	}
	    	
	    	
	    	
	    }
		    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
