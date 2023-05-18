package codechallenge;

public class NonRepeatCharFromString {

	public static void main(String[] args) {
		 String str = "leetcode";
	        System.out.println(repeatChar(str));
	    }
	
	    public static int repeatChar(String str){
	        int count = 0;
	        
	        char[] ch = str.toCharArray();
	        for(int i=0; i < ch.length; i++ ){
	            count=0;
	            
	            for(int j= 0; j< ch.length; j++){
	                if((i!=j)&&(ch[i] == ch[j])){
	                    count++;
	                }
	            }
	            if(count==0){
	                return i;
	            }
	        }
	        return -1;
	    }
	}



