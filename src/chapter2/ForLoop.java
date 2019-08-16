package chapter2;

public class ForLoop {

	public ForLoop() {
	}

	public static void main(String[] args) {

//		for(int a =2, int b = 3, int c =4; a<c; a++) {
//			
//		}

		for (int a = 2, b = 3, c = 4; a < c; a++, b--) {

		}

//		for(;;);
//		for(;);
//		for();

		int g = 0;
//		for (long f = 0, g = 4; g < 5 && f < 10; g++, f++) { // DOES NOT COMPILE
//			System.out.print(g + " ");
//		}

		// Powy¿szy przyk³ad mo¿na naprawiæ nastêpuj¹co:
		long f;
		for (f = 0, g = 4; g < 5 && f < 10; g++, f++) { // DOES NOT COMPILE
			System.out.print(g + " ");

		}

		for (int i = 2; i < 4; i++) {
			System.out.println(i);
		}
//		System.out.println(i);

		int h;
		for (h = 0; h < 2; h++) {
			System.out.println("W pêtli: " + h);
		}
		System.out.println("Za pêtl¹: " + h);

		java.util.List<String> names = new java.util.ArrayList<String>();
		names.add("Lisa");
		names.add("Kevin");
		names.add("Roger");
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(name);
		}

		sINGLE_LOOP

		: for (int i = 1; i > 2; i++) {

		}

		single_while: do
			System.out.println("single while");
		while (false);

		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}

		boolean j = true;

		iflabel: if (1 == 2) {

			break iflabel;

		}

//		if(j) {
//			if(1==2) {
//				break;
//			}
//		}

		//////////////

		for (int i = 0; i < 10;) {
			i = i++;
			System.out.println("Hello World");
		}
	}

}
