package chapter4;
import java.util.ArrayList;
import java.util.List;

public class Overloading {

	public Overloading() {
	}

	
	public void fly(int numMiles) { }
//	private static String fly(int xxx) {}
	
	public void fly(short numFeet) { }
	public boolean fly() { return false; }
	void fly(int numMiles, short numFeet) { }
	public void fly(short numFeet, int numMiles) throws Exception { }
	
	//varargs
	public void methodC(int[] lengths) { }
//	public void methodC(int... lengths) { }
	public void methodC(int x, int y) {System.out.println("without varargs");}
	public void methodC(int x, int... lenghts) {System.out.println("with varargs");}
	
	
	//autoboxing
	public void methodD(int x) {System.out.println("int");}
	public void methodD(Integer x) {System.out.println("Integer");}
	
	public ArrayList<String> methodA(int a) {return new ArrayList<String>();}
//	public ArrayList<Integer> methodA(int a) {return new ArrayList<String>();}
//	public List<String> methodA(int a) {return new ArrayList<String>();}
//	public Object methodA(int a) {return new ArrayList<String>();}
	
	
	
	public static void main(String[] args) {
		Overloading object = new Overloading();
		object.methodB(3);
		object.methodB((short)2);
		short a= 2;
		short b = 3;
		object.methodB(a*b);
		object.methodB(2*3);
//		short c = a * b ;
		short d = 2 * 3;
		
		object.methodC(1, 2);
		object.methodC(1, new int[] {1});
		
		object.methodD(1);
		object.methodD(Integer.valueOf(1));
		object.methodD(Integer.parseInt("1"));
		object.methodD(new Integer(1));
		//A co jeœli bêdzie istnieæ tylko jedna metoda methodD()?
		
		object.methodE("test");
		object.methodE(56);
		
		byte e = 2;
		object.methodF(e);
		long f = 2L;
//		object.methodG(f);
		
//		object.methodH(4);
	}
	
	public void methodB(int numMiles) {
		System.out.println("int");
		}
		public void methodB(short numFeet) {
		System.out.println("short");
		}
		
		
		public void methodE(String x) {System.out.println("String");}
		public void methodE(Object x) {System.out.println("Object");}
		
		public void methodF(long x) { System.out.println("long");}
		public void methodG(int x) { System.out.println("int");}
		
		public void methodH(Long x) {System.out.println("Long");}
		
		

}
