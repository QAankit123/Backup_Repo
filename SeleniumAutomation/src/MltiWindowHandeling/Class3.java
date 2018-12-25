package MltiWindowHandeling;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	
	public static String  s1;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver= new ChromeDriver();
	String get_currentwindow ="";
		driver.get("https://www.naukri.com/");
		
		           s1 =driver.getWindowHandle();
		       
		driver.get("https://www.facebook.com/");     
		
		       String s2=driver.getWindowHandle();
		       
		       driver.switchTo().window(s1);
		       
		       Thread.sleep(4000);
		       
		       driver.findElementByXPath("//a[@id='login_Layer']").click();
		       
		       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
