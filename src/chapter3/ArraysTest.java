package chapter3;
import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
	}

	public static void main(String[] args) {

		// inicjalizacja tablicy
		int[] array = new int[3];
		int[] array2 = { 3, 0, 2 };
//		int [] array4 = new int[3] {1,4,10};
		int[] array5 = new int[] { 1, 4, 10 };
		int[]array8 = { 1 }; // brak spacji w deklaracji
		int array3[] = new int[3];
//		int array14[] = new int {1, 4, 6};

		System.out.println("Domyœlna wartoœæ tablicy int[] = " + array3[1]);

		System.out.println("array3= " + array3);

		StringBuilder[] sbArray = { new StringBuilder() };
		ArraysTest arrayTestArray[] = new ArraysTest[2];// tablice mog¹ byæ dowolnego typu

		// Przypisanie nowej referencji do tablicy

		int[] array6 = { 1, 3, 5 };
		int[] array7 = new int[5];
		array6 = array7;
		array7[0] = 4;

		System.out.println("array6[0] = " + array6[0]);
		System.out.println("array7[0] = " + array7[0]);

		// Wielokrotna deklaracja

		int[] array9, array10;
		int array11[] = { 1 }, a1 = 2;

		// Referencje

		System.out.println("--REFERENCJE--");
		int array13[] = { 1, 4, 6 };
		int array12[] = array13;
		System.out.println("array13.equals(array12): " + array13.equals(array12));
		System.out.println("array13==array12: " + (array13 == array12));
		System.out.println("array13= " + array13);
		System.out.println("Arrays.toString(array3) = " + Arrays.toString(array13));
		System.out.println("array13.toString() = " + array13.toString());

		String[] stringArray = { "ala", "maciek" };
		System.out.println("stringArray.toString(): " + stringArray.toString());

		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
//		 againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
//		 objects[0] = new StringBuilder(); // careful!

		int intArray[] = { 2, 3 };
		short shortArray[] = { 4, 5 };

		intArray[1] = shortArray[1] ;
//		intArray=shortArray;

		// U¿ycie tablic

		System.out.println("\n--U¿ycie tablic--");
		String[] birds = new String[6];
		System.out.println("birds.length = " + birds.length);

		String[] stringArray2 = { "10", "9", "100" };
		System.out.print(" \"10\", \"9\", \"100\" po sortowaniu = ");
		Arrays.sort(stringArray2);
		for (String string : stringArray2)
			System.out.print(string + " ");

		// Wyszukiwanie

		System.out.println();
		int[] numbers = { 2, 4, 6, 8 };
		System.out.println("Arrays.binarySearch(numbers, 2) = " + Arrays.binarySearch(numbers, 2)); 
		System.out.println("Arrays.binarySearch(numbers, 4) = " + Arrays.binarySearch(numbers, 4)); 
		System.out.println("Arrays.binarySearch(numbers, 1) = " + Arrays.binarySearch(numbers, 1)); 
		System.out.println("Arrays.binarySearch(numbers, 3) = " + Arrays.binarySearch(numbers, 3)); 
		System.out.println("Arrays.binarySearch(numbers, 9) = " + Arrays.binarySearch(numbers, 9));
		
		System.out.println();
		System.out.println("3,2,1");
		
		int numbers3[] =  {3,2,1};
		System.out.println("Arrays.binarySearch(numbers3, 2) = " + Arrays.binarySearch(numbers3, 2));
		System.out.println("Arrays.binarySearch(numbers3, 3) = " + Arrays.binarySearch(numbers3, 3));
		
		//Varargs 
		
//		String ... argsa = {"a"};
//		public static void main(String... args) // 
//		args.length // poprawne u¿ycie!
		
		//Tablice wielowymiarowe
		
		System.out.println("\n--TABLICE WIELOWYMIAROWE--");
		
		int[][] vars1; // 2D array
		int vars2 [][]; // 2D array
		int[] vars3[]; // 2D array
		int[] vars4 [], space [][]; // a 2D AND a 3D array
		
		int [][] rectangle = new int[3][2];
		
		int count = 1; 
		for(int i = 0 ; i< rectangle.length ; i++) {
			System.out.println();
			for(int j = 0 ; j<rectangle[i].length ; j++) {
				rectangle[i][j] = count;
				count++;
				System.out.print(rectangle[i][j]);
			}
		}
		
		System.out.println("\nTablica wielowymiarowa");
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		
		count = 1; 
		for(int i = 0 ; i< differentSize.length ; i++) {
			System.out.println();
			for(int j = 0 ; j<differentSize[i].length ; j++) {
				differentSize[i][j] = count;
				count++;
				System.out.print(differentSize[i][j]);
			}
		}
		
		
		int[][] differentSize2 = new int[4][];
//		differentSize2[0] = {2,3};
//		differentSize2[1] = {5,9};
		differentSize2[2] = new int[3];
		differentSize2[2][0] = 1;
		
		Object[][][] cubbies = new Object[3][0][5];
//		cubbies[1][0][1] = new Object();
//		cubbies[1][0] = new Object[1];
		
		String [] names = {"Ala", "Jacula" , "Marian"};
//		List<String> listOfNames = names.asList();
		
		
	}

}
