package WaitKnowledge;
///***This code is for validating any locator on Web page so the we can confirm TestCase has pass****////
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedForValidtionOfAnyTC {
	static boolean status =false;
	public static WebElement element ;
	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/");
		try{
		  element =driver.findElementByLinkText("Postman Buttonddd");
		   status=element.isDisplayed();
		}
		catch(Exception e){
		 
		
		
		if(status){
			
			System.out.println("element displayed");
		}
		else{
			System.out.println("element not displayed");
		}
		}
	}

}
