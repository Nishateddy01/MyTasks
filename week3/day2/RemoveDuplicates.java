package week3.day2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] chArr = str.toLowerCase().toCharArray();
		Set<Character> charSet = new LinkedHashSet<>();
		Set<Character> dupCharSet = new LinkedHashSet<>();
		for (int i = 0; i < chArr.length; i++) {
			if(!charSet.add(chArr[i])) {
				dupCharSet.add(chArr[i]);
			}
		}
		charSet.removeAll(dupCharSet);
		for (Iterator<Character> itr = charSet.iterator(); itr.hasNext();) {
			char ch = itr.next();
			if(ch!=' ')
				System.out.print(ch);
		}
	}

}
