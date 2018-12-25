package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class Takess {
    static WebDriver driver;
	public static void main(String[] args) throws IOException  {
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
  		 driver = new ChromeDriver();
  		 driver.get("https://www.facebook.com/");
  		Take_Screen_Shot("facebook_login");

	}

	
	 public static void Take_Screen_Shot(String filename) throws IOException {
		//Taking screenshot and storing in file format. 
	File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		 
		FileUtils.copyFile(f, new File("E:\\Ss\\player\\GIT reprosetry\\SeleniumAutomation\\ScreenShot"+filename+".jpg"));
		
		
	}
	
	
	
	
	
}
