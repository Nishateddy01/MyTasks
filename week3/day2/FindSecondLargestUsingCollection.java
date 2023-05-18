package week3.day2;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestUsingCollection {

	public static void main(String[] args) {
       int[] data = {3,2,11,4,6,7,2,3,3,6,7,8};
		
		Set<Integer> value = new TreeSet<Integer>();
		for(int i : data) {
			value.add(i);
		}
		
		Arrays.sort(data);
		System.out.println(" "+	data[data.length-2]);
		   

	} 
		

}
