package SeleniumIQ;

public class SecondLargestInAnArray {

	public static void main(String[] args) {
		
	int arr[] ={2,5,3,11,0,55,-3,51};
	int second_largest = arr[0] ;
	int largest = arr[0];
	for (int i=0;i<arr.length;i++){
		 if(arr[i]>largest){
			            largest=arr[i];
		 }
		
	}
	
	 //System.out.println(largest);
		
       for(int j =0 ;j<arr.length;j++)
       {
    	   if((arr[j]>second_largest) && arr[j]!=largest){
    		   second_largest=arr[j];
    		   
    	   }
       }
       System.out.println(second_largest);
	}
	       
}
