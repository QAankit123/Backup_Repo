package SeleniumIQ;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.thetestingworld.com/");
		
		
		Actions act = new Actions(driver);
	    act.moveToElement(driver.findElementByXPath("//a[@title='TRAINING']")).perform();
	    Thread.sleep(3000);
		act.moveToElement(driver.findElementByXPath("//a[@id='menu665']")).perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElementByXPath("//a[@id='menu669']")).click();
		
		
	}

}
