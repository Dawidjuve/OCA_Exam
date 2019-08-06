package inheritance;

public class ClassL {
	public static boolean isBiped() {//1
		return false;
	}

	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
	
	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
	}
}

class Kangaroo extends ClassL {
	public static boolean isBiped() {//1
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}


}
//Co siê wyœwietli?
//Co siê stanie jeœli metoda isBiped() bêdzie statyczna?