package TableHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalanderHandeling {

	public static void main(String[] args) throws InterruptedException {
		
		 
        System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
	    ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.crmpro.com/index.html");
		
		driver.findElementByXPath("//input[@name='username']").sendKeys("ankitadmin");
		
		driver.findElementByXPath("//input[@name='password']").sendKeys("admin@123");
		
		driver.findElementByXPath("//input[@type='submit']").submit();
		
        driver.switchTo().frame("mainpanel");
		
		String mydate = "11-November-2019";
		
		String dateArr []=  mydate.split("-");
		final int totalWeekDats =7;
		String date =dateArr[0];
		String month =dateArr[1];
		String year =dateArr[2];
		
		Select sel3= new Select (driver.findElementByName("slctYear"));
		sel3.selectByVisibleText(year);
		
		Select sel2= new Select (driver.findElementByName("slctMonth"));
		sel2.selectByVisibleText(month);

		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[4;
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[4]/td[4]
		String beforeXpath ="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
	
		
		String afterXpath= "]/td[";
		boolean flag=false;
		for(int RowNum=2;RowNum<=totalWeekDats;RowNum++)
		{
			
			for(int ColNum=1;ColNum<=totalWeekDats;ColNum++)
			{
				
			String dayValue=	driver.findElementByXPath(beforeXpath+RowNum+afterXpath+ColNum+"]").getText();
				
				System.out.println(dayValue);
			 Thread.sleep(1000);
			 
			 if(dayValue.equals(date))
			 {
				 driver.findElementByXPath(beforeXpath+RowNum+afterXpath+ColNum+"]").click();
				 flag=true;
				 break;
			 }
			 
			 
			}
			
			if(flag){
				break;
			}
			
		}
		
	}

}
