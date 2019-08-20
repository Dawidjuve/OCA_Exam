package chapter6.exceptions;

public class PrintingException {

	public static void main(String[] args) {
		try {
			hop();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

}
