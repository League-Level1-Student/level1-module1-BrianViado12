package _06_duck;

public class Coyote {
	int speed;
	String food;
	String habitat;
	void jump() {
		System.out.println("The Coyote ran " +speed + " mph and jumped");
	}
	void howl() {
		System.out.println("The Coyote howled");
	}
	
	Coyote(int speed, String food, String habitat){
		this.speed = speed;
		this.food = food;
		this.habitat = habitat;
	}
}
