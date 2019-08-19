package chapter4;

public class Constructors2 {
	String name;
	int age;
	final int a ;
	
	public Constructors2(int age) {
//		Constructors2(name); /1
		new Constructors2("ALA", age);
		this.a=4;
	}
	
	public Constructors2(String name) {
		this(name, 2);
//		this.a=4; //2
	}
	
	public Constructors2() {
//		System.out.println("START"); /3
		//comment is fine /3
		
		this("ALA", 2);
//		this.a=4; //2
		
	}
	
	public Constructors2(String name, int age) {
		this.name=name;
		this.age=age;
		this.a=4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors2 con = new Constructors2(2);
		System.out.println(con.name);
		
		Constructors2 con2 = new Constructors2("ALA");
		System.out.println(con2.a);
		
		
	}

}
