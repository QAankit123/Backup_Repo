package MltiWindowHandeling;

import java.util.ArrayList;
import java.util.Set;
//This code is for to switch all open window one by one
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowSwitching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
	    String parent=driver.getWindowHandle();
		
		System.out.println("Parent window is :"+"  "+parent);
		
		driver.findElementByXPath("//a[@href='http://www.google.com']").click();
		
		Set<String> allwin=driver.getWindowHandles();
		
		ArrayList <String> tabs= new ArrayList<>(allwin);
		
		driver.switchTo().window(tabs.get(2));
		    
		    
		

	}

}
