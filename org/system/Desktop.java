package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("desktopSize from Desktop");
	}

	public static void main(String[] args) {
		//-----------------Single Inheritance Assignment 1--------------------//
		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize();
	}

}
