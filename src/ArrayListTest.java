import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public ArrayListTest() {
	}

	public static void main(String[] args) {

		// Tworzenie

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		List<String> list6 = new ArrayList<>();
//		ArrayList<String> list7 = new List<>();

		// U¿ycie

		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.add(Boolean.TRUE); // [hawk, true]
		list.add(true);
		list.add(2);
		boolean a = false;
		list.add(a);
		System.out.println("list = " + list);

		// usuwanie

		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println("birds.remove(\"cardinal\") = " + birds.remove("cardinal"));
		System.out.println("birds.remove(\"hawk\") = " + birds.remove("hawk"));
		System.out.println("birds = " + birds);

		System.out.println("birds.remove(0) = " + birds.remove(0)); // prints hawk
		System.out.println("birds = " + birds);

//		System.out.println("birds.remove(2) = " + birds.remove(2));

		// set()

		System.out.println();
		ArrayList<String> list7 = new ArrayList<>();

		list7.add("hank");
		list7.add("anna");
		System.out.println("list7.set(1, \"barbara\") = " + list7.set(1, "barbara"));
		System.out.println(list7);

//		list7.set(10, "Jacula");

		System.out.println("list7.isEmpty() = " + list7.isEmpty());
		System.out.println("list7.size() = " + list7.size());

//		System.out.println(list7.clear());
		list7.clear();
		System.out.println("list7 after clear() = " + list7);
		System.out.println("list7.isEmpty() = " + list7.isEmpty());

		System.out.println("list.add(\"maurice\") = " + list7.add("maurice"));
		System.out.println("list.contains(\"maurice\") = " + list7.contains("maurice"));

		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();

		System.out.println("one.equals(two) = " + one.equals(two));

		String s1 = new String("aaa");
		String s2 = new String("aaa");
		one.add(s1);
		two.add(s2);

		System.out.println("one.equals(two) = " + one.equals(two));

		// wrapery
		System.out.println("\n--WRAPPERS--\n");

//		 Short b = Short.valueOf(1);
//		 Byte c = Byte.valueOf(2);
		Byte d = 4;
		Short e = 10;

		short f = 10;
		Short g = Short.valueOf(f);
		Short p = Short.valueOf("2");

//		 Float h = Float.valueOf(2.0);
		Float i = Float.valueOf(2.0F);
		Float m = Float.valueOf("2.0");
		Float n = Float.valueOf("2");
		Float o = Float.valueOf("2.0F");

		System.out.println("m = " + m + " n = " + n + " o = " + o);

		Integer j = Integer.parseInt("20");
		int k = Integer.parseInt("20");
//		 int l = Integer.parseInt("20.01");
//		 int l = (int) Integer.parseInt("20.01");
		int ³ = (int) Double.parseDouble("20.01");
//		 int bad1 = Integer.parseInt("a");

//		 int r = Integer.valueOf("2.0");

//		 Integer u = Integer.valueOf(null);

		// Autoboxing

		ArrayList<Double> list8 = new ArrayList<>();
//		 list8.get(0);
		list8.add(null);
		list8.get(0);

		Double s = list8.get(0);
//		 double t = list8.get(0);

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers);

		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(1);
		numbers2.add(2);
		numbers2.remove(new Integer(1));
		System.out.println(numbers2);

		List<Double> numbers3 = new ArrayList<>();
		numbers3.add(2.0);
		numbers3.add(60.0);
		numbers3.add(new Double(2.0));

		numbers3.remove(new Double(2.0));
		System.out.println("numbers3 = " + numbers3);

		System.out.println("\n---Konwersja lista - tablica---\n");

		List<String> list9 = new ArrayList<>();
		list9.add("hawk");

		list9.add("robin");
		Object[] objectArray = list9.toArray();
		System.out.println(objectArray.length); // 2
		String[] stringArray = list9.toArray(new String[0]);
		System.out.println(stringArray.length); // 2
		String[] stringArray2 = list9.toArray(new String[3]);
		System.out.println(stringArray2.length);

//		String[] stringArray3 = list9.toArray(new Integer[3]);

//		Integer[] intArray = list9.toArray(new Integer[3]);

		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list10 = Arrays.asList(array); // returns fixed size list
		System.out.println("list10.size() = " + list10.size()); // 2
		list10.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		System.out.println("list10 = " + list10);
		System.out.println("array = " + Arrays.toString(array));
//		list10.remove(1); 
//		list10.add("A");
		
		
//		List<Integer> list11 = Arrays.asList(array);

		
		List<String> list11 = Arrays.asList("one", "two");
//		list11.add("three");
		
		List<String> list12 = new ArrayList<>();
		list12.add("a"); list12.add("c"); list12.add("b");
//		list12.sort();
		Collections.sort(list12);
		System.out.println("list12 = " + list12);
		
		//Zadanie. 
		
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(x + " " + y + " " + z);
		
		
		
		List<String> names = new ArrayList<>();
		names.add("Janusz");
		names.add("Krystyna");
		names.add(null);
		for (String name : names) System.out.print(name);
		
		//Zadanie 2
		
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		ages.add(null);
		for (int age : ages) System.out.print(age);
		
	}

}
