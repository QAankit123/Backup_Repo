package SeleniumIQ;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserResize {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().setPosition(new Point (400,200));
		
		
		
		
		

	}

}
