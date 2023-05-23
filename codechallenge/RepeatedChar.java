package codechallenge;
import java.util.HashSet;
import java.util.Set;

public class RepeatedChar {

	public static void main(String[] args) {
		String str="abccbaacz";
		char result=' ';
		
		Set<Character> set=new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			
			
			if (!set.add(str.charAt(i)))
			{
				
				result=str.charAt(i);
				break;
			}
			
			
		}
		
System.out.println(result);

	}

}
