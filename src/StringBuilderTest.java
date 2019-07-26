
public class StringBuilderTest {

	public StringBuilderTest() {
	}

	@Override
	public String toString() {
		return "StringBuilderTest []";
	}

	public static void main(String[] args) {

		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		StringBuilder c = b.append("f").append("g"); // dadaje fragment tekstu o obiektu na, którym zosta³a wywo³ana i
														// dodatkowo zwraca referencjê do tego obiektu.
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		///

		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder('a');
		StringBuilder sb3 = new StringBuilder(10); // pojemnoœæ-zarezerwowane miejsce
		StringBuilder sb4 = new StringBuilder("a");

		sb3.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); // nie powoduje przepe³nienia mimo zadeklarowanej
																	// pojemnoœci

		System.out.println(sb3);

		String sub = sb3.substring(0, 5); // Zwraca String!
		System.out.println(sub + " " + sb3);

		/// append

		System.out.println();
		System.out.println("APPEND");

		StringBuilder sb5 = new StringBuilder().append(10).append(true).append(3.7F).append("END");
		System.out.println(sb5);

		StringBuilderTest sbt = new StringBuilderTest();
		StringBuilder sb6 = new StringBuilder().append(sbt);
		System.out.println(sb6);

		// insert

		System.out.println();
		System.out.println("INSERT");

		StringBuilder sb7 = new StringBuilder("animals");
		sb7.insert(7, "-"); // sb = animals-
		sb7.insert(0, "-"); // sb = -animals-
		sb7.insert(4, "-"); // sb = -ani-mals
		System.out.println(sb7);
		
		// delete

		System.out.println();
		System.out.println("DELETE");
		
		StringBuilder sb8 = new StringBuilder("abcdef");
		sb8.delete(1, 3); // sb = adef
		sb8.deleteCharAt(0);
//		sb8.deleteCharAt(3); //Rzuci wyj¹tek
		
		String string = sb8.toString()	;
		
		//Equality
		
		System.out.println();
		System.out.println("EQUALITY");
		StringBuilder one = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println("one == three? " + (one == three));
		
		String x = "Hello World";
		String z = " Hello World".trim(); //Poniewa¿ nie s¹ takie same w momencie kompilacji - tworzony jest nowy obiekt
		System.out.println("trim : " + (x == z)); 
		
		
		String s1 = "Hello World";
		String s2 = " Hello World".substring(1);
		System.out.println("substring: " + (s1==s2));
		
		String s3 = "Hello World";
		String s4 = " Hello World".trim();
		System.out.println("trim equals: " + x.equals(z));
		
		StringBuilderTest sbt1= new StringBuilderTest();
		StringBuilderTest sbt2 = new StringBuilderTest();
		System.out.println("sbt1.equals(sbt2): " + sbt1.equals(sbt2));
		
		StringBuilder sb9 = new StringBuilder("aaa");
		StringBuilder sb10 = new StringBuilder("aaa");
		System.out.println("sb9.equals(sb10) = " + sb9.equals(sb10));
		System.out.println("sb9.toString().equals(sb10.toString()) = " + sb9.toString().equals(sb10.toString()));
		System.out.println("sb9.toString()==sb10.toString() = " + sb9.toString()==sb10.toString());
		System.out.println("sb9.toString()==sb10.toString() = " + (sb9.toString()==sb10.toString()));
		
		String aaa = "Hello";
		System.out.println(aaa=="Hello");
	}

}
