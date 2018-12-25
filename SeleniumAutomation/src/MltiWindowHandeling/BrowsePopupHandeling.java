package MltiWindowHandeling;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsePopupHandeling {

	public static void main(String[] args) throws InterruptedException {
		// "C:\Users\Ankit.Shrivastava\Desktop\visitor.final.fi1nal.xlsx"
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElementByXPath("//input[@id='fileupload']").sendKeys("C:\\Users\\Ankit.Shrivastava\\Desktop\\visitor.final.fi1nal.xlsx");
		
		Thread.sleep(3000);
		
		//driver.findElementByXPath("//input[@type='submit']").click();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
