package inheritance;

public class ClassA {

	ClassA(String a, String b) { // 1

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ClassB extends ClassA {

//	ClassB(String a, String b){//2
//		
//	}

	ClassB() {
		super("a", "b");
	}
}

