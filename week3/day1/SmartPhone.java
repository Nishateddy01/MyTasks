package week3.day1;

public class SmartPhone extends AndroidPhone {
	public void takeVideo() {
		System.out.println("takeVideo from SmartPhone");
		}
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.takeVideo();

}
}
