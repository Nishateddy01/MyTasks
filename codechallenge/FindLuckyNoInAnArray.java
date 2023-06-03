package codechallenge;

import java.util.Arrays;

public class FindLuckyNoInAnArray {
	public static int findLuckyNo(int[] arr) {
	    Arrays.sort(arr);
	    int count = 0;
	    for (int i = arr.length - 1; i >= 0; i--) {
	    	count++;
	        if (i == 0 || arr[i] != arr[i - 1]) {
	        	
	            if (count == arr[i]) {
	                return count;
	            }
	            count = 0;
	        }
	    }
	    return -1;
	}

	public static void main(String[] args) {
		int [] arr = {2,2,2,3,3}; 
        int ans=findLuckyNo(arr); 
        System.out.println(ans);
	}

}
/*
 * Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1. 

Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
 */
