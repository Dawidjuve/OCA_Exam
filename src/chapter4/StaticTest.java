package chapter4;

//import static java.util.Arrays;
import static java.util.Arrays.*;
import static java.util.Arrays.asList;
//static import java.util.Arrays.*;

import java.util.List;

public class StaticTest {
	private String name = "Static class";
	private final static int a = 5;
	private static int one;
	private static final int two;
	private static final int three = 3;
//	private static final int four;

	static {
		one = 1;
		two = 2;
//		three = 3; 
//		two = 4; 
	}

	public static void first() {
	}

	public static void second() {
	}

	public void third() {
		System.out.println(name);
	}

	public static void main(String args[]) {
		first();
		second();
//		third(); 

//		a=2;
		
		List<String> list = asList("aaa", "bbb");
//		List<String> list2 = Arrays.asList("aaa", "bbb");
	}
}