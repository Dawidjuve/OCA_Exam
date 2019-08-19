package chapter5.inheritance;

public class ClassI {
	private String getNumberOfHumps() {
		return "Undefined";
	}
}

 class BactrianCamel extends ClassI {
	private int getNumberOfHumps() { //to nie jest nadpisanie metody.
		return 2;
	}
}