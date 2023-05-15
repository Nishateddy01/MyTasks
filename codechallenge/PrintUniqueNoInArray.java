package codechallenge;

public class PrintUniqueNoInArray {

	public static void main(String[] args) {
		int arr[] = {2,2,1}; 

		for(int i=0; i<arr.length; i++)
		{
			int count = 0;

		    for(int j=0; j<arr.length; j++) 
		    {
		        if ((arr[i] == arr[j]) && (i!=j)) 
		        {
		            count++ ;
		        }
		    }
		    if(count == 0)
	        {
	            System.out.print(arr[i]+" ");
	        }

		       
	}
	}
}