package exceptions;

public class Exceptions2 {

	public Exceptions2() {
	}

	public static void main(String[] args) {
		try {
			throwA();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(exceptions());
		System.out.println(10.0/0.0);
		double a = 10/0.0;
		System.out.println(a);
		System.out.println(a+4);
	}

	public static void throwA() throws Exception {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} finally {
			throw new Exception();
		}
	}

	public static void throwB() {
//		try {
//			throw new RuntimeException();
//		} finally {
//			throw new Exception();
//		}
	}

	public static String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
		}
		return result;
	}
}
