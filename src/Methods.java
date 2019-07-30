
public class Methods {

	public int a = 3; 
	public int c = 4;
	public Methods() {
		
	}

	public static void main(String[] args) {
		walk(1);
		walk(1,2);
		walk(1,2,3,4,5);
//		walk(1, {1,123,4,1});
		walk(1, new int[3]);
		walk(1, new int[]{2,3,5});
//		walk(1, new Integer[] {2,4,5});
		
		Koala koala = new Koala();
		System.out.println("count = " + koala.count);
		koala.print();
		koala=null;
		System.out.println("count = " + koala.count);
		koala.print();
		
		
		Methods m = new Methods();
		m.assignA(10, 20);
		System.out.println("a = " + m.a + " c = " + m.c);
		
//		walk(null, null);
		walk(1, null);
		


	}

	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}

//	void public someMethod() {}

	public static final void walk3() {
	}

	public final static void walk4() {
	}

//	public void final walk6() {}
	final public void walk7() {
	}

	final public void walk1() {
		return;
	}

//	String walk6(int a) { if (a == 4) return ""; }
//	public void walk4(int a; int b) { }
	
	public void assignA(int a, int b) {
		a=a;
		c=b;
	}

}

class Koala{
	static int count = 0;
	
	public static void print() {
		System.out.println("print Koala");
	}
}
