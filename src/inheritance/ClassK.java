package inheritance;

public class ClassK {
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}

	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

class Pandaa extends ClassK {
//public void sneeze() { // DOES NOT COMPILE
//System.out.println("Panda bear sneezes quietly");
//}
//public static void hibernate() { // DOES NOT COMPILE
//System.out.println("Panda bear is going to sleep");
}