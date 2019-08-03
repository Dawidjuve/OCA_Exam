package inheritance;

public class ClassC {
	protected int age=2;
	

	public static void main(String[] args) {
		ClassD d = new ClassD();
		d.increaseAge();

	}

}

class ClassD extends ClassC{
	
	void increaseAge() {
		this.age+=2;
		ClassC c = new ClassC();
		c.age+=2;
		
		ClassD d = new ClassD();
		d.age+=2;
		
		System.out.println("this.age=" + this.age + " c.age = " + c.age + " d.age = " + d.age);
		
	}
}
