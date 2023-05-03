package codechallenge;

public class SquareRootOfNumber {

	public static void main(String[] args) {
			
		int no = 4;
		int sqrt = 1;

	    for (int i = 1; i<=no; i++) 
	    {
	        sqrt = sqrt - (sqrt * sqrt - no) / (2 * sqrt); //used square root formula
	    }
	    System.out.println("Sqrt of a no: "+ sqrt);		
		
	}
	}

