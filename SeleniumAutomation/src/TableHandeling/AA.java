package TableHandeling;

import org.openqa.selenium.chrome.ChromeDriver;

public class AA {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
	    ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/hotels");
		
		final int SelectDate=11;
		driver.findElementByXPath("//input[@readonly='readonly']").click();
		
		
		driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
		
		//*[@id='dp1534331335001']/div/div[2]/table/tbody/tr[4]/td[3]
		
		final int Day=7;
		String beforeXpath ="//*[@id='dp1534331335001']/div/div[2]/table/tbody/tr[";
		String afterXpath="]/td[";
		Thread.sleep(8000);
		boolean flag=false;
		
		for(int RowNum=1;RowNum<=Day;RowNum++)
		{
			
			for (int ColNum =1;ColNum<=5;ColNum++)
			{
				
				String value= driver.findElementByXPath(beforeXpath+RowNum+afterXpath+ColNum+"]").getText();
			                
				Thread.sleep(1000);
				System.out.println(value);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
