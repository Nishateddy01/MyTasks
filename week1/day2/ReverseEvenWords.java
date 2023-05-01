package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String str[] = test.split(" "); 
		String revWords = ""; 
		String revString = ""; 

		for (int i = 0; i < str.length; i++) { 
			String words = str[i]; 
			if (i % 2 != 0) { 
				for (int j = words.length() - 1; j >= 0; j--) { 
					revWords = revWords + words.charAt(j); 
				} 
				revString = revString + revWords + " "; 
				revWords = ""; 
			} 
			else 
				revString = revString + str[i] + " "; 
		} 
		System.out.println(revString);  
		
		}		
}

