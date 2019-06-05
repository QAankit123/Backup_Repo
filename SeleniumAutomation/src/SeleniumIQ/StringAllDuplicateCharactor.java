package SeleniumIQ;

public class StringAllDuplicateCharactor {

	public static void main(String[] args) {
		String str=  "programming";
		char arr[] =str.toCharArray();
		for(int i =0;i<arr.length-1;i++)
		{
		for(int j=i+1;j<arr.length;j++)
			
		{
			if(arr[i]==arr[j] && (i !=j)){
				
				System.out.println("Duplicate Element"+" "+arr[j]);
			}
		}	
		}

	}

}
