package GeneralTopics;

public class SecondLargestInAray {

	public static void main(String[] args) {
		
		//int arr []= {2,8,6,16,99,100,101};
		int arr []= {0,1,3};
	
		int First_Largest = arr[0];
		int Second_Largest= arr[0];
		
		for (int i =0 ;i<arr.length;i++)
			
		{
			if(arr[i]>First_Largest)
			{
				Second_Largest=First_Largest;
				First_Largest  =arr[i];
				
			}
			
			
			
		}
			
		
		System.out.println("Second largest element in array is " + "    "+Second_Largest );
		
		
		System.out.println("First largest element in array is " + "    "+First_Largest );
		
		
		
		
	}

}
