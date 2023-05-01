package week1.day2;

public class CalculatorMethod {
	int c;
	public int getAdd(int a, int b)
	{
	    c = a+b;
		return c;
	}

	public int getMul(int a, int b)
	{
		c = a*b;
		return c;
	}
	public void getSub()
	{
        System.out.println("Substraction");	
    }


	public static void main(String[] args) {
		CalculatorMethod cm = new CalculatorMethod();
		System.out.println(cm.getAdd(2,3));
		cm.getSub();
		System.out.println(cm.getMul(2, 4));
 
	}

}
