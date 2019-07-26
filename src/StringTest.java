
public class StringTest {

	public StringTest() {
	}
	
	@Override
	public String toString() {
		return "Pies";
	}
	
	public static void main(String[] args) {
		
		System.out.println(1 + 3 + "c");
		System.out.println("a" + 1 + 3);
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);
		
//		int fourInt = (int) four;
//		Integer fourInt = (Integer) four;
//		String threeString = (String) three;
//		String threeString2 = three;
		
		String threeString3 = ""+three;
		
		String s1 = "1";
		s1.concat("2");
		System.out.println("Concat: " + s1);
		
		StringTest object = new StringTest();
		
		String s2 = new String("Pies");
		String s3 = "Pies";
		String s4 = object.toString();
		
		System.out.println("aaa==aaa? " + (s2==s3));
		System.out.println("toString==aaa?" + s3==s4);//Co tu siê dzieje, ¿e znika napis?
		
		String aaa = "Hello";
		System.out.println(aaa=="Hello");
		
		//chatAt
		System.out.println("Trzecia litera s³owa pies to: " + s2.charAt(2));
		
		//indexOf
		System.out.println("Litera e znajduje siê na pozycji: " + s3.indexOf('e'));
		System.out.println("Litera e znajduje siê na pozycji: " + s3.indexOf("e"));
		System.out.println("Litera e znajduje siê na pozycji: " + s3.indexOf('e', 3));
		System.out.println("Litera e znajduje siê na pozycji: " + s3.indexOf('e', 2));
		System.out.println("Nie rzuca b³êdem!!: " + s3.indexOf('e', 5));

		//substring
		String s5 = "Alfabet";
		System.out.println(s5);
		System.out.println("Alfabet miêdzy 3-4: " + s5.substring(3, 4));
		System.out.println("Alfabet miêdzy 3-7: " + s5.substring(3, 7));
//		System.out.println("Alfabet miêdzy 3-8: rzuci b³êdem" + s5.substring(3, 8));
		System.out.println("Alfabet od litery l: " + s5.substring(s5.indexOf('l')));
		System.out.println("Alfabet miêdzy 3-3: " + s5.substring(3, 3));
//		System.out.println("alfabet miêdzy 3-2 rzuci b³êdem: " + s5.substring(3 , 2));
//		System.out.println("Alfabet od 10 w górê rzuci b³êdem: " + s5.substring(10));
		
		//toLowerCase
		
		String s6 = "ANImacja123";
		System.out.println("ANImacja123, ma³ymi literami to: " + s6.toLowerCase());
		
		
		//starts/endsWith
		
		System.out.println("\"abc\".startsWith(\"a\"): " + "abc".startsWith("a")); // true
		System.out.println("\"abc\".startsWith(\"A\"): " + "abc".startsWith("A")); // false
		System.out.println("\"abc\".endsWith(\"c\"): " + "abc".endsWith("c")); // true
		System.out.println("\"abc\".endsWith(\"a\"): " + "abc".endsWith("a"));
		
		//contains
		
		System.out.println("\"abc\".contains(\"b\"): "+ "abc".contains("b"));
		System.out.println("\"abc\".contains(\"B\"): "+ "abc".contains("B"));
		
		//replace
		String s7 = "Alfabet";
		System.out.println(s7.replace("a", "b"));
		System.out.println(s7.replace('a', 'b'));
//		System.out.println(s7.replace('a', "b")); //Musi  dwa razy CharSequence albo dwa razy char
		
		StringBuilder sb = new StringBuilder("b");
		System.out.println(s7.replace("a", sb));
		
		
		//trim
		
		System.out.println("\"abc\".trim(): " + "abc".trim());
		System.out.println("\" \\t    a   b  c \\n\".trim(): " + " \t    a   b  c \n".trim());
		System.out.println("\"ab  c\".trim(): " + "ab  c".trim());
		
		
		//method chaining
		
		String result = "AniMaL ".trim().toLowerCase().replace('a', 'A'); //ta linia tworzy 4 stringi
		System.out.println(result);
		
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7, 8));
		
	}
	

}
