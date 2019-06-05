package SeleniumIQ;

import java.util.HashMap;

public class ArrayOccerenceOFEachWord {

	
	public static void main(String[] args) {
		
	int count =0;	
	char arr[]= {'p','r','o','g','r','a','m','m','i','n','g'};
   
	for(int i =0;i<arr.length-1;i++)
	{
		for(int j =i+1;j<arr.length;j++){
			
			if(arr[i]==arr[j] && (i!=j))
			{   
				
				System.out.println("Duplicate Element"+" "+arr[j]);
				
				
			}
		}
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
	}
	}
	

