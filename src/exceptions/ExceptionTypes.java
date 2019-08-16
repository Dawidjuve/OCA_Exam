package exceptions;

public class ExceptionTypes {
	String name;
	
//	ExceptionInInitializerError
	
//	static
//	{
//		int[] countsOfMoose = new int[3];
//		int num = countsOfMoose[-1];
//	}

	public static void main(String[] args) {
		// ArithmeticException
//		int answer = 11 / 0;
//		double a = 11.0/0;
//		int b = 0/0;
		System.out.println(0.0/0);
		// ArrayIndexOutOfBoundsException

//		int[] countsOfMoose = new int[3];
//		System.out.println(countsOfMoose[-1]);

		// ClassCastException

//		String type = "moose";
//		Integer number = (Integer) type;

//		String type = "moose";
//		Object obj = type;
//		Integer number = (Integer) obj;

		// NullPointerException

//		new ExceptionTypes().printLength();
//		}

//		NumberFormatException

//		Integer.parseInt("aa");
		
		//***ERROR****
		
		//StackOverFlowError
//		doNotCodeThis(1);

	}

	public void printLength() throws NullPointerException {
		System.out.println(name.length());
	}
	
	public static void doNotCodeThis(int num) {
		doNotCodeThis(1);
		}
}
