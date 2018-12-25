package MltiWindowHandeling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopupHandeling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@name='proceed']").click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		String s1 =alt.getText();
		
		if(s1.equalsIgnoreCase("Please enter a valid user name"))
			
		{
			System.out.println("validation text if fine");
			
		}
		
		
		else{
			System.out.println("validation text if not fine");
		}
		Thread.sleep(3000);
		
		alt.accept();
		
		
		
		
		
		
		
		
	}

}
