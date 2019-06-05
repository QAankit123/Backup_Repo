package MltiWindowHandeling;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingInSameTab {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.findElementByXPath("//a[text()=' Click this link to start  Session in same window']").click();
		
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());

	}

}
