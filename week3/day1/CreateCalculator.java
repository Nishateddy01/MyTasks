package week3.day1;

public class CreateCalculator {
	//----------------Method Overloading-------------------------//
	public void add(int a, int b) {
		System.out.println(a+b+" ");
		
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c+" ");
		
	}
	public void mul(double a, double b) {
		System.out.println(a*b+" ");
		
	}
	public void mul(float a, float b) {
		System.out.println(a*b+" ");
		
	}

	public static void main(String[] args) {
		CreateCalculator cal = new CreateCalculator();
		cal.add(23, 45);
		cal.add(78, 90, 20);
		cal.mul(2.3, 4.5);
		cal.mul(78.01f, 90.20f);


	}

}
