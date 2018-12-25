package WaitKnowledge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver =  new ChromeDriver();
		
	    long t1=System.currentTimeMillis();
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		long t2=System.currentTimeMillis();
long totalTime =(t2-t1)/1000;
System.out.println(totalTime);
		
		
	}

}
