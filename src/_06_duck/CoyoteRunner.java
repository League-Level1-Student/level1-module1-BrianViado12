package _06_duck;

public class CoyoteRunner {
	public static void main(String[] args) {
		Coyote coyote = new Coyote(40, "Rabbit", "Desert");
		System.out.println(coyote.food);
		coyote.jump();
	}
}
