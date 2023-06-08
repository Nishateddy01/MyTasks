package codechallenge;

public class DistanceToChar {

	public static void main(String[] args) {
		String s = "aaab"; char c = 'b';
        int[] arr = new int[s.length()];
        int count = s.indexOf(c);
        int l = 0, r = 0;
        for(int i = 0; i < s.length(); i++){
            r = s.indexOf(c,i) - i;
            if(s.charAt(i) == c)
                count = i;
            l = Math.abs(i - count);
            arr[i] = (r > 0)&&(l > r)? r:l;
        }
        for(int i: arr)
            System.out.print(i+" ");
	}

}
/*
 * Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function. 

Example 1:

Input: s = "aaab", c = "b"
Output: [3,2,1,0]
 
*/