package MltiWindowHandeling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllActiveElementOfAPage {

	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		List <WebElement> ele=   driver.findElements(By.xpath("//*"));
		
		System.out.println(ele.size());
		
		for (WebElement w :ele ){
			
			if(w.isEnabled()==true){
				
				
				System.out.println(w.getTagName()+ "  :  "+w.getText());
			}
			
			
		}
		
		
		
		

	}

}
