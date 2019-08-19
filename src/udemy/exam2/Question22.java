package udemy.exam2;

import java.util.function.Predicate;

public class Question22 {
	public static void main(String[] args) {
		String[] arr = { "*", "**", "***", "****", "*****" };
//        Predicate pr1 = s -> s.length() < 4; //1
//        print(arr, pr1);

		Predicate pr2 = s -> s.equals("**");
		print2(arr, pr2);// 2
	}

//    private static void print(String [] arr, Predicate<String> predicate) {
//        for(String str : arr) {
//            if(predicate.test(str)) {
//                System.out.println(str);
//            }
//        }
//    }

	private static void print2(String[] arr, Predicate<String> predicate) {
		for (String str : arr) {
			if (predicate.test(str)) {
				System.out.println(str);
			}
		}
	}
}