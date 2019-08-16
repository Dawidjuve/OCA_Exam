package test.book.chapter5;

 class Rodent {
	protected static Integer chew() throws Exception {
		System.out.println("Rodent is chewing");
		return 1;
	}
}

//public class Beaver extends Rodent {
//	public Number chew() throws RuntimeException {
//		System.out.println("Beaver is chewing on wood");
//		return 2;
//	}
//}

// 4. wybierz prawid³owe odpowiedzi
// A. It will compile without issue.
// B. It fails to compile because the type of the exception the method throws is a subclass of
// the type of exception the parent method throws.
// C. It fails to compile because the return types are not covariant.
// D. It fails to compile because the method is protected in the parent class and public in
// the subclass.
// E. It fails to compile because of a static modifier mismatch between the two methods.