package week1.day2;


public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 1;
		int i,j;
		String[] str = text.split(" ");
		for(i =0;i< str.length-1;i++)
		{
			for( j=i+1;j<str.length-1;j++)
			{
				if(str[i].equals(str[j]))
				{
	                count++;
				    str[j] = "";
                }	

			} 
			System.out.print(str[i]+ " ");
		}
		
			if(count>1) {
				System.out.print(str[i]+ " ");
			}				
			}
				
		
				
	}
	

