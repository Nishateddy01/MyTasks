package week1.day1;
public class PrintFibonacciNos {

	public static void main(String[] args) {
		int firstNo = 0, secNo = 1;
		int sum;
		for (int i = 1; i <= 11; i++) {
			sum = firstNo+secNo;
			System.out.println("Fibonacci no's for 1 to 11 are :  "+ firstNo );
			firstNo = secNo;
			secNo = sum;
		}			
	}

}
