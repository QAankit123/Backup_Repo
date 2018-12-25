package GeneralTopics;

public class Arr {

	public static void main(String[] args) {
	
	int arr []= {90,2,8,1,79,9,6,99,5,4};
	
	int length =arr.length;
	int max = arr[0];
	int j = arr[1];
	//System.out.println(length);
    for (int i =0 ;i<length;i++ )
    {
    	if (arr[i]>max)
    	{
    		max=arr[i];
    		
    	}
    	
    	
    	
    }
		
		
		System.out.println(max);
		
		
		
		
		
		
		

	}

}
