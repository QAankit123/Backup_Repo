package ParallelExecutionINTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void test1() throws InterruptedException {
		
		for (int i=0;i<=10;i++)
	    
		
	    System.out.println("this is test 1"+" "+i);	
        Thread.sleep(20);
	}
	@Test
	public void test2() throws InterruptedException {
	
		for (int i=100;i<=110;i++)
		
		
		
	System.out.println("this is test 2"+" "+i );	
		Thread.sleep(20);
	}
//	@BeforeMethod
//	public void BeforMethod() {
//		
//		System.out.println("BeforMethod has executed");	
//
//		}	
//	@AfterMethod
//	public void AfterMethods() {
//		
//		System.out.println("AfterMethod has executed");	
//
//		}
	
	
}
