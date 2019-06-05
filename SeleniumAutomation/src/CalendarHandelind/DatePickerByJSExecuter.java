package CalendarHandelind;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerByJSExecuter {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("document.getElementById('datepicker1').value='09/12/2017'");
		
		
			
	}
}
        


    