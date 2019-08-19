package chapter5.inheritance;

public abstract class ClassO {
	public abstract String getName();
	
	public ClassO() {
		
	}
}

 abstract class BigCat extends ClassO {
	public String getName() {

		return "BigCat";
	}

	public abstract void roar();
}

 class Lion extends BigCat {
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}
 
 //Lion nie musi implementwaoæ getName();
 //Klasa abstrakcyjna mo¿e mieæ konstruktor