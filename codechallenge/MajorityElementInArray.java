package codechallenge;

public class MajorityElementInArray {

	public static void main(String[] args) {
		int arr[] = {2,2,1}; 
		 int max = 0;  
		 int index = -1;
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;

		    for(int j=0; j<arr.length; j++) 
		    {
		        if ((arr[i] == arr[j])) 
		        {
		            count++ ;
		        }
		    }
		    if(count > max)  
	        {  
	            max = count;  
	            index = i;  
	        } 
		    }
		if (max > arr.length/2)  {
		    System.out.println ("Majority element in an array is "+arr[index]);  }
		    else {
		    System.out.println ("No Majority Element");  }
	       
	}
	
}
