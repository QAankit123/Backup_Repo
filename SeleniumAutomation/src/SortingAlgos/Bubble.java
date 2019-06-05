package SortingAlgos;

public class Bubble {

	public static void main(String[] args) {
		
		int arr[]= {5,7,1,4,0,4,33,7};
		int temp =0;
		for(int i =0;i<arr.length;i++)
		{
			for(int j = 0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]){
					           
					temp=arr[j];
				    arr[j]=arr[j+1];
				    arr[j+1]=temp;				
				}
			}	
		}
		for(int j: arr){
			System.out.print("  "+j);
		}

	}

}
