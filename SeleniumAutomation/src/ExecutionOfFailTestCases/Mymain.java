package ExecutionOfFailTestCases;

public class Mymain {

	public static void main(String[] args) {
		
		Wordpress wp = new Wordpress();
		Reports rep =new Reports();
		wp.TestFB();
		wp.TestGmail();
		wp.TestWP();
		
		rep.CreateReport();
		
		}

}
