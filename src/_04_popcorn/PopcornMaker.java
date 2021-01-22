package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Popcorn popcorn = new Popcorn("salted");
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(4);
		microwave.startMicrowave();
		popcorn.applyHeat();
		popcorn.eat();
	}
	
	
}
