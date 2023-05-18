package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumberUsingCollection {

	public static void main(String[] args) {
		int[] input= {1,4,6,7,4,6,3,4,7};

		
		Set<Integer>  unique= new TreeSet<Integer>();

		for (int i = 0; i < input.length; i++) {

			unique.add(input[i]);

		}

		int i=1,num = 0;
		
		for (Integer value : unique) {

			if(value != i) {
				num = i;
				break;
			}
			i++;

		}

		System.out.println(" "+num);
	}

	}


