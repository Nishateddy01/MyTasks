package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String text = "madam";
		String rev = "";
		for(int i=text.length()-1;i>=0;i--)
		{
		 rev = rev+ text.charAt(i);
	    }
		if(text.equalsIgnoreCase(rev))
		{
			System.out.println(rev+ " is a Palindrome");	
		}
		else
		{
			System.out.println(rev+ " is not a Palindrome");	
		}
}
}
