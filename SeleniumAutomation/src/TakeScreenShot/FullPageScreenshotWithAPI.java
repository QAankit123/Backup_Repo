package TakeScreenShot;

import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class FullPageScreenshotWithAPI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Shutterbug.shootPage(driver).withName("Facebook").save();
		
		Shutterbug.shootPage(driver,ScrollStrategy.BOTH_DIRECTIONS).save();

	}

}
  