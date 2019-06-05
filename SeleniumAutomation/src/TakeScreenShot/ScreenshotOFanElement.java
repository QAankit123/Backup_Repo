package TakeScreenShot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class ScreenshotOFanElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement logo =driver.findElementByXPath("//a[@title='Go to Facebook home']");
		
		Shutterbug.shootElement(driver, logo).withName("pagelogo").save();
		
		Thread.sleep(3000);
	}

}
