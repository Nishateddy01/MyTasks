package codechallenge;

public class LengthOfLastWordInArray {

	public static void main(String[] args) {
		String textString ="Hello World";
		String[] words = textString.split(" ");
	    int len = 0;
	    for (int i = words.length - 1; i >= 0; i--) 
	    {
	      len = words[i].length();
	      if (len > 0)
	      {
	        break;
	      }
	    }
	    System.out.println("The Last word of 'World' with length: "+len);
}
}