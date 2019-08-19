package chapter5.interfaces;

public interface InterfaceB {
	void doA();
	
//	String doB(); //2
	
	String doC(); //4
}

interface InterfaceC{
	void doA();
	
//	int doB(); //2
	int doC(String a); //4
}

 class ClassA implements InterfaceC, InterfaceB{
	 
//	 void doA() {}//3
	@Override
	public void doA() { //1
		
	}

//	@Override
//	public String doB() {//2
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	 public String doC() {return "aa";} //4
	 public int doC(String x) {return 1;} //4
}
 
 interface InterfaceD extends InterfaceB, InterfaceC{//2
	 
 }
 
 abstract class ClassB implements InterfaceC, InterfaceB{//2
	 
 }
 
// class ClassC implements InterfaceB, extends Object{
//	 
// }
 
 class classD extends Object implements InterfaceB{//5

	@Override
	public void doA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String doC() {
		// TODO Auto-generated method stub
		return null;
	}
	 
 }