package chapter4;
//Example 1

public class InitializationOrder {
	private String name = "Torchie";
	{
		System.out.println(name);
	}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);
	}
	{
		COUNT++;
		System.out.println(COUNT);
	}

	public InitializationOrder() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("read to construct");
		new InitializationOrder();
	}
}

//Example 2

//public class InitializationOrder {
//	static {
//		add(2);
//	}
//
//	static void add(int num) {
//		System.out.print(num + " ");
//	}
//
//	InitializationOrder() {
//		add(5);
//	}
//
//	static {
//		add(4);
//	}
//	{
//		add(6);
//	}
//	static {
//		new InitializationOrder();
//	}
//	{
//		add(8);
//	}
//
//	public static void main(String[] args) {
//	}
//}