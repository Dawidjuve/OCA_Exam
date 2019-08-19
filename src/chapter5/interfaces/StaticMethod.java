package chapter5.interfaces;

public interface StaticMethod {
	
	public static void doA() {
		System.out.println("interface method doA");
	}
	
	static void doB() {
		
	}

}

interface InterfaceO extends StaticMethod{
	
	
}

class ClassE implements StaticMethod{
	
	
	public static void doA() { //2
		System.out.println("Class method doA");
	}

	
//	static final void main(String...args) { //1
//		StaticMethod.doA();
//		InterfaceO.doA();
//		ClassE.doA();
//		
//		ClassE ce = new ClassE();
//		ce.doA();
//		
//		StaticMethod sm = new ClassE();
//		sm.doA();
//		
//		System.out.println(doB());
//	}
}