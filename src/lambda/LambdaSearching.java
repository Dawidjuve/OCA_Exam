package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaSearching {

	public LambdaSearching() {
	}

	public static void main(String[] args) {

		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		print(animals, a -> a.canHop());
		print(animals, (a) -> {
			return a.canHop();
		});
		print(animals, (a) -> a.canHop());
//		print(animals, (a)-> { a.canHop();});
//		print(animals, (a)-> return a.canHop(););
//		print(animals, (a)->  a.canHop(););
		print(animals, (a) -> {
			System.out.println();
			return a.canHop();
		});

		// Predicate & removeIf()

		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies); // [long ear, floppy, hoppy]
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies); // [hoppy]
	}

	public static void print(List<Animal> animals, CheckTrait x) {

		for (Animal animal : animals) {
			if (x.test(animal)) {
				System.out.println(animal);
			}
		}
	}
}

//Przyk³ady poprawnych zapisów wyra¿enia lambda

//3: print(() -> true); // 0 parameters
//4: print(a -> a.startsWith("test")); // 1 parameter
//5: print((String a) -> a.startsWith("test")); // 1 parameter
//6: print((a, b) -> a.startsWith("test")); // 2 parameters
//7: print((String a, String b) -> a.startsWith("test")); // 2 parameters

//Przyk³ady z³ych zapisów wyra¿enia lambda

//print(a, b -> a.startsWith("test")); // DOES NOT COMPILE
//print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE
//print(a -> { return a.startsWith("test") }); // DOES NOT COMPILE

//Nie mo¿na przeprowadzaæ ponownej deklaracji zmiennej w ciele wyra¿enia lambda

//(a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE
//(a, b) -> { int c = 0; return 5;} // COMPILE