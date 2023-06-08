package codechallenge;

public class DistinctElementsInArray {	

	        static String distinctElements(String[] arr,int n,int k)
	        {
	            int count = 0;
	            for (int i = 0; i < n; i++)
	            {
	                int j;
	                for (j = 0; j < n; j++)
	                    if (i != j && arr[j] == arr[i])
	                        break;

	                if (j == n)
	                    count++;

	                if (count == k)
	                    return arr[i];
	            }

	            return null;
	        }

	        public static void main (String[] args)
	        {
	            String arr[] = {"aaa","aa","a"};	           
	            System.out.print(distinctElements(arr, arr.length, 1)+" ");
	           
	        }
	    }
/*
 * A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.

 

Example 1:

Input: arr = ["d","b","c","b","c","a"], k = 2
Output: "a"
Explanation:
The only distinct strings in arr are "d" and "a".
"d" appears 1st, so it is the 1st distinct string.
"a" appears 2nd, so it is the 2nd distinct string.
Since k == 2, "a" is returned. 
Example 2:

Input: arr = ["aaa","aa","a"], k = 1
Output: "aaa"
Explanation:
All strings in arr are distinct, so the 1st string "aaa" is returned.
Example 3:

Input: arr = ["a","b","a"], k = 3
Output: ""
Explanation:
The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".
 */
	

