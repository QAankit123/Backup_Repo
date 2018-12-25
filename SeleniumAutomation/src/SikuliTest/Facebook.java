package SikuliTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Facebook {

	public static void main(String[] args) throws SikuliException {
		
		
		
		Screen scr =new Screen();
		
		Pattern screen1= new Pattern("E:\\Ss\\sikulimages\\email.PNG");
		
		Pattern screen2= new Pattern("E:\\Ss\\sikulimages\\paswrd.PNG");
		
		Pattern screen3= new Pattern("E:\\Ss\\sikulimages\\login.PNG");
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
			
		 ChromeDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		
		scr.type(screen1, "abcg");
		
		scr.type(screen2, "12345");
		
		scr.click(screen3);
		
	}

}
