package chapter5.inheritance;

public class ClassJ {
	public static void eat() {
		System.out.println("Bear is eating");
	}

	public static void main(String[] args) {
		Panda.eat();
	}
}

class Panda extends ClassJ {
	public static void  eat() { // musi by� static i zwraca� void
		System.out.println("Panda bear is chewing");
		return;
	}

}