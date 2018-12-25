package SeleniumIQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Initiate_BrowserAndDropDown {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		Select sel_day = new Select(driver.findElementByXPath("//select[@id='day']"));
		sel_day.selectByValue("5");
		
		Select sel_month = new Select(driver.findElementByXPath("//select[@id='month']"));
		
		sel_month.selectByVisibleText("Feb");
		
		Select sel_year = new Select(driver.findElementByXPath("//select[@id='month']"));
		
		sel_year.selectByIndex(2017);
		
	}

}
