package chapter5.polymorphism;

public class Polimorfizm {

	
	public static final void main(String...strings ) {
		
		//Rzutowanie
		String a = new String("a");
//		StringBuilder b = (StringBuilder) a;
		
		Polimorfizm poli = new Polimorfizm();
		
		ClassA classA = (ClassA) poli;
	}
}

class ClassA extends Polimorfizm{
	
}
