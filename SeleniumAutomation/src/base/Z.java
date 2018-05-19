package base;

public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int Arr[]={1,2,3,6,9};
		
		
		
		
		
		try{
			 Arr[7]=10;
			
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("exception handelled");
		}
		
		
		System.out.println("done");
		
		
	}

}
