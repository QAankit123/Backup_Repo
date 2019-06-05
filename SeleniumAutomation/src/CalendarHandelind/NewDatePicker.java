package CalendarHandelind;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewDatePicker {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://condecoprb.condecodev.com/login/login.aspx?logout=1");
		
		driver.findElementByXPath("//input[@id='txtUserName']").sendKeys("manojadmin");
		
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("user@123");
		
		driver.findElementByXPath("//input[@id='btnLogin']").click();
		Thread.sleep(4000);
		
		driver.findElementByXPath("//a[text()='Go to app']").click();
		
		Thread.sleep(4000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeAsyncScript("document.getElementById('startDate_calendarImage').value='25/03/2018'");
		
		
		//js.executeAsyncScript("document.getElementById('datepicker1').value='09/12/2017'");
		
	}

}
