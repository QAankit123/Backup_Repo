package SeleniumIQ;

public class ArrayMerge {

	public static void main(String[] args) {
		
		
		int arr1[]={2,4,5,6,7};
		int arr2[]={8,9,3,1,0};
		int merge[]=new int[arr1.length+arr2.length];
		int counter=0;
		
		for(int i=0;i<arr1.length;i++){
			merge[i]=arr1[i];
			counter++;             
			
		}
		
          for(int j=0;j<arr2.length;j++){
        	  
        	 merge[counter++]=arr2[j];
        	  
          }
		
		for(int a=0;a<merge.length;a++){
			
			System.out.print(merge[a]+" ");
			
		}
		
	}

}
