package MltiWindowHandeling;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElementByXPath("//input[@class='_2zrpKA']").sendKeys("9717189836");
		driver.findElementByXPath("//input[@class='_2zrpKA _3v41xv']").sendKeys("admin@123");
		
		driver.findElementByXPath("//button[@class='_2AkmmA _1LctnI _7UHT_c']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@type='text']").sendKeys("ASUS");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(2000);
        driver.findElementByXPath("//img[@alt='Asus Zenfone Max Pro M1 (Black, 32 GB)']").click();
        Thread.sleep(2000);
       
           Set<String>allwin = driver.getWindowHandles();
//        for (String s :allwin){
//        	driver.switchTo().window(s);
//        	if(driver.getCurrentUrl().equalsIgnoreCase("https://www.flipkart.com/asus-zenfone-max-pro-m1-black-32-gb/p/itmf4hg44xkefz58?pid=MOBF3A8U6T35DUBP&srno=s_1_1&otracker=search&lid=LSTMOBF3A8U6T35DUBPKZKQ1J&fm=SEARCH&iid=ac733a47-9fcb-4f1f-8ba0-cd2c8fb488e7.MOBF3A8U6T35DUBP.SEARCH&ppt=Homepage&ppn=Homepage&ssid=az2cb6kfuo0000001537031333868&qH=936aa2d51122f827"));
//        	{
//        		 driver.findElementByXPath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']").click();
//        	        
//        	} 
//        }
       
           for (String s :allwin){
        	   
        	   
           }
           
           
           
           
           
           
           
           
           
	}

}
