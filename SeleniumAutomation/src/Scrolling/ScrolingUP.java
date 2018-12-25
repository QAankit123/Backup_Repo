package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolingUP {

	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver= new ChromeDriver();
		
		    driver.manage().window().maximize();
		    
		    driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		    
		    Thread.sleep(3000);
		    JavascriptExecutor js= ((JavascriptExecutor)driver);
		    
		    js.executeScript("scroll, (0,800)");
		    System.out.println("done");
		
		
	}

}
