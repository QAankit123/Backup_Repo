package SeleniumIQ;

public class BubbleSortANDLargestElementInArray {

	public static void main(String[] args) {
	
		int arr[]={5,7,1,4,0,4,33,7};
		int length = arr.length;
		int temp;
		System.out.println(length);
		for(int i =0;i<length;i++){
			for (int j= 0;j<length-1;j++){
				
				if(arr[j]>arr[j+1]){
					temp=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;
				}
				
				
			}
		}
               System.out.println("second largestt element is"+ "  "+arr[6]);
	}

}
