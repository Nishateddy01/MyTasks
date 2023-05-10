package codechallenge;

public class RepetitiveNumInArray {

	public static void main(String[] args) {
		int arr[] = {2,2,1}; 
	    boolean repNum = false;

		for(int i=0; i<arr.length; i++)
		{
		    for(int j=i+1; j<arr.length; j++) 
		    {
		        if ((arr[i] == arr[j])) 
		        {
		        	repNum = true;
		        	break;
		        }
		    }

        }		    		
		    System.out.println (repNum);  	       
	}
	}


