package SeleniumIQ;

import java.util.HashMap;
import java.util.Map;

public class StringOccerenceOFEachCharactor {

	public static void main(String[] args) {
		
		String str=  "programming";
		
		HashMap <Character,Integer> hm = new HashMap<>();
		
		for (Character c :str.toCharArray()){
			
			
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);
		
	}

}
