package codechallenge;

public class SquareRootOfNumber {

	public static void main(String[] args) {
			
		int no = 8;
		int i;
		int sqrt = 1;

	    for ( i = 1; i<=no; i++) 
	    {
	        sqrt = sqrt - (sqrt * sqrt - no) / (2 * sqrt); //used square root formula
	    }
	    if(i*i==no) 
	    {
	    	
	    System.out.println("Sqrt of a no: "+ sqrt);		
	    }
	    else // for i*i>no
	    {
		    System.out.println("Sqrt of a no: "+ (sqrt-1));		

	    }
		
	}
	}

