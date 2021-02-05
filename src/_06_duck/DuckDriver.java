package _06_duck;

public class DuckDriver {
	public static void main(String[] args) {
		Duck duck = new Duck("Donuts", 5);
		System.out.println(duck.favoriteFood);
		duck.quack();
	}
}
