package week3.day1;

public class OnePlus extends Samsung{
	public void features()
	{
		System.out.println("Features of own method-OnePlus");
	}
	public static void main(String[] args) 
	{
		OnePlus op = new OnePlus();
		op.openApp();
		op.playVideo();
		op.features();		
	}
	}
		
	
	


