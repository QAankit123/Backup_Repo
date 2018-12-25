package GeneralTopics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandeler {

	public static void main(String[] args) throws InterruptedException {
		

		
         System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
         ChromeDriver driver= new ChromeDriver();
		
		
		 driver.get("https://www.naukri.com/");
		 
		 Set <String> allWindow=driver.getWindowHandles();
		
		Iterator <String> it =allWindow.iterator();
		
		
        String ParentWindow=  it.next();
       
       
        System.out.println(ParentWindow);
       
        String ChieldWindow=  it.next();
       
       System.out.println(ChieldWindow);
       
       driver.switchTo().window(ChieldWindow);
       
       Thread.sleep(20000);
       driver.close();

       
       
       
		
	}

}
