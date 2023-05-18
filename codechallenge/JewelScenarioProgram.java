package codechallenge;

public class JewelScenarioProgram {

	public static void main(String[] args) {
		String jewel="aA";
		String stone="aAAbbbb";
		int num=0;
		
		for (int i = 0; i < stone.length(); i++) {
			for (int j = 0; j < jewel.length(); j++) {
				
				if(stone.charAt(i)==jewel.charAt(j)) {
					
					num++;
				}
					
				
			}
		
		}
		System.out.println(num);
	}
	}


