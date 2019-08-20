package chapter2;

public class Statements {

	public Statements() {
	}

	public static void main(String[] args) {

		boolean a = true;
		if (a == true)

			System.out.println("a");

		///

		if (a == false)

			System.out.println("b");

		else

			System.out.println("else b");

		////

//		if(a==false)
//
//			System.out.println("b");
//			System.out.println("another line ");
//
//		else {
//			System.out.println("else b");

		//////

		int hourOfDay = 10;
		if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if (hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE BUT IT WILL COMPILE
		} else {
			System.out.println("Good Evening");
		}

		/////////////////////////

//		int x = 1;
//		if(x = 5) { // DOES NOT COMPILE
//		
//		}

		////

		if (a == true)
			System.out.println("1");
		System.out.println("2");
		System.out.println("3");

		/////
		int y = 4;
		System.out.println((y > 5) ? 21 : "Zebra");
//		int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE

		/////

		int c = 1;
		int d = 1;
		final int e = c < 10 ? c++ : d++;
		System.out.println("c= " + c + "," + "d= " + d + ",e = " + e);

		/////
		final int f = 5;
		;
		int dayOfWeek = 5;
		switch (dayOfWeek) {

		case 0:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Weekday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case f:
			System.out.println("f");
		}

		////

		switch (dayOfWeek) {

		case (int) 0.0:
			System.out.println("Sunday");
			break;
		}

		///

		final int g = 2;
		short dayOfWeek2 = 5;
		switch (dayOfWeek2) {
		default:
			System.out.println("Weekday");
			break;
		case g:
			System.out.println("Sunday");
			break;
		}

		////

//		int h = 4;
//		switch (dayOfWeek) {
//		default:
//			System.out.println("Weekday");
//			break;
//		case h:
//			System.out.println("Sunday");
//			break;
//		}

		///
		System.out.println("-----------------");

		int dayOfWeek3 = 5;
		switch (dayOfWeek3) {
		case 0:
			System.out.println("Sunday");
		default:
			System.out.println("Weekday");
//			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

		///

		System.out.println("-----------------dayOfWeek4");

		int dayOfWeek4 = 5;
		switch (dayOfWeek4) {
		case 5:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Weekday");
//			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

		///

		System.out.println("-----------------dayOfWeek5");

		int dayOfWeek5 = 5;
		switch (dayOfWeek5) {

		default:
			System.out.println("Weekday");
//			break;
		case 5:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

		/////

		System.out.println("-----------------dayOfWeek6");

		int dayOfWeek6 = 5;
		switch (dayOfWeek6) {

		}

		///////

//	do {
//		System.out.println("ssss");
//	}while();

		/////
		int h = 1;
		do
			System.out.println("ss");

		while (false);

		///

//		do {
//			int i = 1;
//			System.out.print(y++ + " ");
//		} while (i <= 10);

		final char j = 'A', k = 'D';
		char grade = 'B';

		switch (grade) {
		case j: // Mo¿e byæ puste i bez œrednika
		case 'B':
			System.out.print("great");
		case 'C':
			System.out.print("good");
			break;
		case k:
			; // Mo¿e byæ te¿ puste ze œrednikiem
		case 'F':
			System.out.print("not good");
		}

	}

//	private int getSortOrder(String firstName, final String lastName) {
//		String middleName = "Patricia";
//		final String suffix = "JR";
//		int id = 0;
//		switch (firstName) {
//		case "Test":
//			return 52;
//
//		case middleName: // DOES NOT COMPILE
//			id = 5;
//			break;
//		case suffix:
//			id = 0;
//			break;
//		case lastName: // DOES NOT COMPILE
//			id = 8;
//			break;
//
//		}
//		return id;
//	}

//	private int getSortOrder(String firstName, final String lastName) {
//		String middleName = "Patricia";
//		final String suffix = "JR";
//		int id = 0;
//		switch (firstName) {
//		case 'J': // DOES NOT COMPILE
//			id = 10;
//			break;
//		case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
//			id = 15;
//			break;
//		}
//		return id;
//	}
}
