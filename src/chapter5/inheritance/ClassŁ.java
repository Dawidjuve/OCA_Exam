package chapter5.inheritance;

public class Class£ {
	protected int tailLength = 4;

	public void getRodentDetails() {
		System.out.println("[parentTail=" + tailLength + "]");
	}
	
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
		System.out.println(mouse.tailLength);
		
		Class£ mouse2 = new Mouse();
		mouse2.getRodentDetails();
//		mouse2.getMouseDetails();
		System.out.println(mouse2.tailLength);
	}
}

class Mouse extends Class£ {
	protected int tailLength = 8;

	public void getMouseDetails() {
		System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
	}


}
//Co siê wyœwietli?4,8,4,8,,,,4,4