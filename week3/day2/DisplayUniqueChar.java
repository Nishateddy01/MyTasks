package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class DisplayUniqueChar {

	public static void main(String[] args) {
		String str = "Moon";
		String res = "";
		
	
		char[] charArray = str.toCharArray();		
		Set<Character> unique=new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			 boolean add=unique.add(charArray[i]);
			 
			if(add)
			res=res+charArray[i];
			else
				unique.remove(charArray[i]);
							
		}
		for(Character ch : unique)
		System.out.print(ch);
	}}




	


