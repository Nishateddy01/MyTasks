package codechallenge;

public class CheckPalindromeOfString {

	public static void main(String[] args) {
		String text = "Race a Car";
		String rev = "";
		boolean checkPalindrome = false;
		String result = text.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
		
	    for(int i=result.length()-1;i>=0;i--)
		{
		 rev = rev+ result.charAt(i);
	    }
	    
		if(result.equalsIgnoreCase(rev)) 
		{
		checkPalindrome = true;
		System.out.println(checkPalindrome);	

	    }
		else {
			System.out.println(checkPalindrome);
		}

} }
