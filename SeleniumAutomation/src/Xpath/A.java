package Xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =  new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    //driver.findElementByXPath("xpath=(//input[@class='inputtext'])[2]").sendKeys("1233");
	    String s =driver.findElementByXPath("//div[text()='Create a new account']").getText();
	    	
		System.out.println(s);

	}

}
