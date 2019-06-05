package MltiWindowHandeling;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabSwitching {

	    public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("Parent window is :"+"  "+parent);
		
		driver.findElementByXPath("//a[@href='http://www.google.com']").click();
		
		Set<String> allwindow=  driver.getWindowHandles();
		
		for(String child :allwindow){
			
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
			
		}
		
//		  driver.switchTo().window(parent);
//		  System.out.println(driver.getTitle());

	}

}
