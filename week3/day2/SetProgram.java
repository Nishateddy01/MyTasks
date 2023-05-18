package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		String str = "google";
		Set<Character> unique = new LinkedHashSet<>();

		 for(int i=0;i<str.length();i++)  { 
			boolean add = unique.add(str.charAt(i)); 
			if(add) {
				unique.add(str.charAt(i));
				
			}
			
			}
		 for(Character ch : unique)
	            System.out.print(ch);	
	} 


}