package week3.day1Assignment3;

public class Automation extends MultipleLanguage{

	

	@Override
	public void Selenium() {
		System.out.println("implemented from TestTool");		

	}

	@Override
	public void Java() {
	     System.out.println("implemented from Language");		

	}

	@Override
	public void ruby() {
		System.out.println("implemented from Language");		
		
	}
	public static void main(String[] args) {
		Automation at = new Automation();
		at.python();
		at.Selenium();
		at.python();
		at.Java();
		at.ruby();

	}

}
