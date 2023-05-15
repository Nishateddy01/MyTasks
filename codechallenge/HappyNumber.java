package codechallenge;

public class HappyNumber {
	

	public static void main(String[] args) {
		int num = 2;
		int sum = 0;
		int temp;
		 while(sum!=1 && sum!=4)
		  {
		   sum=0;
		  
		   while(num>0)
		   {
		    temp=num%10;
		    sum+=(temp*temp);
		    num=num/10;
		   }
		  
		    num=sum;
		  }
								
		if(sum == 1) {  			
			System.out.println("The number entered is a Happy Number");
        } else {
            System.out.println(" The number entered is not a Happy Number");
        }
		
		
		

	}
	}

