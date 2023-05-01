package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Testleaf";
		char[] ch = name.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
