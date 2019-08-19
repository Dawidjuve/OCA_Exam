package chapter5.inheritance;

class ClassE {
	protected int size;
	private int age;

	public ClassE(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

class ClassF extends ClassE {
	private int numberOfFins = 8;

	public ClassF(int age) {
		super(age);
		this.size = 4;
	}

	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());
		System.out.println(super.getAge());
		System.out.println(this.getAge());
		
		System.out.print(" with " + numberOfFins + " fins");
		System.out.println(this.numberOfFins);
//		System.out.println(super.numberOfFins);
		
		System.out.print(" and " + size + " meters long");
		System.out.println(this.size);
//		this.size;
		System.out.println(super.size);
	}
}