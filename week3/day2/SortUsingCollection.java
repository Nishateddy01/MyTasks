package week3.day2;

import java.util.Arrays;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] str = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		Arrays.sort(str);
		
		for (int i = str.length-1; i >=0 ; i--) {
			System.out.print(str[i]+"  ");
			}
	}

}
//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

	// get the length of the array		

	// sort the array			

	// Iterate it in the reverse order

	// print the array
		
	// Required Output: Wipro, HCL , CTS, Aspire Systems