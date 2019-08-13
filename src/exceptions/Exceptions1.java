package exceptions;

public class Exceptions1 {

	public Exceptions1() {
	}

	public static void main(String... args) {
		String[] animals = new String[0];
		System.out.println(animals[0]); // 1
	}

	public static void throwA() { // 4
		throw new RuntimeException("Ow! I fell.");
//		throw new RuntimeException("Ow! I fell."); //2
	}

	public static void throwB() throws Exception { // 3
		throw new Exception("Ow! I fell.");
	}

	public static void tryA() {
//		try
//		throw new Exception();
//		catch(Exception e) {
//			
//		}

	}

	public static void tryCatch() {
//		 try {
//			 throwA();
//			 } finally {
//			 System.out.println("all better");
//			 } catch (Exception e) {
//			 System.out.println("get up");
//			 }
//			
//			 try { 
//				 throwA();
//			 }
//			
//			 try {
//				 throwA();
//			  } finally {
//			  System.out.println("all better");
//			}
//		w której lini wyst¹pi b³¹d kompilacji?
	}
	
	public static void tryB() {
		try {
			throw new RuntimeException();
		}catch (RuntimeException e) {
			
		}
	}
	
	
	public static void tryCatchA() {
//		try {
//			throwA();
//		}catch (Exception e) {
//			// TODO: handle exception
//		}catch (RuntimeException e) {
//			// TODO: handle exception
//		}
	}
}
