package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		 String str = "Tes12Le79af65";
	     int sum = 0;
	     String replaceNonDigits = str.replaceAll("[^0-9.]", "");
	     char[] ch = replaceNonDigits.toCharArray();
	     
	     for(int i=0;i<ch.length;i++)
	     {
	         //int convertedNum = Integer.parseInt(String.valueOf(ch[i])); -> can also used
	    	 int convertedNum = Character.getNumericValue(ch[i]);  
	    	 sum = sum + convertedNum; 
	     }
          System.out.println("Sum of Digits from String: "+sum);	       
	}

}
